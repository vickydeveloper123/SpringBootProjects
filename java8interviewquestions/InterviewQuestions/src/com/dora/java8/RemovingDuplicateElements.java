package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElements {
	
	
	public static void main(String[] args) {
		Integer[] refernce1= {1,2,2,3,4,7,5,8,5,4,4,9,9,9,9,1,1,2,2,5};
		Integer[] duplicateElements = Arrays.stream(refernce1)
				                     .distinct()
				                     .toArray(Integer[] ::new);
		System.out.println("Array Without duplicates :"+Arrays.toString(duplicateElements));
		
		System.out.println("-------------Removing Duplicate Elemets using List --------------------");
		
		List<Integer> listIntegers= Arrays.asList( 1,2,2,3,4,7,5,8,5,4,4,9,9,9,9,1,1,2,2,5);
		List<Integer> collect = listIntegers.stream().distinct().collect(Collectors.toList());
		System.out.println("Removing Duplicate elements in the list :"+collect);
		
		
		

	}

}