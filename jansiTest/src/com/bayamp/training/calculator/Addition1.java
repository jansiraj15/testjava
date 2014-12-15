package com.bayamp.training.calculator;

public class Addition1 {
//Main method
	public static int addExpensesForASpecificMonth() {
		//Local Variables
		
		int expensesForGroceries = 200;
		int expensesForFood =100;
		
		int totalExpenses = expensesForGroceries + expensesForFood;
		
		return totalExpenses;
		
	}
	//Function definition
	public int addExpensesForASpecificMonth(int expensesForGroceries, int expensesForFood){

		int totalExpenses = expensesForGroceries + expensesForFood;
		
		return expensesForGroceries + expensesForFood;
	}
	
	void main (){
		System.out.println("Non-Static method");
	}

}
