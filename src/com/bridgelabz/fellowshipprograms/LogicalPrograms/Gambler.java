package com.bridgelabz.fellowshipprograms.LogicalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: gambler program to initiate bets, trials and to set the probability of winning and loosing
 * 
 * @author sahil
 *
 */
public class Gambler {

	public static void main(String[] args) {

		System.out.print("Enter your stake: ");
		int stake = Utility.IntegerInput();
		if (stake < 100) {
			System.out.println("Don't start empty hands!!");
			System.out.print("Enter amount greater than 100: ");
			stake = Utility.IntegerInput();
		}
		System.out.print("Enter your goal: ");
		int goal = Utility.IntegerInput();
		if (goal < stake) {
			System.out.println("hey!! place a higher goal to win more!!!");
			System.out.print("Enter your goal: ");
			goal = Utility.IntegerInput();
		}
		System.out.println("Enter trials: ");
		int trials = Utility.IntegerInput();
		Utility.gambler(stake, goal, trials);

	}

}
