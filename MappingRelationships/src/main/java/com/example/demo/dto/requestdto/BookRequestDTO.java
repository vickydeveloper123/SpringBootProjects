package com.example.demo.dto.requestdto;

import java.util.List;

import lombok.Data;

@Data
public class BookRequestDTO {
	
	private String name;
	private List<Long> authorId;
	private Long CateogoryId;
	
	

}