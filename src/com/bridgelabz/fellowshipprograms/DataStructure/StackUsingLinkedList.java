package com.bridgelabz.fellowshipprograms.DataStructure;

import java.util.ArrayList;
import com.bridgelabz.fellowshipprograms.utility.StackUtility2;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int arr[] = new int[100];

		al = Utility.primeNoRange(1000);
		arr = Utility.primeAnagram(al);
		Utility.bubbleSort(arr);
		int length = arr.length;
		length = Utility.removeDuplicatesFromArray(arr, length);
		for (int i = 0; i < length; i++) {
			if (arr[i] != 0)
				StackUtility2.push(arr[i]);
		}
		while (length > 1) {
			int data = StackUtility2.pop();
			System.out.print(data + "->");
			length--;
		}
	}

}
