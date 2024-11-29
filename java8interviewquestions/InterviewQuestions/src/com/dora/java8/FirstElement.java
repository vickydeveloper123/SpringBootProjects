package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstElement {
	
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
	        Integer firstElement = findFirstElement(numbers);
	        System.out.println("First Element: " + firstElement);
	        
	        
	        
	       
	}
	        
	        
	        
	    

	    public static Integer findFirstElement(List<Integer> numbers) {
	        return numbers.stream()
	                .findFirst()
	                .orElse(null);
	    }

	    
	    
	   



}
