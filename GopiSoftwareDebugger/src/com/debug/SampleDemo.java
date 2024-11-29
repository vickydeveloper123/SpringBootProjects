package com.debug;

public class SampleDemo {
	
	public void method1() {
		System.out.println("  This is from method 1");
		
		
	}
	
	public void method2() {
		System.out.println("  This is from method 2");
	}
	
	
	public static void main(String[] args) {
		
		SampleDemo demo1=new SampleDemo(); // Object created [demo1[referec]] 
		System.out.println("Hashcode Address ="+demo1.hashCode());
		System.out.println(" ---------------------------------------------------------");
		SampleDemo demo2=new SampleDemo(); 
		System.out.println("Hashcode Address ="+demo2.hashCode());

		demo1.method1();
		demo1.method2();
		
		int i=0;

		for(i=0;i<=5;i++ ) {
			System.out.println("i value :"+i+"  Gopi is Software Developer [Infosys company ]");
		}
		
		
		
		
	

	}

}
