package com.bayamp.training.calculator;



public class HelloWorld {
//Global variables
	
	//private static int date= 21;
	
	public static void main(String[] args){
		
		//int results =com.bayamp.training.math.Addition.addExpensesForASpecificMonth();
		
	//int results =com.bayamp.training.math.Addition.addExpensesForASpecificMonth(145,545);
		
		
		//I created an addition object
		Addition1 variableName = new Addition1();
		
		int expensesForGroceries =3456;
		int expensesForFood =345;
		
		int results = variableName.addExpensesForASpecificMonth(expensesForGroceries, expensesForFood);
		
	System.out.println("the addition of my monthly expenses is " + results);
	//System.out.println(" The date is : " + date);
	
}

}
