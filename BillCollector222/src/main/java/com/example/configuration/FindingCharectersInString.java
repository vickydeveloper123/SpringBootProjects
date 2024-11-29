package com.example.configuration;

import java.util.stream.Collectors;

public class FindingCharectersInString {
	
	public static void main(String[] args) {
		
		String charectersList="abbc";
		
		/*
		 * string.charecters().mapTo (c->c).collect(Collectors.groupBy(c.count()))
		 * .forEach(c);
		 */
		
		charectersList.chars().mapToObj(vignesh->(char)vignesh)

		.collect(Collectors.groupingBy(vignesh->vignesh,Collectors.counting()))
		.forEach((charecter,counting)->System.out.println(charecter+"="+counting));
		
		
		  
		
	}
	

}
