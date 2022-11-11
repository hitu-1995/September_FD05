package com.cjc.in.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Student;
import com.cjc.in.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Map<String, Student> getAllStudents(String uname, String pass) {
	
		return repository.getAllStudents(uname , pass);
	}

	
}
