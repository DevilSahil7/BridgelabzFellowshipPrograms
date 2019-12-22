package com.bridgelabz.fellowshipprograms.FunctionalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: find the sum of three integers in array whose addition is 0
 * 
 * @author sahil
 *
 */
public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int size = Utility.IntegerInput();
		int arr[] = new int[size];
		System.out.println("Enter elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Utility.IntegerInput();
		}
		Utility.triplet(arr);

	}

}
