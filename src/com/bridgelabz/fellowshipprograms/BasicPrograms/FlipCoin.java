package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find probability if heads and tails after flipping a coin by users choice
 * 
 * @author sahil
 *
 */
public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number of chances to flip the coin: ");
		int chance = Utility.IntegerInput();
		Utility.flipCoin(chance);

	}
	
	

}
