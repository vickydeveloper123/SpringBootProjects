package com.dora;

public class Students {

	public String name;
	public int rollNo;
	public long id;
	public String email;

	Students() {
		System.out.println("This class belongs to Students.");
	} // default constructors..

	Students(String name, long id) {

		this.name = name;
		this.id = id;

	} // parameterised constructor,

	// this keyword...

	public void method1() {

		System.out.println("this belongs to method 1");
		String nameee = "Mahesh";
		if (nameee == "Mahesh") {
			System.out.println(" you have entered correct name");
		}

		else {
			System.out.println("Invalid name...");
		}

	}

	public int method2() {

		System.out.println("  This method belongs to method 2");

		return 1;
	}

	public static void main(String[] args) {

		Students student1 = new Students();
		Students student2 = new Students("Mahesh", 101);
		Students student3 = new Students("Nikhil", 102);
		System.out.println(student2.name);
		System.out.println(student2.id);

		System.out.println("-----Nikhil data information---------");

		System.out.println(student3.name);
		System.out.println(student3.id);

	}

}