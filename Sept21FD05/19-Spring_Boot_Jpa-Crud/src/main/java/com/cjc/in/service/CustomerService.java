package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.in.dao.CustomerRepository;
import com.cjc.in.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.dialect.MySQL5Dialect;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public void check() {

	}

	private void selectByMobileNo() {
		Customer customer = repository.findByMobileno(87696l);
		 System.out.println(customer);
	}

	private void selectAllbyProduct() {
		List<Customer> list = repository.findAllByProduct("Mobile");
       	for (Customer cust : list) {
       		System.out.println("---------------------------------------------------------");
			System.out.println(cust);
		}
	}

	private void deleteCustomer() {
		int cid=105;
		 repository.deleteById(cid);
		 System.out.println("*** Record Deleted ***");
	}

	private void selectAllSpecificIdCustomers() {
		List<Integer> ids = Arrays.asList(102,103,104);
		 
           List<Customer> list = repository.findAllById(ids);
           
       	for (Customer cust : list) {
       		System.out.println("---------------------------------------------------------");
			System.out.println(cust);
		}
	}

	private void selectAllCustomer() {
		List<Customer> list = repository.findAll();

		for (Customer cust : list) {
			System.out.println(cust);
		}
	}

	private void selectSingle() {
		Optional<Customer> optional = repository.findById(101);
		if (optional.isPresent()) {
			Customer customer = optional.get();
			System.out.println(customer);
		}
	}

	private void insertMultipleCustomer() {
		List<Customer> list = Arrays.asList(new Customer(105, "Chirag", "Nigadi", "Charger", 87698776),
				new Customer(106, "Ankit", "Chikhali", "Mobile", 87654345),
				new Customer(107, "Shweta", "Ravet", "TV", 874564345));
		repository.saveAll(list);
		System.out.println("*** Multiple Customer Inserted ***s");
	}

	private void insertCustomer() {
		Customer customer = new Customer();
		customer.setCid(102);
		customer.setCname("Yogesh");
		customer.setProduct("Laptop");
		customer.setAddress("Pimpri");
		customer.setMobileno(94567567);
		repository.save(customer);
		System.out.println("*** Record Inserted ***");
	}
}
