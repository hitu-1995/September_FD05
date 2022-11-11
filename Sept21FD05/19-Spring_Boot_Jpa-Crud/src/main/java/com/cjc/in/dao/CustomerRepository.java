package com.cjc.in.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Customer;

@Repository                                         
public interface CustomerRepository
        extends JpaRepository<Customer,Integer>{

	    List<Customer> findAllByProduct(String productName);
	    
	    Customer findByMobileno(long mob);
	   
}   
