package com.cjc.in.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer>{

}
