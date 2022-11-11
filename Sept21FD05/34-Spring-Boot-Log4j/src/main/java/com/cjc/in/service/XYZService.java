package com.cjc.in.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class XYZService {

	  Logger logger = LoggerFactory.getLogger(XYZService.class);
	  
	public List<String> getData() {
  
		    logger.info("XYZService :: getData called");  
		    List<String> list = Arrays.asList("PQR","ABC","XYZ");
		    
		       if(list.size()<=3) {
		    	   logger.warn("XYZService :: getData List Has 3 or Less elements ");
		       }
		       else {
		    	   
		    	   logger.info("XYZService :: getData List has sufficient elements");
		       }
		    
		    
		  return list;
	}

}
