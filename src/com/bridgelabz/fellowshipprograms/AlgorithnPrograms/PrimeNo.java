package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import java.util.ArrayList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find prime numbers between 0-1000 that are anagrams and palindromes
 * 
 * @author sahil
 *
 */
public class PrimeNo {

	public static void main(String[] args) {
		System.out.println("Enter a range from 1 to check prime no: ");
		int n = Utility.IntegerInput();
		int bb[] = new int[170];
		int cc[][] = new int[10][50];
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		a = Utility.primeNoRange(n);				 // object 'a' will catch output of primeNoRange which is a ArrayList 'al' and
													// store in 'a'.
		System.out.println(a); 						// it will print prime no list
		System.out.println();
		bb = Utility.primeAnagram(a); 				// prime no list 'a' is passed to check anagrams
		for (int i = 0; i < bb.length; i++) {
			if (bb[i] != 0) {
				System.out.print(bb[i] + " ");		//printing prime number array
			}
		}
		System.out.println();
		System.out.println();
		int z = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 17; j++) {
				cc[i][j] = bb[z];					//adding 1D array to 2D array
				z++;
				if (cc[i][j] != 0)
					System.out.print(cc[i][j] + " ");	//printing 2D array
			}
			System.out.println();
		}
		b=Utility.isPallindrome(a);						//checking for prime palindrome
		System.out.println("Prime palondromes are: "+b);	//printing prime palindromes
	}

}
