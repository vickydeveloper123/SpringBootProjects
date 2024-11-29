package com.javaknowledge.findingByRole;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingDatabyEmplRole {

	public static void main(String[] args) {

		List<Employee> employers = Stream
				.of(new Employee(101, "Dora Sri Vignesh", "Software Architect", 50000, "Banglore"),
						new Employee(102, "Muni Shwetha", "Software Tester", 400000, "Hyderabad"),
						new Employee(103, "Srikanth", "Software Tester", 24000, "Chennai"),
						new Employee(104, "Mahendra", "Data Analyst", 50000, "Banglore"),
						new Employee(105, "Dora Sri Vignesh", "Data Analyst", 50000, "Banglore"))
				.collect(Collectors.toList());
		
		
		System.out.println("   Displaying employers Information......");
		List<List<Employee>> asList = Arrays.asList(employers);
		//System.out.println(asList);
		
		System.out.println(" Employers Data : "+employers);

		// Here in the below we can compare the data based on the input we can fetch the
		// data individually,
		Comparator<Employee> comparing = Comparator.comparing(Employee::getEmployeeSalary);

		Map<String, Optional<Employee>> collect = employers.stream()
				.collect(Collectors.groupingBy(Employee::getEmployeeLocation, Collectors.maxBy(comparing)));
		System.out.println(collect);

		// if we want to perform our data individually then we can have to use binary
		// operator in comparing...

		// Getting employers role of highest salary to lowest salary.

		System.out.println(" ");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------");
		System.out.println("           Fetching the data by role of individual by comparing with the salary  .... ");

		Map<String, Optional<Employee>> collect2 = employers.stream().collect(
				Collectors.groupingBy(Employee::getEmployeeRole, Collectors.reducing(BinaryOperator.maxBy(comparing))));

		System.out.println(collect2);

	}

}
