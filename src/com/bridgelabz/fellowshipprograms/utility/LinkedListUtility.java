package com.bridgelabz.fellowshipprograms.utility;

/**
 * purpose: to perform different operations of linked list
 * 
 * @author sahil
 *
 */
public class LinkedListUtility {

	Node head;
	int size;

	public LinkedListUtility() {
		size = 0;
		head = null;
	}

	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public <E> void insert(E data) {
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

	public <T> void delete(T str) {
		Node n = head;
		Node prev = head;
		if (n.data.equals(str)) {
			head = n.next;
			size--;
		}
		while (n.next != null) {
			if (n.data.equals(str)) {
				prev.next = n.next;
				size--;
			}
			prev = n;
			n = n.next;
		}
		if (n.data.equals(str)) {
			if (n.next == null) {
				prev.next = null;
				size--;
			}
		}
	}

	public <E extends Comparable<E>> boolean search(E data) {
		Node n = head;
		while (n != null) {
			if (data.compareTo((E)n.data) == 0) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public <E> void show() {
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
