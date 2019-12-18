package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.print("Enter first String: ");
		String str1 = Utility.stringInput();
		System.out.println("Enter second String: ");
		String str2 = Utility.stringInput();
		Utility.anagram(str1, str2);

	}

}
