package com.example.demo.dto.responsedto;

import java.util.List;

import lombok.Data;

@Data
public class BookResponseDTO {
	
	
		private Long id;
		private String name;
		private List<String> authorNames;
		private String cateogoryName;
		
	

}