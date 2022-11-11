package com.cjc.in.exceptionhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cjc.in.exceptions.EmployeeNotFoundException;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

	Logger LOGGER = LoggerFactory.getLogger(MyExceptionHandler.class);
	
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String>  nullPinterException() {
	

	      LOGGER.error("NullPointerException .........");
		return new ResponseEntity<String>("Please insert Three Digit ID only",HttpStatus.BAD_REQUEST);
	
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String>  employeeNotFoundException() {
		
		return new ResponseEntity<String>("Employee Record Not Found for this ID",HttpStatus.NOT_FOUND);
	}

  		   
	
	
}
