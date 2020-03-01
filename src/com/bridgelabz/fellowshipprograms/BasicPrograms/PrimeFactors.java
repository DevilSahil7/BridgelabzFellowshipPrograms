package com.bridgelabz.fellowshipprograms.basicprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find prime factors of a number
 * 
 * 
 * @author Sahil Kudake
 *
 */
public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter a number to find prime factors: ");
		int num = Utility.IntegerInput();
		Utility.primeFactors(num);

	}

}
