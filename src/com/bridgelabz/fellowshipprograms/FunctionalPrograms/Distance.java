package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to find euclidean distance
 * 
 * @author Sahil Kudake
 *
 */
public class Distance {

	public static void main(String[] args) {
		System.out.println("Enter value of x: ");
		double x = Utility.doubleInput();
		System.out.println("Enter value of y: ");
		double y = Utility.doubleInput();
		Utility.euclideanDistance(x, y);

	}

}
