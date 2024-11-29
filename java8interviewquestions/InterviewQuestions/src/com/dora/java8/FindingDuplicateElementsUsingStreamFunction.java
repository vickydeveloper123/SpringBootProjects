package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingDuplicateElementsUsingStreamFunction {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 2, 8);

		List<Long> collect = numbers.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()))
				.entrySet() // Here the set stores the values which it counts.
				.stream() // here it stores the the values of the numbers.
				.filter(entry -> entry.getKey() > 1) // Here the data has been filtered.
				.map(Map.Entry::getValue) // Here we can get the value.
				.collect(Collectors.toList());
		System.out.println( 
				 "Original Numbers in String :" + numbers+"\n"+"Removing all duplicate elements in a string :" + collect);

//        		Original Numbers in String :[1, 2, 3, 4, 5, 3, 2, 6, 7, 2, 8]
//        				Removing all duplicate elements in a string :[3, 2, 1, 1, 1, 1, 1]

	}

}
