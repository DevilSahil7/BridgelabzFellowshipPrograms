package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find number is anagram
 * 
 * @author sahil
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
