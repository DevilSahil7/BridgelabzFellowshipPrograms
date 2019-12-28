package com.bridgelabz.fellowshipprograms.utility;

/**
 * purpose: to perform different operations of linked list
 * 
 * @author sahil
 * @param <E>
 *
 */
public class LinkedListUtility<E> {

	static Node head;
	static int size;

	public LinkedListUtility() {
		size = 0;
		head = null;
	}

	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public static <E> void insert(E data) {
		Node node = new Node<E>(data);
		
		size++;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public static <E> void delete(E str) {	
		Node n = head;
		Node prev = head;
		if (n.data.equals(str)) {	//deletes if data present at head position
			head = n.next;
			size--;
		}
		while (n.next != null) {	//traversing and finding data to delete
			if (n.data.equals(str)) {
				prev.next = n.next;
				size--;
			}
			prev = n;
			n = n.next;
		}
		if (n.data.equals(str)) {	//deletes the data at last if present
			if (n.next == null) {
				prev.next = null;
				size--;
			}
		}
	}

	public static <E extends Comparable<E>> boolean search(E data) {
		Node n = head;
		while (n != null) {
			if (data.compareTo((E)n.data) == 0) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public static <E> void show() {
		Node n = head;
		if (n == null) {
			System.out.println("Empty");
		}
		while (n != null) {
			System.out.println(n.data + "-->");
			n = n.next;
		}
	}

	public int size() {
		return size;
	}	
}
