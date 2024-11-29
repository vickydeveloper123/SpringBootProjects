package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import jakarta.xml.bind.annotation.XmlRootElement;*/


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)

@Table(name = "student")
public class Student {

	@Id
	private Integer studentId;
	private String studentName;
	private String studentLocation;
	private Integer studentAge;

}