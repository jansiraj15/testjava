package com.bayamp.training.calculator;

public class Excerise2 {

	//How to call a function by passing argument to a function (addTwoNumbers)
	
	public static void main(String[] args) {
		System.out.println(" I am in main method");
		
		int num1 =145;
		int num2 =255;
		
		System.out.println("The first number is " + num1);
		System.out.println("The second number is " + num2);
		
		int result = addTwoNumbers(num1,num2);
		
		//You can write like this also --System.out.println("the addition of " + num1+ "and" + num2 + "is" :+ result);
	
		System.out.println("The addition of num1 and num2 is :" + result);
	}
	
	
	public static int addTwoNumbers(int parameter1, int parameter2){
		System.out.println(" I am in addTwoMethod method");
		
		System.out.println("The parameters1 is : " + parameter1);
		System.out.println("The parameters1 is : " + parameter2);
		
		int total = parameter1 + parameter2;
		
		//System.out.println("The total of two parameters is " + total);
		
		return total;
	}
	
}
