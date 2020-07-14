package com.dilip.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	
	@RequestMapping("/test")
	public String testMethod() {
		
		return "hello-page";
	}

}
