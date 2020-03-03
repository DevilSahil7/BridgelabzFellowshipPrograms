package com.bridgelabz.fellowshipprograms.algorithnprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find number is anagram
 * 
 * @author Sahil Kudake
 *
 */
public class Anagram {

	public static void main(String[] args) {
		System.out.print("Enter first String: ");
		String str1 = Utility.stringInput();
		System.out.println("Enter second String: ");
		String str2 = Utility.stringInput();
		if(Utility.anagram(str1, str2) == true) 
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");

	}

}
