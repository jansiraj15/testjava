package com.bayamp.training.calculator;

public class StaticAndNonStatic {

	//Global Variables
	
	public static int date = 11;

	//Function Definitions
	
	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		System.out.println("Today date is " + date);

	}
	
	int unExpensesForASpeficMonth(){
		System.out.println("This is non static method");
return 0;

	}

	public static void nonStatic(){
		System.out.println("This is a static method");
		
	}
}
