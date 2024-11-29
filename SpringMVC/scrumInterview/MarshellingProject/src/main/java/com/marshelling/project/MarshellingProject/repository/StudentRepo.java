package com.marshelling.project.MarshellingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marshelling.project.MarshellingProject.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
