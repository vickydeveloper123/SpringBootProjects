package com.dora.java8;

public class ReversingStringUsingJava8 {
	public static void main(String[] args) {
		
		String name="Dora";
		String builder=new StringBuilder(name)
				.reverse()
				.toString();
		System.out.println("Original String :"+name +" \n" +"Reversed String :"+builder);
//	Original String :Dora 
//	Reversed String :aroD
		
	}

}
