package com.javaknowledge.collectionStreams;

import java.util.Arrays;
import java.util.Comparator;

public class FindingSecondHighestElementsInArrray {

	public static void main(String[] args) {

		int[] elements = { 1, 23, 55, 25, 7, 34, 66, 37, 6, 24, 74, 73 };

		Integer integer = Arrays.stream(elements).boxed()
				            .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(" Getting the second highest elements in the array :" + integer);

	}

}
