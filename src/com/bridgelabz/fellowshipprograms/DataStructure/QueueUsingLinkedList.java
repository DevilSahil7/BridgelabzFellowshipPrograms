package com.bridgelabz.fellowshipprograms.DataStructure;

import java.util.ArrayList;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int arr[] = new int[100];

		al = Utility.primeNoRange(1000); // prime number list
		arr = Utility.primeAnagram(al); // prime number anagram array
		Utility.bubbleSort(arr);
		int length = arr.length;
		length = Utility.removeDuplicatesFromArray(arr, length);
		for (int i = 0; i < length; i++) {
			if (arr[i] != 0)
				QueueUsingLinkedListUtility.enqueue(arr[i]);// adding data to queue
		}
		while (length > 1) {
			int data = QueueUsingLinkedListUtility.dequeue();// removing data from queue
			System.out.print(data + "->"); // printing data
			length--;
		}

	}

}
