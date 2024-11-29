package com.dora.java8;

public class SumOfDigitsInString {
	
	public static void main(String[] args) {
		
		  String s = "ab12pq34";
		  
		  int sum = s.chars().filter(Character::isDigit)
		  .map(Character::getNumericValue)
		  .sum();
		  
		  System.out.println("Sum of digits in the string :"+sum);
		
		  
		  // here in the character :: isDigit [It is converting all to the characters]
		  // Then it is printing [by the numberic values it is converting all into the numberic values]
		  // Then we can able to do the sum.
		  // so that is the process we can able to remove the special charecters in the string ..
	}

}
