package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class NewtonSqrt {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		double num = Utility.doubleInput();
		double epsilon = 1e-15;
		Utility.sqrt(num, epsilon);

	}

}
