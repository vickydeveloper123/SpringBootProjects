package com.student.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
	
	@Id
	//@GeneratedValue(generator = "book_id_generator")
	//@GenericGenerator(name = "book_id_generator", strategy = "com.student.generator.BookIdGenerator")
	@Column(name = "Book_Id", nullable = false, updatable = false)
	public Integer bookId;
	public String bookName;
	public String bookAuthor;
	
	@CreationTimestamp
	public LocalDate bookPublishedDate;

}
