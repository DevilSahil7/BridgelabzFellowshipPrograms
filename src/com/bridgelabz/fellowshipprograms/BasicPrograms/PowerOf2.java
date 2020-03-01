package com.bridgelabz.fellowshipprograms.basicprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find power of 2
 * 
 * @author Sahil Kudake
 *
 */
public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter power to be calculated: ");
		int power = Utility.IntegerInput();
		Utility.powerOfTwo(power);
	}

}
