package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number of chances to flip the coin: ");
		int chance = Utility.IntegerInput();
		Utility.flipCoin(chance);

	}

}
