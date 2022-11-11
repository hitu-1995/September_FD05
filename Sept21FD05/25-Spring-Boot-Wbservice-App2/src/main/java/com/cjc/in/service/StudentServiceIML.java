package com.cjc.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Student;
import com.cjc.in.repository.StudentRpository;

@Service
public class StudentServiceIML implements StudentService{

	@Autowired
	private StudentRpository repo;
	
	@Override
	public void saveStudent(Student stu) {
		
		repo.save(stu);
	}

	@Override
	public List<Student> getStudentByLessMarks(double marks) {
		
		return repo.findByMarksLessThan(marks);
	}

}
