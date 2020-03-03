package com.bridgelabz.fellowshipprograms.junittesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to convert decimal number to binary
 * 
 * @author Sahil Kudake
 *
 */
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Enter a decimal no to convert into binary: ");
		int num = Utility.IntegerInput();
		Utility.toBinary(num);

	}

}
