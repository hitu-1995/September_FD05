package com.cjc.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addApi")
public class AdmissionController {

	  @GetMapping("getAddmission")
	  public String checkAdmission() {
		
		  return "Welcome To Addmission Service";
	}
	
}
