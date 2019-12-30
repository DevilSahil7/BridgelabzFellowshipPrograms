package com.bridgelabz.fellowshipprograms.utility;


/**
 * purpose: to perform queue operations
 * 
 * @author admin1
 *
 */
public class QueueUtility {

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
}
