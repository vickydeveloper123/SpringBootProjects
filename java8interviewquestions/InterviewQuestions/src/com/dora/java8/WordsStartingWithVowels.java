package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartingWithVowels {
	
public static void main(String[] args) {
	
	
	List<String> vowels=Arrays.asList("apple","love","india","vinay","mohan","vijayadurga","mallikarjuna rao");

	List<String> collect = vowels
			.stream()
			.filter(a->a.matches("^[aeiouAEIOU].*"))
			.collect(Collectors.toList());
	System.out.println("Vowels in the given sentence is  :"+collect);
	
	
}	
	

}