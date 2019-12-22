package com.bridgelabz.fellowshipprograms.FunctionalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find euclidean distance
 * 
 * @author sahil
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
