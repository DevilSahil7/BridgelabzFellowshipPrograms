package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.LinkedListDemo;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: reading the integer file from system and making it as ordered list
 * by sorting
 * 
 * 
 * 
 * @author sahil kudake
 *
 */
public class OrderedList {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(Utility.readFileInt("/home/admin1/Documents/number.txt"));// reading file and storing in linked list
		int arr[] = Utility.linkedListToArrayConversion(ll);
		Utility.bubbleSort(arr);
		for (int data : arr) {
			LinkedListDemo.insert(data); // inserting data into linked list
		}
		LinkedListDemo.printList(); // printing data from linked list
	
		System.out.print("Enter a number to find: ");
		int num = Utility.IntegerInput();
		LinkedListDemo.delete(num);
	
	}

}
