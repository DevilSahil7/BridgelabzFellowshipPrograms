package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.LinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to create slot of 10 to store chain of numbers and to search a number.
 * 			and to search a number. if found then delete if not then insert.
 * @author sahil kudake
 *
 */
public class Hashing {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(Utility.readFileInt("/home/admin1/Documents/number.txt"));
		int arr []= Utility.linkedListToArrayConversion(ll);
		Object [] ob = new Object[11];
		for(int i = 0; i<11; i++) {
			ob[i] = new LinkedListUtility<Integer>();
		}
		
		int stack = 0;
		for(int i=0; i<arr.length; i++) {
			stack = arr[i]%11;
			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[stack];
			
			list.insert(arr[i]);
			
		}
		
		
		for(int i=0; i<ob.length; i++) {
			LinkedListUtility<Integer> list = (LinkedListUtility)ob[i];
			System.out.println("Stack No "+i+" :=>");
			list.show();
			System.out.println();
		}
		
			
		System.out.println("Enter data to search: ");
		int data = Utility.IntegerInput();
		LinkedListUtility list = (LinkedListUtility)ob[data%11];
		
		if(list.search(data)) {
			System.out.println("Found in stack no: "+data%11);
			list.delete(data);
			list.show();
		}
		else {
			System.out.println("Not found!");
			LinkedListUtility list1 = (LinkedListUtility)ob[data%11];
			list1.insert(data);
			System.out.println("Stack no "+data%11+" :=>");
			list1.show();
			
		}

	}
	
}
