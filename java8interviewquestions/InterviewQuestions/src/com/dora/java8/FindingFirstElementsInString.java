package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingFirstElementsInString {
	
	public static void main(String[] args) {
		
		
        List<Integer> numbers = Arrays.asList(0,10, 15, 8, 49, 25, 98, 98, 32, 0);
        
        boolean present = numbers.stream().findFirst().isPresent();
        System.out.println(present);
        
        Optional<Integer> first = numbers.stream().findFirst();
        
        if(first.isPresent()) {
        	System.out.println(first.get());
        }
        
        // Here in the list of an array we are going the check the value of an integer is present or not .
        // if it is present we are going to print the values.

	}

}
