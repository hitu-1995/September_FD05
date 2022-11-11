package com.cjc.in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Student;

@Repository
public interface StudentRpository extends JpaRepository<Student, Integer>{

      List<Student> findByMarksLessThan(double marks);	
}
