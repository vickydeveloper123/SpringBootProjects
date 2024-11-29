package com.marshelling.project.MarshellingProject;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.marshelling.project.MarshellingProject.entity.Address;
import com.marshelling.project.MarshellingProject.entity.Student;

public class Marshelling {
    public static void main(String[] args) throws JAXBException {
        
        // Creating the address object
        Address address = new Address();
        address.setCity("Hyderabad");
        address.setState("Telangana");
        address.setCountry("India");

        // Creating the student object
        Student student = new Student();
        student.setStudentId(101);
        student.setStudentName("Mahesh");
        student.setStudentRank(147);
        student.setAddress(address);
        student.setBranch("CSE");

        // Creating JAXB context and marshaller
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        // Marshalling student object to XML
        marshaller.marshal(student, System.out);
        marshaller.marshal(student, new File("student.xml"));
    }
}
