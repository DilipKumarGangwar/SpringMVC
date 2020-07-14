package com.dilip.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class loveCalculatorApplicationInitialiser_Approach2
		extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	      
		Class [] arr = {loveCalculatorApplicationConfig.class};  
		return arr;
	}

	@Override
	protected String[] getServletMappings() {


		String[] arr = {"/"};
		return arr;
	}

}
