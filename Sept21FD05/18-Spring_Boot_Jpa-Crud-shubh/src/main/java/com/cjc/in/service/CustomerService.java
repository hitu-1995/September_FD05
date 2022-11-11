package com.cjc.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.dao.CustomerDao;
import com.cjc.in.model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	
	
	public void check() {
		
		List<Customer> findbyProduct = dao.findbyProduct("laptop");
		
		System.out.println(findbyProduct);

	
	}


	private void deleteCustomer() {
		dao.deleteById(103);
		
		System.out.println("Delete id of Param");
	}


	private void specificId() {
		Optional<Customer> id = dao.findById(103);	
		
		System.out.println(id);
	}


	private void selectAllRecord() {
		List<Customer> list = dao.findAll();
		
		for (Customer customer : list) {
			
			System.out.println(customer);
			
		}
	}


	private void insertValue() {
		Customer cs= new Customer();
		
		cs.setCid(102);
		cs.setCname("shubham");
		cs.setAddress("pimpri");
		cs.setProduct("headphone");
		
		dao.save(cs);
		
		System.out.println("insert value");
	}
	
	

}
