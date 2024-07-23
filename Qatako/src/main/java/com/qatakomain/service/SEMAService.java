package com.qatakomain.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	
	public <T> T getJsonData(String jsonName, Class<T> returnType) {
        Resource resource = resourceLoader.getResource("classpath:data/" + jsonName);
        try (InputStream inputStream = resource.getInputStream()) {
            return objectMapper.readValue(inputStream, returnType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
