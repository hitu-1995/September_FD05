package com.cjc.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.*;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws Exception {

		List<Book> blist = new ArrayList<Book>();
		Book b1 = new Book();
		b1.setBid(1);
		b1.setBname("ABC");
		Book b2 = new Book();
		b2.setBid(2);
		b2.setBname("PQR");

		blist.add(b1);
		blist.add(b2);

		Student stu = new Student();
		stu.setRollno(101);
		stu.setName("HHHH");
		stu.setMarks(56);
		stu.setAge(26);
		stu.setAddress("Pune");
		stu.setBooks(blist);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("student.json"), stu);
		System.out.println("Check");
	}

	private static void jasonToObject() throws IOException, StreamReadException, DatabindException {
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(student);
	}

	private static void objectToJson() throws Exception {
		Student stu = new Student();
		stu.setRollno(111);
		stu.setName("Hitesh");
		stu.setAddress("Pune");

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("student.json"), stu);
		System.out.println("Json File Created");
	}
}
