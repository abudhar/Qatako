package com.qatakomain.controller;

import javax.servlet.http.HttpSession;

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
    public MakeList getMake(@RequestBody Home home, HttpSession session) {
		session.setAttribute("year", home.getYear());
        return semaAPI.getMake(home, session);
    }
	
	@RequestMapping(value = "/modelList", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public ModelList getModel(@RequestBody Home home, HttpSession session) {
		session.setAttribute("year", home.getYear());
		session.setAttribute("make", home.getMake());
		return semaAPI.getModel(home, session);
	}
	
	@RequestMapping(value = "/subModelList", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public SubModelList getSubModel(@RequestBody Home home, HttpSession session) {
		session.setAttribute("year", home.getYear());
		session.setAttribute("make", home.getMake());
		session.setAttribute("model", home.getModel());
		return semaAPI.getSubModel(home, session);
	}
	
}
