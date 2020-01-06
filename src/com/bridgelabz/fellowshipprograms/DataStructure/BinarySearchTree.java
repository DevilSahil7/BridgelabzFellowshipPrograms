package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.Node;;

/**
 * purpose: to search the number in binary tree
 * 
 * @author sahil kudake
 *
 */
public class BinarySearchTree {
	public static long countbinary(int n) {
		long count = 0;
		count = Utility.factorial(2*n)/((Utility.factorial(n+1)*Utility.factorial(n)));
		return count;
	}

	public static void main(String[] args) {
//		Node n = new Node(0);
//		n.prev = new Node(1); // adding data to tree
//		n.prev.prev = new Node(3);
//		n.prev.prev.prev = new Node(7);
//		n.next = new Node(10);
//		n.next.next = new Node(5);
//		n.next.prev = new Node(8);
//		n.prev.next = new Node(2);
//		n.next.next.prev = new Node(6);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter nodes: ");
			int number = Utility.IntegerInput();
		

		//System.out.println("Enter a number to search in Binary tree: ");
		//int number = Utility.IntegerInput();

//		if (Utility.exist(n, number)) // checking the number in binary tree if exists or not
//			System.out.println("Found");
//		else
//			System.out.println("Not found.");
		long count = countbinary(number);
		System.out.println("Number of trees are: "+count);
		}
	}

}
