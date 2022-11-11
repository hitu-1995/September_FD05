package com.cjc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	
	@Autowired
	private SessionFactory sessionf;
	

	public void saveStudent(Student student) {
		
	System.out.println("Dao method called");
		
		Session session = sessionf.openSession();
		
		session.save(student);
		
		session.beginTransaction().commit();
		
		
	}


	public List<Student> selectAllStudent(String uname, String pass) {
		
		Session session = sessionf.openSession();
		
		if(uname.equals("shubh")&&pass.equals("shubh")) {
		    
	    	Query query = session.createQuery("from Student");
	    	List<Student> stuList = query.getResultList();
	    	
	    	 return stuList;
	    }
		
		return new ArrayList<Student>();
	
		
	}

}
