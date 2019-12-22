package com.bridgelabz.fellowshipprograms.utility;

import java.util.LinkedList;

public class StackUtility {

	public static void stackLinkedList(int key) {
		int arr[] = { 25, 11, 42, 34, 46, 15, 7 };
		LinkedList<Integer> l0 = new LinkedList<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		LinkedList<Integer> l4 = new LinkedList<Integer>();
		LinkedList<Integer> l5 = new LinkedList<Integer>();
		LinkedList<Integer> l6 = new LinkedList<Integer>();
		LinkedList<Integer> l7 = new LinkedList<Integer>();
		LinkedList<Integer> l8 = new LinkedList<Integer>();
		LinkedList<Integer> l9 = new LinkedList<Integer>();

		for (int a : arr) {
			int x = a % 11;
			switch (x) {
			case 0:
				l0.add(a);
				break;
			case 1:
				l1.add(a);
				break;
			case 2:
				l2.add(a);
				break;
			case 3:
				l3.add(a);
				break;
			case 4:
				l4.add(a);
				break;
			case 5:
				l5.add(a);
				break;
			case 6:
				l6.add(a);
				break;
			case 7:
				l7.add(a);
				break;
			case 8:
				l8.add(a);
				break;
			case 9:
				l9.add(a);
				break;

			}
		}
		Utility.orderedLinkedList(l0);
		Utility.orderedLinkedList(l1);
		Utility.orderedLinkedList(l2);
		Utility.orderedLinkedList(l3);
		Utility.orderedLinkedList(l4);
		Utility.orderedLinkedList(l5);
		Utility.orderedLinkedList(l6);
		Utility.orderedLinkedList(l7);
		Utility.orderedLinkedList(l8);
		Utility.orderedLinkedList(l9);
		
		Stack.findData(key);
	}

	public static class Stack {
		static int top = -1;
		static int arr []= new int[10];
		static int arr1 [] = new int [10];
	
		public static void pushToStack(LinkedList<Integer> lp, int key) {
			arr=Utility.linkedListToArrayConversion(lp);
			for(int a : arr) {
				arr1[0]=a;		//LinkedList data stored in stack
			}
			System.out.println("pushed to stack!");
		}
		
		public static int popFromStack() {
			if(top<0) {
				System.out.println("Stack underflow");
				return 0;
			}
			else {
				int x = arr[top--];
				return x;
			}
		}
		
		public static void findData(int key) {
			
		}
	}

}
