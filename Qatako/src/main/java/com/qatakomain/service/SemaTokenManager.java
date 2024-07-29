package com.qatakomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qatakomain.model.SemaToken;

@Service
public class SemaTokenManager {
	
	private String token;
	
	static final String baseURL = "https://apps.semadata.org/sdapi/v2"; 
	
	@Value("${semaapi.tokenUserName}")
	private String userName;
	
	@Value("${semaapi.tokenPass}")
	private String userPass;
	
	@Autowired
	private RestTemplate semaAPI;

	public String getToken() {
		if(token == null) {
			SemaToken response = semaAPI.getForObject(baseURL +"/token/get?userName="+userName+"&password="+userPass, SemaToken.class);
			if(response.isStatus()) {
				token = response.getToken();
			}
		}
		return token;
	}
	
	
	

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
