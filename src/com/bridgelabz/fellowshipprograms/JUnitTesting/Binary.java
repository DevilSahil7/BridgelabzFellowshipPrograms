package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter a number to convert nto binary: ");
		int num = Utility.IntegerInput();
		Utility.toBinary(num);
		Utility.swapNibble(num);

	}

}
