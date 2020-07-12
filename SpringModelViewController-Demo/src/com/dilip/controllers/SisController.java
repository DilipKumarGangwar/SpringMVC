package com.dilip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@RequestMapping("/makeup")
	public String giveMakeUp(){
		
		return "viewmakeup";
	}

	@ResponseBody
	@RequestMapping("/books")
	public String getBooks() {
		
		return "ok..here are books";
	}
}
