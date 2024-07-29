package com.qatakomain.service;


import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qatakomain.model.Home;
import com.qatakomain.model.MakeList;
import com.qatakomain.model.ModelList;
import com.qatakomain.model.Product;
import com.qatakomain.model.ProductBean;
import com.qatakomain.model.SubModelList;
import com.qatakomain.model.Years;

@Service
public class SEMAService {
	
	@Autowired
	private SemaTokenManager tokenManager;
	
	@Autowired
	private RestTemplate semaAPI;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	static Logger logger = LoggerFactory.getLogger(SEMAService.class);

	public Map<String, String> getYear(){
		Map<String, String> result = new LinkedHashMap<>();
		Years response = null;
		response = getJsonData("years.json", Years.class);
		if(response == null) {
			response = semaAPI.getForObject(SemaTokenManager.baseURL + "/lookup/years?token="+tokenManager.getToken(), Years.class);
		}
		for(int year: response.getYears()) {
			result.put(""+ year, ""+ year);
		}
		return result;
		
	}
	
	
	public ProductBean getProduct() {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("token", tokenManager.getToken());
        formData.add("PIESVersion", "6.7");
        formData.add("AAIA_BrandId", "BBVR");

        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(formData, headers);

        ResponseEntity<Product> response = semaAPI.postForEntity(SemaTokenManager.baseURL +"/export/piesexport", requestEntity, Product.class);
        String piesexport = response.getBody().getPiesexport();
        
		return xmlToBean(piesexport);

	}
	
	public MakeList getMake(Home home) {
		logger.info("Entered MakeList API : {}", home.getYear());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/makes", 
				"token", tokenManager.getToken(),
				"year", home.getYear());
		logger.info("Url : {}", url);
		return semaAPI.getForObject(url, MakeList.class);
	}
	
	public ModelList getModel(Home home) {
		logger.info("Entered ModelList API : {}, {}", home.getYear(), home.getMakeId());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/models", 
				"token", tokenManager.getToken(),
				"year", home.getYear(),
				"makeid", home.getMakeId());
		logger.info("Url : {}", url);
		return semaAPI.getForObject(url, ModelList.class);
	}
	
	public SubModelList getSubModel(Home home) {
		logger.info("Entered SubModelList API : {}, {}, {}", home.getYear(), home.getMakeId(), home.getModelId());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/submodels", 
				"token", tokenManager.getToken(),
				"year", home.getYear(),
				"modelid", home.getModelId(),
				"makeid", home.getMakeId());
		logger.info("Url : {}", url);
		return semaAPI.getForObject(url, SubModelList.class);
	}
	
	public <T> T getJsonData(String jsonName, Class<T> returnType) {
        Resource resource = resourceLoader.getResource("classpath:data/" + jsonName);
        try (InputStream inputStream = resource.getInputStream()) {
            return objectMapper.readValue(inputStream, returnType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	
	private static ProductBean xmlToBean(String xmlString) {
		logger.info("xml : {}", xmlString);
		ProductBean result = new ProductBean();
		JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
        String jsonPrettyPrintString = xmlJSONObj.toString();
        RestTemplateConfig.toBean(xmlJSONObj, result);
		logger.info("Json : {}", jsonPrettyPrintString);
		return result;
	}
	
	public static String buildUrl(String baseUrl, String... params) {
        StringBuilder url = new StringBuilder(baseUrl);
        if (params.length % 2 != 0) {
            throw new IllegalArgumentException("Parameters should be in key-value pairs");
        }
        if (baseUrl.charAt(baseUrl.length() - 1) != '?') {
            url.append('?');
        }
        for (int i = 0; i < params.length; i += 2) {
                String key = params[i];
                String value = params[i + 1];
                url.append(key).append('=').append(value);

                if (i < params.length - 2) {
                    url.append('&');
                }
        }
        return url.toString();
    }


}
