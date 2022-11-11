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
	
	@Override
	public void saveStudent(Student student) {
		
		dao.saveStudent(student);
		
	}

	@Override
	public List<Student> selectAllStudent(String uname, String pass) {
		
		List<Student> stuList = dao.selectAllStudent(uname,pass);
		
		return stuList;
	}

	@Override
	public Student editStudent(int rollno) {
		
		Student stu=dao.editStudent(rollno);
		
		return stu;
	}

	@Override
	public List<Student> updateStudent(Student student) {
		
	List<Student> stuList=dao.updateStudent(student);
		return stuList;
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
		
		
		return dao.deleteStudent(rollno);
	}


}
