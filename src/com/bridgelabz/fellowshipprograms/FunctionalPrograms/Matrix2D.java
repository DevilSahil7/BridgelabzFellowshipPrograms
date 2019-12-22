package com.bridgelabz.fellowshipprograms.FunctionalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: taking input for 2D array and printing it on screen
 * 
 * @author sahil
 *
 */
public class Matrix2D {

	public static void main(String[] args) {
		System.out.println("Enter no of rows: ");
		int rows = Utility.IntegerInput();
		System.out.println("Enter no of columns: ");
		int cols = Utility.IntegerInput();
		Utility.matrix(rows, cols);
	}
}
