package com.springmvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	

}
