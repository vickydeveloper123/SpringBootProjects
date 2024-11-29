package com.javaknowledge.collectionStreams;

import java.util.Arrays;
import java.util.Comparator;

public class FindingLongestStringInArray {
	
	public static void main(String[] args) {
		
		String[] names= {"Rachamalli Dora Sri Vignesh","Vijaya Durga","Akhila","Srikanth","Mahendra","Kavitha"};
		
		String string = Arrays.stream(names).max(Comparator.comparingInt(String::length)).get();
		
		System.out.println("Finding Longest String in an array  ::: "+ string);
	}

}
