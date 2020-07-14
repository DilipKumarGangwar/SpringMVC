package com.dilip.lc.config;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class loveCalculatorApplicationInitialiser implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		//System.out.println("Hello....");
		
		//This is for XML way application Config 
		/*
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		*/
		
		
		//For java Way
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(loveCalculatorApplicationConfig.class);
		
		//create Dispatcher Servlet object and initialise webApplicationContext
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
	    ServletRegistration.Dynamic servDynamic = servletContext.addServlet("mydispatcherservlet", dispatcherServlet);
		
	    servDynamic.setLoadOnStartup(1);
	    servDynamic.addMapping("/");
		
		

	}

}
