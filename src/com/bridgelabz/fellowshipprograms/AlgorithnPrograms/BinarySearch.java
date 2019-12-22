package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find a word in list using binary search
 * 
 * @author sahil
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		String arr[] = { "sahil", "priya", "hanumant", "sampada", "ganesh" };
		System.out.print("Enter the word to find: ");
		String key = Utility.stringInput();
		int result = Utility.binarySearch(arr, key);		//returns searched index in result
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element present at " + result);
	}
}
