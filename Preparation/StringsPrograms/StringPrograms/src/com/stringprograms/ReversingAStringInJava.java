package com.stringprograms;

public class ReversingAStringInJava {

	public static void main(String[] args) {

		String name = "Dora Sri Vignesh";

		String[] split = name.split(name);

		String reversedName = "";

		String finalReversedName = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversedName = reversedName + name.charAt(i);

		}
		finalReversedName = finalReversedName + reversedName;
		System.out.println("Given name :" + name);

		System.out.println("Reversed Name :" + finalReversedName);
	}

//	Given name :Dora Sri Vignesh
//	Reversed Name :hsengiV irS aroD

}
