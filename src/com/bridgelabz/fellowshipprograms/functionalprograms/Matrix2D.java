package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: taking input for 2D array and printing it on screen
 * 
 * @author Sahil Kudake
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
