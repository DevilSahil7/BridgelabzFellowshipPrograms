package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to calculate harmonic number
 * 
 * @author sahil
 *
 */
public class Harmonic {

	public static void main(String[] args) {
		System.out.println("Enter number to calculate harmonic number: ");
		double harmonic = Utility.doubleInput();
		Utility.harmonic(harmonic);

	}

}
