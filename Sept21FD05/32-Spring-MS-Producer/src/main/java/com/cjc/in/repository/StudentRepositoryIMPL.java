package com.cjc.in.repository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Student;

@Repository
public class StudentRepositoryIMPL implements StudentRepository{

	public Map<String, Student> getAllStudents(String uname , String pass) {
		
        if(uname.equals("admin")&&pass.equals("admin")) {
        
        	Map<String, Student> map = new HashMap<String, Student>();
    		map.put("s1", new Student(101,"ABC","Pune","A"));
    		map.put("s2", new Student(102,"XYZ","Mumbai","A"));
    		map.put("s3", new Student(103,"LMN","Nashik","A"));
    		map.put("s4", new Student(104,"PQR","Dhule","A"));
    		
    		return map;
        }		
        return null;
	}
}
