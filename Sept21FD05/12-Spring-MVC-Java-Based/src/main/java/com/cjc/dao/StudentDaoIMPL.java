package com.cjc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	 private SessionFactory factory; 
	

	public void saveStudent(Student student) {
		
		Session session = factory.openSession();
		
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("Dao SaveStudent() complete");
		
	}

	public List<Student> selectAllStudent(String uname, String pass) {
		Session session = factory.openSession();
		
	    if(uname.equals("admin")&&pass.equals("admin")) {
	    
	    	Query query = session.createQuery("from Student");
	    	List<Student> stuList = query.getResultList();
	    	
	    	 return stuList;
	    }
		
		return new ArrayList<Student>();
	}

	public Student editStudent(int rollno) {
		
		  Session session = factory.openSession();
		  Student student = session.get(Student.class, rollno);
		return student;
	}

	public List<Student> updateStudent(Student student) {
	
		   Session session = factory.openSession();
		   Transaction tx = session.beginTransaction();
		   session.update(student);
		   tx.commit();
    
		  Transaction tx1 = session.beginTransaction();
		  Query query = session.createQuery("from Student");
		  List<Student> list = query.getResultList();
		   tx1.commit();
		
		return list;
	}

	public List<Student> deleteStudent(int rollno) {
		
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery("delete Student where rollno=:rn");
	query.setParameter("rn", rollno);
	query.executeUpdate();
	tx.commit();
	
	  Transaction tx1 = session.beginTransaction();
	  Query query1 = session.createQuery("from Student");
	  List<Student> list = query1.getResultList();
	   tx1.commit();
		return list;
	}

}
