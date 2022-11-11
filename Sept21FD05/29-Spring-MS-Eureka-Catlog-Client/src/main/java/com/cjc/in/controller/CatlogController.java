package com.cjc.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flipkartCatlog")
public class CatlogController {

	@GetMapping("/getCatlog")
	public ResponseEntity<String> getCatlog() {
		
		return new ResponseEntity<String>("CatlogController :: Works Fine !!",HttpStatus.OK);
	}
}
