package com.javaknowledge.collectionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TofinfNumberwith2letterNumberinAnArrayUsingJava8 {
	
	
	// program
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the numbers :");
		
		
		int[] numbers={20,25,34,89,97,25,55,77,85};
		
		List<String> collect = Arrays.stream(numbers).boxed()
				.map(a->a+"")
				.filter(akhila->akhila.startsWith("3"))
				.collect(Collectors.toList());

		
	
		
		
		System.out.println(" These are the elements starts with '2' number :"+collect);
	}

}
