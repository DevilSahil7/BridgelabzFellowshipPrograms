package com.bridgelabz.fellowshipprograms.DataStructure;

import java.util.ArrayList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: print prime numbers in 2D array 0-100, 100-200 range up to 1000
 * 
 * @author sahil kudake
 *
 */
public class PrimeNo2DMatrix {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al = Utility.primeNoRange(1000); // storing prime numbers in array list
		int[][] arr = new int[10][50];
		int z = 0, range = 100, count = 0;
		while (z < al.size()) {
			if (al.get(z) > range) { // if number is greater than 100
				range = range + 100; // adds 100 to number to print next range of 100-200 and so on
				count = 0; // prints from start in next range
			}
			arr[al.get(z) / 100][count] = al.get(z); // adding series of 0-100, 100-200 and so on upto 1000
			z++;
			count++;
		}
		System.out.println("<======================================Prime No 2D Array============================>");
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				if (arr[i][j] > 0) {
					System.out.print(arr[i][j] + " ");
				}

			}
			System.out.println();
		}
		System.out.println("<======================================Prime Anagram============================>");
		System.out.println();

		int primeAnagram[] = new int[100];
		primeAnagram = Utility.primeAnagram(al);
		int aa[][] = new int[primeAnagram.length / 2][3];
		int k = 0;
		// storing prime anagrams in 2D array
		for (int i = 0; i < primeAnagram.length / 2; i++) {
			for (int j = 0; j < 2; j++) {
				aa[i][j] = primeAnagram[k];
				k++;
			}
		}
		// printing prime anagram 2D array
		for (int i = 0; i < primeAnagram.length / 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (aa[i][j] > 0) {
					System.out.print(aa[i][j] + " ");
				}
			}
			System.out.println();
		}

		// storing numbers in array that are not anagrams
		int primeArray[] = new int[al.size()];
		int[] notAnagram = new int[primeArray.length];
		int y = 0;

		for (int i = 0; i < al.size(); i++) {
			primeArray[y] = al.get(i);
			y++;
		}
		int r = 0;
		int flag = 0;
		for (int i = 0; i < primeArray.length; i++) {
			for (int j = 0; j < primeAnagram.length; j++) {
				if (primeArray[i] == primeAnagram[j]) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				notAnagram[r] = primeArray[i];
				r++;
			}
		}
		for (int a : notAnagram) {
			System.out.print(a + " ");
		}

	}

}
