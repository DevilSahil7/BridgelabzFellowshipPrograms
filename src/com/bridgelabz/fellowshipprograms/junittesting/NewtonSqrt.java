package com.bridgelabz.fellowshipprograms.junittesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to find square root using newton's method
 * 
 * @author Sahil Kudake
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
