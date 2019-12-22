package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find square root using newton's method
 * 
 * @author sahil
 *
 */
public class NewtonSqrt {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		double num = Utility.doubleInput();
		double epsilon = 1e-15;
		Utility.sqrt(num, epsilon);

	}

}
