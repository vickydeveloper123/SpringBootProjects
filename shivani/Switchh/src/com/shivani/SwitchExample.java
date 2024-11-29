package com.shivani;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchExample {

		public static void main(String[] args) throws IOException {
			/*
			 * InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br =
			 * new BufferedReader(isr);
			 * 
			 * System.out.println("Enter Shortform of month"); int str = br.to
			 */
			
			Scanner scanner=new Scanner(System.in);
			String month=scanner.toString();
			
				// value is different , ref is different.
			switch(month) {
			case "1"  : System.out.println("January");
			break;
			case "2" : System.out.println("February");
			break;
			case "3" : System.out.println("March");
			break;
			case "apr" : System.out.println("April");
			break;
			case "may" : System.out.println("May");
			break;
			case "jun" : System.out.println("June");
			break;
			case "jul" : System.out.println("June");
			break;
			case "aug" : System.out.println("August");
			break;
			case "sep" : System.out.println("September");
			break;
			case "oct" : System.out.println("October");
			break;
			case "nov" : System.out.println("November");
			break;
			case "dec" : System.out.println("December");
			break;
			default : System.out.println("Invalid Input");
			}

		}

	}

