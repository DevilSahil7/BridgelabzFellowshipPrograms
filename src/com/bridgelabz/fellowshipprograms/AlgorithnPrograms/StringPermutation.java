package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		Utility.permutation(str, 0, n);
	}
}
