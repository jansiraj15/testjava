package com.bayamp.training.calculator;

public class TennisList {

	/**
	 * @Author : Jansi
	 * 
	 *         this class is to add the list of balls and bats for the tennis
	 */

	// This is main method
	public static void main(String[] args) {

		int noOfBalls = 50;
		int noOfBats = 20;

		int tennisList = noOfBalls + noOfBats;

		System.out.println("Here is the list of balls and bats for tennis "
				+ tennisList);
		//return tennisList;

	}

	public static int listOfBallsAndBatsForTennis(int noOfBalls, int noOfBats) {

		int tennisList = noOfBalls + noOfBats;

		System.out.println("Here is the list of balls and bats for tennis "
				+ tennisList);

		return 0;

	}

}
