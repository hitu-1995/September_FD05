package com.cjc.in.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	List<Customer> findbyProduct(String string);

	
}
