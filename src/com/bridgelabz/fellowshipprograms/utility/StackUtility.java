package com.bridgelabz.fellowshipprograms.utility;

/**
 * Purpose: to perform stack operations
 * 
 * @author Sahil Kudake
 *
 */
public class StackUtility {

	static int MAX = 1000;
	static int top;
	static int arr[] = new int[MAX];

	public StackUtility() {
		top = -1;
	}

	public static boolean isEmpty() {
		return (top < 0);
	}

	public static void push(int data) {
		if (top > MAX - 1) {
			System.out.println("Stack Underflow!");
		} else {
			arr[++top] = data;
			System.out.println("Data pushed!");
		}
	}
	
	public static int pop() {
		if(top<0) {
			System.out.println("Stack Overflow!");
			return 0;
		}
		else {
			int x = arr[top--];
			return x;
		}
	}
	
	public static int peek() {
		if(top<0) {
			System.out.println("Stack Underflow!");
			return 0;
		}
		else {
			int x = arr[top];
			return x;
		}
	}

}
