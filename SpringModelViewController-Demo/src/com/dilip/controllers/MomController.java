package com.dilip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
   @ResponseBody
	@RequestMapping("/")
	public String welcome() {
		
		//System.out.println("hello");
		return "Welcome to home";
	}
   
   
	//@RequestMapping(value = "/sugar", method = RequestMethod.GET)
   
   @ResponseBody
   @RequestMapping("/sugar")
	public String giveSugar() {
		
		//System.out.println("hello");
		return "Take Sugar";
	}

}