package com.bayamp.training.calculator;

public class Excericse4 {

	public static void main(String[] args) {
		System.out.println("I am in main method");

		int number1 = 30;
		int number2 = 40;

		System.out.println("The first number is " + number1);
		System.out.println("The second number is " + number2);

		int total = substractTwoNumbers(number1, number2);

		System.out.println("The substraction od number1 and number2 is "
				+ total);

	}

	public static int substractTwoNumbers(int parameter1, int parameter2) {

		System.out.println("The parameter1 is " + parameter1);
		System.out.println("The parameter2 is " + parameter2);

		int total = parameter1 - parameter2;

		return total;

	}

}
