package com.cjc.in.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.in.model.DominozDTO;

@RestController
@RequestMapping("/swiggyApi")
public class SwiggyController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/checkS")
	public ResponseEntity<String> checkS() {
		
		return new ResponseEntity<String>("Swiggy App is Running !!!",HttpStatus.OK);
	}
	
	@GetMapping("/getSwiggyDominozMenu")
	public ResponseEntity<List> getSwiggyDominozMenu() {
		
		String url="https://data.covid19india.org/v4/min/data.min.json";
		
		List list = template.getForObject(url, List.class);
		
		return new ResponseEntity<List>(list,HttpStatus.OK);
	}
	

}
			