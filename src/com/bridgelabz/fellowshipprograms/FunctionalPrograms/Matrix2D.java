package com.bridgelabz.fellowshipprograms.FunctionalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Matrix2D {

	public static void main(String[] args) {
		System.out.println("Enter no of rows: ");
		int rows = Utility.IntegerInput();
		System.out.println("Enter no of columns: ");
		int cols = Utility.IntegerInput();
		Utility.matrix(rows, cols);
	}
}
