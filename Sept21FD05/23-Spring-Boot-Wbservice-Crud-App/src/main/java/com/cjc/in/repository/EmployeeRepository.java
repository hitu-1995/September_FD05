package com.cjc.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Employeee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employeee,Integer>{

}
