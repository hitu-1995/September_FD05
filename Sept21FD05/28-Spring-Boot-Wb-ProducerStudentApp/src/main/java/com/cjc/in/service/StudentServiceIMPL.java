package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Student;
import com.cjc.in.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public void saveStudent(Student student) {

		repository.save(student);

	}

	@Override
	public void deleteStudent(int rollno) {
		repository.deleteById(rollno);

	}

	@Override
	public void updateData(Student student) {
		repository.save(student);
		
	}

}
