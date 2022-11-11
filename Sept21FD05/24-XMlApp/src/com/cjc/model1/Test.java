package com.cjc.model1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class Test {

	public static void main(String[] args) throws JAXBException {
		Student stu=new Student();
		stu.setRollno(101);
		stu.setName("Hites");
		stu.setAddress("Pune");
		stu.setMarks(50.4);
		stu.setAge(26);
		
		List<Book> books=new ArrayList<Book>();
		Book b=new Book();
		b.setBid(1);
		b.setBname("JAVA");
		Book b1=new Book();
		b1.setBid(2);
		b1.setBname("CPP");
		
		books.add(b);
		books.add(b1);
		
		stu.setBooks(books);
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller marshaller =	context.createMarshaller();
        marshaller.marshal(stu, new File("student1.xml"));
     
        System.out.println("File Created");
	}
}
