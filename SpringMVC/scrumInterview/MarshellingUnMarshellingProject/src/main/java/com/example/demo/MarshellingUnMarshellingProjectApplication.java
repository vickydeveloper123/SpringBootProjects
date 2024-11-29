package com.example.demo;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@SpringBootApplication
public class MarshellingUnMarshellingProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MarshellingUnMarshellingProjectApplication.class,
				args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		List<Student> studentList = studentRepo.findAll();

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			for (Student student : studentList) {
				marshaller.marshal(student, System.out); 
				marshaller.marshal(student, new File("student_" + student.getStudentId() + ".xml"));
			}
		} catch (JAXBException e) {
			System.err.println("Error occurred during JAXB marshalling: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
			e.printStackTrace();
		}

	}

}