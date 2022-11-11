package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{

	  @Autowired
	 private StudentDao dao;

	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}

	public List<Student> selectAllStudent(String uname, String pass) {
		
		return dao.selectAllStudent(uname,pass);
	}

	public Student editStudent(int rollno) {
		
		return dao.editStudent(rollno);
	}

	public List<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}

	public List<Student> deleteStudent(int rollno) {
		
		return dao.deleteStudent(rollno);
	}



}
