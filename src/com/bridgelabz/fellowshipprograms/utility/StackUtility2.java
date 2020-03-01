package com.bridgelabz.fellowshipprograms.utility;

/**
 * Purpose: to perform stack operations
 * 
 * @author Sahil Kudake
 *
 */
public class StackUtility2 {
	static Node top;

	static class Node<E> {
		E data;
		Node next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	public static <E> void push(E data) {
		Node n = new Node(data);
		if (top == null) {
			top = n;
		} else {
			Node temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			// System.out.println(temp.data);
		}
	}
	
	public static <E> E pop() {
		Node temp = top;
		Node prev = temp;
		E data = null;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			if (prev == temp) {
				top = null;
			}
			data = (E) temp.data;
			prev.next = null;
		}
		return data;
	}
	
	public static boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}
}
