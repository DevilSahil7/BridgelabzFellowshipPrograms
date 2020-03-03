package com.bridgelabz.fellowshipprograms.datastructure;

import java.util.ArrayList;
import com.bridgelabz.fellowshipprograms.utility.StackUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose : Printing prime anagram using stack using linked list
 * 
 * @author Sahil Kudake
 *
 */
public class StackUsingLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int arr[] = new int[100];

		al = Utility.primeNoRange(1000); //prime number list
		arr = Utility.primeAnagram(al); // prime anagram array
		Utility.bubbleSort(arr);
		int length = arr.length;
		length = Utility.removeDuplicatesFromArray(arr, length); //removing duplicates from array
		for (int i = 0; i < length; i++) {
			if (arr[i] != 0)
				StackUsingLinkedListUtility.push(arr[i]); //pushing data to stack
		}
		while (length > 1) {
			int data = StackUsingLinkedListUtility.pop(); //removing data from stack
			System.out.print(data + "->"); // printing data
			length--;
		}
	}

}
