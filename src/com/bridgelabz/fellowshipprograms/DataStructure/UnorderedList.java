package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: read the file from system and arrange it as linked list
 * 
 * @author sahil
 *
 */
public class UnorderedList {

	public static void main(String[] args) throws IOException  {
			LinkedList<String> str= new LinkedList<String>();
			str=Utility.readFile("/home/admin1/Documents/file.txt");		//reading file
			System.out.println(str);
			for(String data:str)		
			{
				Utility.insertLinkedList(data);			//inserting into linkedlist
			}
			Utility.printLinkedList();					//printing linkedlist
			System.out.println("Enter word to find in LinkedList: ");
			String find= Utility.stringInput();
			Utility.deleteByKey(find);					//deleting the user input from linked list
		}
}


