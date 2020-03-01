package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to find the root of the equation
 * 
 * @author Sahil Kudake
 *
 */
public class Quadratic {

	public static void main(String[] args) {

		System.out.print("Enter value of a: ");
		double a = Utility.doubleInput();
		System.out.print("Enter value of b: ");
		double b = Utility.doubleInput();
		System.out.print("Enter value of c: ");
		double c = Utility.doubleInput();
		Utility.quadratic(a, b, c);

	}

}
