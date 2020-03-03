package com.bridgelabz.fellowshipprograms.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: read the file from system and arrange it as linked list
 * 
 * @author Sahil Kudake
 *
 */
public class UnorderedList {

	public static void main(String[] args) throws IOException {
		LinkedList<String> str = new LinkedList<String>();
		str = Utility.readFile("/home/admin1/Documents/file.txt"); // reading file
		for (String data : str) {
			Utility.insertLinkedList(data); // inserting into linked list
		}
		Utility.printLinkedList(); // printing linked list
		System.out.println("Enter word to find in LinkedList: ");
		String find = Utility.stringInput();
		Utility.deleteByKey(find); // deleting the user input from linked list
	}
}
