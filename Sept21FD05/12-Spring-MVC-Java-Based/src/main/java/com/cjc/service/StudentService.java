package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	void saveStudent(Student student);

	List<Student> selectAllStudent(String uname, String pass);

	Student editStudent(int rollno);

	List<Student> updateStudent(Student student);

	List<Student> deleteStudent(int rollno);
}
