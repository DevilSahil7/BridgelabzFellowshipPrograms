package com.bridgelabz.fellowshipprograms.utility;

public class QueueUtility<E> {

	int front, rear, size;
	int capacity;
	int arr[];
	
	public QueueUtility(int capacity) {
		this.capacity = capacity;
		front = this.size =0;
		rear = capacity-1;
		arr = new int[this.capacity];
		
	}

	boolean isFull(QueueUtility<E> queueUtility) {
		return (queueUtility.size==queueUtility.capacity);
	}
	boolean isEmpty(QueueUtility<E> queueUtility) {
		return (queueUtility.size==0);
	}
	
	
}
