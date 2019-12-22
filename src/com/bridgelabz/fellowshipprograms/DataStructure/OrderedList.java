package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(Utility.readFileInt("D:\\number.txt"));
		int arr[] = Utility.linkedListToArrayConversion(ll);
		Utility.bubbleSort(arr);
		for (int data : arr) {
			Utility.insertLinkedListInt(data);
		}
		Utility.printIntegerLinkedList(arr);
	}

}
