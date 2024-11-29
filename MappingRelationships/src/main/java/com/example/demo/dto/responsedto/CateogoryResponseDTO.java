package com.example.demo.dto.responsedto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CateogoryResponseDTO {
	
	private Long id;
	
	private String name;
	
	private List<String> names=new ArrayList<>();
	
	

}
