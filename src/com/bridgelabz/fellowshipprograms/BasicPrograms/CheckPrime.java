package com.bridgelabz.fellowshipprograms.basicprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find prime number is given range
 * 
 * @author Sahil Kudake
 *
 */
public class CheckPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number to check is it prime: ");
		int num = Utility.IntegerInput();
		Utility.isPrime(num);
	}

}
