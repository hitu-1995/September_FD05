package com.cjc.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flipkartOrder")
public class OrderController {

	@GetMapping("/getOrder")
	public ResponseEntity<String> getOrder() {
		
		return new ResponseEntity<String>("OrderController :: Works Fine !!",HttpStatus.OK );
	}
}
