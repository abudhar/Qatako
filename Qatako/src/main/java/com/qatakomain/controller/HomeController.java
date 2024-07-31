package com.qatakomain.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qatakomain.model.Home;
import com.qatakomain.model.ModelList;
import com.qatakomain.model.Partbrands;
import com.qatakomain.model.ProductBean;
import com.qatakomain.service.SEMAService;

@Controller
public class HomeController {
	
	@Autowired
	private SEMAService semaAPI;
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Map<String, String> year = semaAPI.getYear();
		model.addAttribute("years", year);
        model.addAttribute("logoNames", semaAPI.getlogoNames());
		return "index";
	}

	@RequestMapping(path = "/shopping", method = {RequestMethod.GET, RequestMethod.POST})
	public String shopping(@ModelAttribute Home home, Model model, HttpSession session) {
		model.addAttribute("years", semaAPI.getYear());
		semaAPI.setDropdowns(home, model, session);
		model.addAttribute("home", home);
//		ModelList modelList = semaAPI.getModel(home, session);
//		int baseVehicleID = modelList.getModels()
//				.stream()
//				.filter(t -> home.getModel().equals(""+t.getModelID())).collect(Collectors.toList())
//				.stream()
//				.findFirst()
//				.get()
//				.getBaseVehicleID();
//		List<Partbrands> products = semaAPI.getProducts("171628");
		ProductBean product = semaAPI.getProduct();
		return "shopping";
	}
	
	@RequestMapping(path = "/product", method = RequestMethod.GET)
	public String product() {
		return "product";
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
