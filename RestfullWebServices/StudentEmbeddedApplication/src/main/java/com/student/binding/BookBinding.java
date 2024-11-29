package com.student.binding;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBinding {

	public String bookName;
	public String bookAuthor;
	public LocalDate bookPublishedDate;

}
