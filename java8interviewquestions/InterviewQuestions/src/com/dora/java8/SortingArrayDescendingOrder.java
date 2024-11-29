package com.dora.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrayDescendingOrder {
	
	
	public static void main(String[] args) {
		
		
        Integer[] numbers = {10, 45, 23, 78, 5, 90, 12};

        List<Integer> collect = Arrays.stream(numbers).sorted().collect(Collectors.toList());
        System.out.println("Elements sorted in an array    :"+ collect);
        
        //The above is descending order.
        
        List<Integer> collect1 = Arrays.stream(numbers).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Elements sorted reversed array :"+ collect1);
        
        // The above is ascending order.
        
	}
	
	

}