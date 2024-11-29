package com.student.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {

	public String bookName;
	public String bookAuthor;
	public LocalDate bookPublishedDate;

}
