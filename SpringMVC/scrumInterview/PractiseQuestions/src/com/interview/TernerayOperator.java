package com.interview;

public class TernerayOperator {
	
	
	
	public static void main(String[] args)
	
	{
		
		String s1="abc";
		String s2="abc";
		
		System.out.println("----------------------------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println("------------------------------------");
		String str1=new String("abc");
		
		String str2=new String("abc");

		System.out.println(str1=str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(s1==str1);
		System.out.println(s1.equals(str2));
		
		
		
		System.out.println("-------------------------------------------");
		
	
	int x=7;
	int y=5;
	
	System.out.println(x<y?x:y); // 7<5  
	
	System.out.println( x>y?x:y+" : Output"); // 7
	
	
	System.out.println("========================================");
	
	
	x=x+y-(x=y);
	System.out.println(x+"   "+y);
	
	
	System.out.println("==========================================");
	
	
	String s5="Vtalent";
	System.out.println(s5.substring(2,5)); // 
	
	}

}
