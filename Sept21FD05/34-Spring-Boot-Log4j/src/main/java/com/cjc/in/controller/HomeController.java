package com.cjc.in.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.service.XYZService;

@RestController
public class HomeController {

	
	
	  Logger  logger = LoggerFactory.getLogger(HomeController.class);
	
	    @Autowired
	    private XYZService service ; 
	
	@RequestMapping("/check")
	public String check() {
		   logger.info("HomeController :: check handller called");
		return "This is First Handller";
	}
	
	@RequestMapping("/getData")
	public List<String> getData() {
		   logger.trace("AAAAAAAA");
		  logger.info("HomeController :: getData called");
		return service.getData();
	}
}

