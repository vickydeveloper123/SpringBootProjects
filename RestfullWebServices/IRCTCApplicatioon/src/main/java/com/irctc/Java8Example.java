package com.irctc;

import java.util.Arrays;

public class Java8Example {
	
	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5};
		
//		int count=0;
//		for(int valuesAdding:num) {
//			System.out.println("-------------------");
//			System.out.println("Values in the array "+valuesAdding);
//			System.out.println("-------------------");
//			System.out.println("                                ");
//
//			System.out.println("Values  in the array :"+count);
//
//			count=count+valuesAdding;
//		}
//		System.out.println("Values added in the array :"+count);
//	}
		
		System.out.println("--------- By using Stream Operations ---------------");
		
		int reduce = Arrays.stream(num).reduce(0, (q,w)->q+w);
		System.out.println("Using reduce method in the stream we are doing addition operation :"+"\n"+reduce);
	}

}