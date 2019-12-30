package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: reading the integer file from system and making it as ordered list by sorting
 * 
 *  
 * 
 * @author sahil
 *
 */
public class OrderedList {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(Utility.readFileInt("/home/admin1/Documents/number.txt"));
		int arr[] = Utility.linkedListToArrayConversion(ll);
		Utility.bubbleSort(arr);
		for (int data : arr) {
			Utility.insertLinkedListInt(data);
		}
		Utility.printIntegerLinkedList(arr);
	}

}
