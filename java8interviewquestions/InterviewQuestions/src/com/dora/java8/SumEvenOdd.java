package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumEvenOdd {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int sum = number.stream()
				.filter(a -> a % 2 == 0)
				.mapToInt(Integer::valueOf)
				.sum();
		System.out.println("Sum of even numbers in the list :" + sum);

		// Sum of even numbers in the list :20

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("    Finding sum of odd numbers in the list of integers we have    ");

		OptionalDouble average = number
				.stream()
				.filter(a -> !(a % 2 == 0))
				.mapToInt(Integer::valueOf)
				.average();

		System.out.println("Average of all odd numbers in the list of integer :" + average);

		// Average of all odd numbers in the list of integer :OptionalDouble[5.0]

	}

}