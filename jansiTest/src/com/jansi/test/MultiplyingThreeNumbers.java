package com.jansi.test;

public class MultiplyingThreeNumbers {
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
		// local variables
	
		int num1 =5;
		int num2 =3;
		int num3 =2;
		
		System.out.println("The first number is " + num1);
		System.out.println("The second number is " + num2);
		System.out.println("The third number is " + num3);
		
		long total = multiplyingThreeNumbers(num1,num2,num3);
		System.out.println("The multiplication for three numbers is " + total);
		
	}
	// function definition

public static long multiplyingThreeNumbers(int parameter1,int parameter2, int parameter3){
	
	System.out.println("The first parameter is " + parameter1);
	System.out.println("The first parameter is " + parameter2);
	System.out.println("The first parameter is " + parameter3);
	
	long total = parameter1 * parameter2 * parameter3;
	
	return total;
}


}
