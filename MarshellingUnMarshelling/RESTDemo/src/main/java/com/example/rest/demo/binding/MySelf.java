package com.example.rest.demo.binding;

import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

@XmlAccessorType
@Data
public class MySelf {
	
	public String myName;
	public Integer myAge;
	public String JobName;
	public String location;
	

}
