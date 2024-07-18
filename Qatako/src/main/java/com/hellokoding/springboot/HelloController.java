package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
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
