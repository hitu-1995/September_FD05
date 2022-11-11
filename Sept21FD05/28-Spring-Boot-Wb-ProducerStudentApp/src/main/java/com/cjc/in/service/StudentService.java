package com.cjc.in.service;

import com.cjc.in.model.Student;

public interface StudentService {

	void saveStudent(Student student);

	void deleteStudent(int rollno);

	void updateData(Student student);

}
