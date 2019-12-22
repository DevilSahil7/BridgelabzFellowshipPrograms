package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find prime factors of a number
 * 
 * 
 * @author sahil
 *
 */
public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter a number to find prime factors: ");
		int num = Utility.IntegerInput();
		Utility.primeFactors(num);

	}

}
