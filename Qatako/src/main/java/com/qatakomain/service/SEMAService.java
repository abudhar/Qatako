package com.qatakomain.service;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

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
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qatakomain.model.BranddatasetsList;
import com.qatakomain.model.Home;
import com.qatakomain.model.Make;
import com.qatakomain.model.MakeList;
import com.qatakomain.model.ModelList;
import com.qatakomain.model.Partbrands;
import com.qatakomain.model.Product;
import com.qatakomain.model.ProductBean;
import com.qatakomain.model.ProductList;
import com.qatakomain.model.SubModelList;
import com.qatakomain.model.Submodel;
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
	
	public ProductBean getProductDetails(String partNumber, String brandId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
		formData.add("token", tokenManager.getToken());
		formData.add("PIESVersion", "6.7");
		formData.add("AAIA_BrandId", brandId);
		formData.add("partNumbers", partNumber);
		
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(formData, headers);
		
		ResponseEntity<Product> response = semaAPI.postForEntity(SemaTokenManager.baseURL +"/export/piesexport", requestEntity, Product.class);
		String piesexport = response.getBody().getPiesexport();
		return xmlToBean(piesexport);
		
	}
	
	public List<Partbrands> getProducts(String baseVehicleId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
		formData.add("token", tokenManager.getToken());
		formData.add("BaseVehicleID", baseVehicleId);
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(formData, headers);
		
		ResponseEntity<ProductList> response = semaAPI.postForEntity(SemaTokenManager.baseURL +"/lookup/productsbyvehicleengine", requestEntity, ProductList.class);
		List<Partbrands> piesexport = response.getBody().getPartbrands();
		piesexport = piesexport.stream().limit(10).collect(Collectors.toList());
		piesexport.forEach(product -> {
			product.setPiesDetails(getProductDetails(product.getPartnumber(), product.getBrandaaiaid()));
		});
		return piesexport;
		
	}
	
	public ArrayList<String> getBrands() {
		String url = buildUrl(SemaTokenManager.baseURL + "/export/branddatasets", 
				"token", tokenManager.getToken());
		logger.info("Url : {}", url);
		BranddatasetsList brandDataList = semaAPI.getForObject(url, BranddatasetsList.class);
		ArrayList<String> brands = new ArrayList<>();
		brandDataList.getBranddatasets().stream().forEach(brand -> { brands.add(brand.getAaiabrandid());});
		return brands;
	}
	
	public MakeList getMake(Home home, HttpSession session) {
		logger.info("Entered MakeList API : {}", home.getYear());
		logger.info("Entered MakeList API : {}", home.getYear());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/makes", 
				"token", tokenManager.getToken(),
				"year", home.getYear());
		logger.info("Url : {}", url);
		MakeList makeList = semaAPI.getForObject(url, MakeList.class);
		Map<String, String> map = new LinkedHashMap<>();
		for(Make make: makeList.getMakes()) {
			map.put(""+make.getMakeID(), make.getMakeName());
		}
		session.setAttribute("makeList", map);
		return makeList;
	}
	
	public ModelList getModel(Home home, HttpSession session) {
		logger.info("Entered ModelList API : {}, {}", home.getYear(), home.getMake());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/models", 
				"token", tokenManager.getToken(),
				"year", home.getYear(),
				"makeid", home.getMake());
		logger.info("Url : {}", url);
		Map<String, String> map = new LinkedHashMap<>();
		ModelList modelList = semaAPI.getForObject(url, ModelList.class);
		for(com.qatakomain.model.Model models: modelList.getModels()) {
			map.put(""+models.getModelID(), models.getModelName());
		}
		session.setAttribute("modelList", map);
		return modelList;
	}
	
	public SubModelList getSubModel(Home home, HttpSession session) {
		logger.info("Entered SubModelList API : {}, {}, {}", home.getYear(), home.getMake(), home.getModel());
		String url = buildUrl(SemaTokenManager.baseURL + "/lookup/submodels", 
				"token", tokenManager.getToken(),
				"year", home.getYear(),
				"modelid", home.getModel(),
				"makeid", home.getMake());
		logger.info("Url : {}", url);
		Map<String, String> map = new LinkedHashMap<>();
		SubModelList subModelList = semaAPI.getForObject(url, SubModelList.class);
		for(Submodel subModels: subModelList.getSubmodels()) {
			map.put(""+subModels.getSubmodelID(), subModels.getSubmodelName());
		}
		session.setAttribute("subModelList", map);
		return subModelList;
	}
	
	
	public List<String> getlogoNames() {
		String logosPath = "src/main/webapp/images/logos";
        File folder = new File(logosPath);
        File[] listOfFiles = folder.listFiles();

        List<String> logoNames = new ArrayList<>();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    logoNames.add(file.getName().replaceFirst("[.][^.]+$", "")); // Remove file extension
                }
            }
        }
		return logoNames;
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
        logger.info("Json : {}", jsonPrettyPrintString);
        try {
        	ObjectMapper objectMapper = new ObjectMapper();
    		return objectMapper.readValue(jsonPrettyPrintString, ProductBean.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
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


	@SuppressWarnings("unchecked")
	public void setDropdowns(Home home, Model model, HttpSession session) {
		Map<String, String> map = new LinkedHashMap<>();
		map = session.getAttribute("makeList") != null ?(Map<String, String>) session.getAttribute("makeList") : null;
		if(home.getYear() != null && map == null) {
			map = new LinkedHashMap<>();
			MakeList makeList = getMake(home, session);
			for(Make make: makeList.getMakes()) {
				map.put(""+make.getMakeID(), make.getMakeName());
			}
		}
		model.addAttribute("makeList", map);
		if(validateStrings(home.getMake())) {
			String makeLogo  = isNumeric(home.getMake())?map.get(home.getMake()).toLowerCase()+".png":home.getMake()+".png";
			model.addAttribute("logo", makeLogo);
		}
		map = new LinkedHashMap<>();
		map  = session.getAttribute("modelList") != null ?(Map<String, String>) session.getAttribute("modelList") : null;
		if(home.getYear() != null && home.getMake() != null && map == null) {
			map = new LinkedHashMap<>();
			ModelList modelList = getModel(home, session);
			for(com.qatakomain.model.Model models: modelList.getModels()) {
				map.put(""+models.getModelID(), models.getModelName());
			}
		}
		model.addAttribute("modelList", map);
		map = new LinkedHashMap<>();
		map  = session.getAttribute("subModelList") != null ?(Map<String, String>) session.getAttribute("subModelList") : null;
		if(home.getYear() != null && home.getMake() != null && home.getModel() != null && map == null) {
			map = new LinkedHashMap<>();
			SubModelList subModelList = getSubModel(home, session);
			for(Submodel subModels: subModelList.getSubmodels()) {
				map.put(""+subModels.getSubmodelID(), subModels.getSubmodelName());
			}
		}
		model.addAttribute("subModelList", map);
	}

	public static boolean isNumeric(String str) { 
	  try {  
	    Double.parseDouble(str);  
	    return true;
	  } catch(NumberFormatException e){  
	    return false;  
	  }  
	}
	
  public static boolean validateStrings(String... inputStrings) {
        for (String inputString : inputStrings) {
            if (inputString == null || inputString.trim().isEmpty() || "select".equalsIgnoreCase(inputString.trim())
                    || "null".equalsIgnoreCase(inputString.trim())) {
                return false;
            }
        }
        return true;
    }

}
