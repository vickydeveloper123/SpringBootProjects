package com.dora.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(11, 12, 13, 23, 32, 43, 4, 543, 1, 435, 345, 324, 343, 34, 642, 62, 723,
				52, 32);

		System.out.println("---------Natural  sorted order------------------------");

		List<Integer> collect = numbers.stream().map(String::valueOf).filter(a -> a.startsWith("1"))
				.map(Integer::valueOf).collect(Collectors.toList());

		System.out.println("Numbers Mapping with 1 :" + collect);

		System.out.println(
				"-------------------------Numbers starting with 1 and it should be in reverse order.....--------------------------------------------------------");

		System.out.println("---------Ascending sorted order------------------------");
		List<Integer> collect1 = numbers.stream().map(String::valueOf).filter(a -> a.startsWith("1"))
				.map(Integer::valueOf).sorted().collect(Collectors.toList());

		System.out.println("Numbers Mapping with 1 :" + collect1);

	}

}