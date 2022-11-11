package com.cjc.in.dao;

import org.springframework.data.repository.CrudRepository;

import com.cjc.in.model.Employee;

public interface EmployeeDao  extends CrudRepository<Employee, Integer>  {

}
