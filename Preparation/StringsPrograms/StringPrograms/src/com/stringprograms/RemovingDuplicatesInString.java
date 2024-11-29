package com.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesInString {

	public static void main(String[] args) {

		System.out.println(" Removing Duplicates elements in string.....");
		String message = "Programming In Java";

		StringBuilder builder = new StringBuilder();
		message.chars().distinct().forEach(a -> builder.append((char) a));
		System.out.println(builder);

		System.out.println("------2. Approach---------------------------------------------------");

		StringBuilder builde1r = new StringBuilder();

		for (int i = 0; i < message.length() - 1; i++) {
			char charAt = message.charAt(i);
			int indexOf = message.indexOf(charAt, i + 1);

			if (indexOf == -1) {
				builde1r.append(charAt);

			}
		}

		System.out.println(builde1r);

		System.out.println("------3. Approach---------------------------------------------------");

		// Approach 3

		char[] charArray = message.toCharArray();

		StringBuilder builder3 = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {

			boolean repeated = false;

			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {

					repeated = true;
					break;
				}

				if (!repeated) {

					builder3.append(charArray);

				}
			}

			System.out.println(builder3);
		}

		System.out.println("------4. Approach---------------------------------------------------");

		StringBuilder builder4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < message.length(); i++) {

			set.add(message.charAt(i));
		}

		builder4.append(set);
		System.out.println(builder4); // [P, r, o, g, a, m, i, n, , I, J, v]

		System.out.println("------ -----  5. Approach---------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}