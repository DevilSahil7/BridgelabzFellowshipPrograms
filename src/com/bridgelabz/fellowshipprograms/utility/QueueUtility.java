package com.bridgelabz.fellowshipprograms.utility;

import java.util.NoSuchElementException;

public class QueueUtility<E> {

	private static int capacity;
	static int queue[];
	static int front;
	static int rear;
	static int size = 0;

	public QueueUtility(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = 0;
		queue = new int[this.capacity];
	}

	public static boolean isFull() {
		if (size == capacity) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public static void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full!!");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queue[rear] = data;
			size++;
			System.out.println("Data added!!");
		}
	}

	public static void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queue[front - 1] + " removed!");
				front = 0;
			} else {
				System.out.println(queue[front - 1] + "removed!!");
			}
			size--;
		}
	}

//
//	protected static int queue[];
//	protected static int front;
//	protected static int rear;
//	protected static int size;
//	protected static int len;
//
//	public QueueUtility(int n) {
//		size = n;
//		len = 0;
//		queue = new int[size];
//		front = -1;
//		rear = -1;
//	}
//
//	public static boolean isEmpty() {
//		return front == -1;
//	}
//
//	public static boolean isFull() {
//		return front == 0 && rear == size - 1;
//	}
//
//	public static int getSize() {
//		return len;
//	}
//
//	public static int peek() {
//		if (isEmpty()) {
//			throw new NoSuchElementException("Underflow");
//		}
//		return queue[front];
//	}
//
//	public static void enqueue(int i) {
//		if (rear == -1) {
//			front = 0;
//			rear = 0;
//			queue[rear] = i;
//		} else if (rear + 1 >= size) {
//			throw new IndexOutOfBoundsException("OverFlow Exception");
//		} else if (rear + 1 < size) {
//			queue[++rear] = i;
//			len++;
//		}
//
//	}
//
//	public static int dequeue() {
//		if (isEmpty()) {
//			throw new NoSuchElementException("Underflow exception");
//		} else {
//			len--;
//			int element = queue[front];
//			if (front == rear) {
//				front = -1;
//				rear = -1;
//			}
//			else
//				front++;
//			return element;
//		}
//	}
//	
//	public static void show() {
//		System.out.println("\nQueue: ");
//		if(len==0) {
//			System.out.println("Empty\n");
//			return;
//		}
//		for(int i=front; i<=rear; i++) {
//			System.out.println(queue[i]+" ");
//			System.out.println();
//		}
//	}

}
