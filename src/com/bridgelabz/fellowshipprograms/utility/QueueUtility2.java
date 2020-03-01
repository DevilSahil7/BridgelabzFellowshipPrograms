package com.bridgelabz.fellowshipprograms.utility;

/**
 * Purpose: to perform queue operations
 * 
 * @author Sahil Kudake
 *
 */
public class QueueUtility2 {
	static Node head;

	public static class Node<E> {
		E data;
		Node next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public static <E> void enqueue(int data) {
		Node temp;
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public static <E> E dequeue() {
		E data = null;
		if (!isEmpty()) {
			Node temp = head;
			data = (E) temp.data;
			head = temp.next;
		} else {
			System.out.println("Queue is empty");
		}
		return data;
	}

	public static boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public static void printQueue() {
		if (!isEmpty()) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		} else {
			System.out.println("Queue is empty");
		}
	}
}
