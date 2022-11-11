package com.cjc.in.service;

import java.util.List;

import com.cjc.in.model.Student;

public interface StudentService {

	void saveStudent(Student stu);

	List<Student> getStudentByLessMarks(double marks);

}
