package com.cjc.in.repository;

import java.util.HashMap;
import java.util.Map;

import com.cjc.in.model.Student;

public interface StudentRepository {

	public Map<String, Student> getAllStudents(String uname, String pass) ;	
}
