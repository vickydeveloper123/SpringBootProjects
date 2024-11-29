package com.dora.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {

		String data = "Rachamalli Dora Sri Vignesh";

		Map<Character, Long> collect = data
				.chars()
				.mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Finding each character Frequency in a string :" + "\n" + collect);
	}
	
	
//	Finding each character Frequency in a string :
//	{ =3, a=4, c=1, D=1, e=1, g=1, h=2, i=3, l=2, m=1, n=1, o=1, r=2, R=1, s=1, S=1, V=1}


}
