package com.bridgelabz.fellowshipprograms.algorithnprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to sort array
 * 
 * @author Sahil Kudake
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 15, 7, 11, 8, 2, 5, 25, 19, 13 };
		Utility.bubbleSort(arr);
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}

}
