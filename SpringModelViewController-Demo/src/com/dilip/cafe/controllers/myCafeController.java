package com.dilip.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class myCafeController {
	
	
	@RequestMapping("/cafe")
	public String welcome()
	{
		
		return "welcome-page";                //view
	}
	
	@RequestMapping("/processTheOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		
		String userFood = request.getParameter("userEnteredFood");
		model.addAttribute("userFoodData", userFood);   //Model
		System.out.println(userFood);
		return "process-order";
	}

}
