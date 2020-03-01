package com.bridgelabz.fellowshipprograms.algorithnprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find string permutation
 * 
 * @author Sahil Kudake
 *
 */
public class StringPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		Utility.permutation(str, 0, n);
	}
}
