package com.bridgelabz.fellowshipprograms.junittesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: swap nibbles and find new number. also finding the newa number is power of 2 or not
 * 
 * @author Sahil Kudake
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
