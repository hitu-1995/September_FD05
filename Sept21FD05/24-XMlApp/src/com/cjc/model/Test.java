package com.cjc.model;
import java.io.File;
import javax.xml.bind.*;
public class Test {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Student.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File("student.xml"));
		Student stu1=(Student)object;
		System.out.println(stu1);
		System.out.println("Ok");
		
	}

	private static void ObjectToXML() throws JAXBException {
		Student stu=new Student();
		stu.setRollno(101);
		stu.setName("Hites");
		stu.setAddress("Pune");
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller marshaller   =	context.createMarshaller();
                           marshaller.marshal(stu, new File("student.xml"));
     
            System.out.println("File Created");
	}
}
