package com.bridgelabz.fellowshipprograms.utility;

import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility.Node;

public class QueueUtility {

	static int[] arr;
	// static int capacity = 5;
	static int front = -1;
	static int rear = -1;
	static int amount = 50000;
	static int money;
	static int check;

	public static boolean isFull() {
		return (rear == 5);
	}

	public static void transaction() {
		System.out.println("Enter your choice: \n1.Deposite \n2.Withdraw");
		int n = Utility.IntegerInput();
		switch (n) {
		case 1:
			System.out.println("Enter amount to deposite: ");
			money = Utility.IntegerInput();
			check = 1;
			dequeue(money, check);
			break;
		case 2:
			System.out.println("Enter amount to withdraw: ");
			money = Utility.IntegerInput();
			check = 0;
			dequeue(money, check);
			break;

		default:
			System.out.println("Enter correct choice");

		}

	}

	public static void enqueue(int users) {

		for (int i = 1; i <= users; i++) {
			transaction();
		}	
	}

	public static void dequeue(int money, int check) {
		if (check == 1) {
			amount = amount + money;
			System.out.println("deposited successfully!");
		} else {
			if (money < amount) {
				amount = amount - money;
				System.out.println("Withdraw successfull!");
			}else {
				System.out.println("Not enough money");
			}
		}
	}
	
	static Node head;
	public static class Node {
		char data2;
		Node next;
		Node(char d){
			data2 = d;
			next = null;
		}
	}
	
	public static void insertDequeue(char data) {
		System.out.println(data);
		Node newNode = new Node(data);
		Node n = head;
		if (head == null) {
			head = newNode;
		} else {
			
			while (n.next != null) {

				n = n.next; // traversing linkedlist while n.next is not null
			}
			n.next = newNode; // when null found, inserting new node of String
		}
		
	}
	public static void printDequeue() { 
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data2 + "-->");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public static char dequeueFront() {
		char data;
		Node n = head;
		data = n.data2;
		head = n.next;
		return data;
	}
	
	public static char dequeueRear() {
		char data;
		Node n = head;
		Node prev = n;
		while(n.next!=null) {
			prev = n;
			n = n.next;
		}
		data = n.data2;
		prev.next=null;
		return data;
	}
}
