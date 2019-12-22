package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = Utility.IntegerInput();
		int[] arr = new int[n];
		int pow = 1;
		for (int i = 0; i < n; i++) {
			pow = pow * 2;
			arr[i] = pow;
			System.out.print(pow + " ");
		}
		int r = Utility.binarySearchInt(arr, 0, n - 1);
		if (r == -1)
			System.out.println("number not found");
		else
			System.out.println("number found at " + r);
	}

}
