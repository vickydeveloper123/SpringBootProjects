package com.example.demo.dto.responsedto;

import java.util.List;

import lombok.Data;

@Data
public class AuthorResponseDTO {
	
	private Long id;
	private String 	name;
	private List<String> bookNames;
	private String zipcodeName;

}
