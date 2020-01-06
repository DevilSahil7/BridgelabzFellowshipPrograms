package com.bridgelabz.fellowshipprograms.utility;

/**
 * purpose: to perform different operations of linked list
 * 
 * @author sahil kudake
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
		Node<E> node = new Node<E>(data);

		size++;
		if (head == null) {
			head = node;
		} else {
			Node<E> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public static <E> void insertAtStart(E data) {
		Node<E> node = new Node<E>(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public static <E> void insertAtIndex(int index, E data) {
		Node<E> node = new Node<E>(data);
		node.data = data;
		node.next = null;
		Node<E> n = head;
		if (index == 0) {
			insertAtStart(data);
		}
		else {
			for(int i = 0; i<index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public static <E> void delete(E str) {
		Node<E> n = head;
		Node<E> prev = head;
		if (n.data.equals(str)) { // deletes if data present at head position
			head = n.next;
			size--;
		}
		while (n.next != null) { // traversing and finding data to delete
			if (n.data.equals(str)) {
				prev.next = n.next;
				size--;
			}
			prev = n;
			n = n.next;
		}
		if (n.data.equals(str)) { // deletes the data at last if present
			if (n.next == null) {
				prev.next = null;
				size--;
			}
		}
	}
	
	public static <E> void deleteAtIndex(int index) {
		Node<E> n = head;
		if(index==0) {
			head = head.next;
		}
		else {
			for(int i =0 ; i<index-1; i++) {
				n = n.next;
			}
			n.next = n.next.next;
		}
	}
	
	public static <E> void deleteLast() {
		Node<E> n = head;
		while(n.next.next!=null) {
			n = n.next;
		}
		n.next = null;
	}

	public static <E extends Comparable<E>> boolean search(E data) {
		Node<E> n = head;
		while (n != null) {
			if (data.compareTo((E) n.data) == 0) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public static <E> void show() {
		Node<E> n = head;
		if (n == null) {
			System.out.println("Empty");
		}
		while (n != null) {
			System.out.print(n.data + "-->");
			n = n.next;
		}
	}
	
	public int index(E item) {
		Node<E> temp = head;
		int count = 0;
		while (item != (temp.data)) {
			count++;
			temp = temp.next;

		}
		return count;
	}


	public int size() {
		return size;
	}
}
