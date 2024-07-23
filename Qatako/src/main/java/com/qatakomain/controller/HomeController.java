package com.qatakomain.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qatakomain.service.SEMAService;

@Controller
public class HomeController {
	
	@Autowired
	private SEMAService semaAPI;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Map<String, String> year = semaAPI.getYear();
		model.addAttribute("years", year);
		return "index";
	}

	@RequestMapping(path = "/shopping", method = RequestMethod.GET)
	public String shopping() {
		return "shopping";
	}

	@RequestMapping(path = "/product", method = RequestMethod.GET)
	public String product() {
		return "product";
	}
}
