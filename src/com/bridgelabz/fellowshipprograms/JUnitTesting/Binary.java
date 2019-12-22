package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: swap nibbles and find new number. also finding the newa number is power of 2 or not
 * 
 * @author sahil
 *
 */
public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter a number to convert nto binary: ");
		int num = Utility.IntegerInput();
		Utility.toBinary(num);
		Utility.swapNibble(num);

	}

}
