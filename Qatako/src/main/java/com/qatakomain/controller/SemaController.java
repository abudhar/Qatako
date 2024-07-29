package com.qatakomain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qatakomain.model.Home;
import com.qatakomain.model.MakeList;
import com.qatakomain.model.ModelList;
import com.qatakomain.model.SubModelList;
import com.qatakomain.service.SEMAService;

@RestController
@RequestMapping("/semaAPI")
public class SemaController {
	
	@Autowired
	private SEMAService semaAPI;
	
	@RequestMapping(value = "/makeList", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
    public MakeList getMake(@RequestBody Home home) {
        return semaAPI.getMake(home);
    }
	
	@RequestMapping(value = "/modelList", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public ModelList getModel(@RequestBody Home home) {
		return semaAPI.getModel(home);
	}
	
	@RequestMapping(value = "/subModelList", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public SubModelList getSubModel(@RequestBody Home home) {
		return semaAPI.getSubModel(home);
	}
	
}
