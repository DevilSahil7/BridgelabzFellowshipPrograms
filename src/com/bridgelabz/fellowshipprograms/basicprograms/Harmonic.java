package com.bridgelabz.fellowshipprograms.basicprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to calculate harmonic number
 * 
 * @author Sahil Kudake
 *
 */
public class Harmonic {

	public static void main(String[] args) {
		System.out.println("Enter number to calculate harmonic number: ");
		double harmonic = Utility.doubleInput();
		Utility.harmonic(harmonic);

	}

}
