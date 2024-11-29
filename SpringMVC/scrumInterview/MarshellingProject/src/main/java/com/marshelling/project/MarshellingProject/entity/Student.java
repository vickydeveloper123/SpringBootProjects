package com.marshelling.project.MarshellingProject.entity;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@Entity

@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
@Table(name = "student_marshelling")
public class Student {
	@Id
	private Integer studentId;
	private String studentName;
	private Integer studentRank;

	private Address address;
	private String branch;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRank=" + studentRank
				+ ", address=" + address + ", branch=" + branch + "]";
	}

	

	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Integer getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(Integer studentRank) {
		this.studentRank = studentRank;
	}
    

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}

}
