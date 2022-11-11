package com.cjc.in.service;

import java.util.Map;

import com.cjc.in.model.Student;

public interface StudentService {

	public Map<String, Student> getAllStudents(String uname , String pass);
}
