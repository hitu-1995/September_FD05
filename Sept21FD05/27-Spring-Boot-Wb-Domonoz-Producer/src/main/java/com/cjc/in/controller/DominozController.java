package com.cjc.in.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.DominozDTO;

@RestController
@RequestMapping("/dominozApi")
public class DominozController {

	@GetMapping("/checkD")
	public ResponseEntity<String> chekDominoz() {
	
		return new ResponseEntity<String>("DOMINOZ IS OPEN FOR ORDER",HttpStatus.OK);
	}
	
	@GetMapping("/getMenuListDominoz")
	public ResponseEntity<List<DominozDTO>> getDominozList() {
	
		List<DominozDTO> list=Arrays.asList(new DominozDTO(101, "Akurdi", "Pizza", 199),
				                            new DominozDTO(102,"Akurdi","Chies Pizza",299));
		
		return new ResponseEntity<List<DominozDTO>>(list, HttpStatus.ACCEPTED);
	}

}
		