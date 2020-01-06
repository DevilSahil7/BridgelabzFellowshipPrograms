package com.bridgelabz.fellowshipprograms.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.bridgelabz.fellowshipprograms.utility.Utility.Node;

public class LinkedListDemo {

	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static void insert(int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public static void delete(int key) throws FileNotFoundException {
		Node currentNode = head;
		int temp = 0;
		while (currentNode.next != null) {
			if (currentNode.next.data== key) { // checking the user input with currentNode data
				currentNode.next = currentNode.next.next; // if equals then inserting data of next node into current
															// node
				temp++; // counting temp

			} else
				currentNode = currentNode.next; // traversing linkedlist
		}
		if (temp == 0) { // if temp is 0 means the user input not found
			System.out.println("not found. Adding word to link list....");
			insert(key);
		} else {
			System.out.println("found and deleted");
		}
		printLinkedList();
	}
	
	public static void printLinkedList() throws FileNotFoundException { // linkedlist to print string
		Node currentNode = head;
		PrintWriter pw = new PrintWriter(new File("/home/admin1/Documents/file.txt")); // giving file location to store
																						// the data
		while (currentNode.next != null) {
			System.out.print(currentNode.data + "-->"); // printing every data data
			pw.print(currentNode.data); // writing existing data in external file
			pw.print("->");
			currentNode = currentNode.next;
		}
		pw.print(currentNode.data); // writing added data or removing removed data
		pw.flush();
		System.out.println(currentNode.data); // displaying data
	}
	
	public static void deleteByKey(int key)
	{
		Node currentNode = head;
		Node prev= null;
		
		if(currentNode!=null && currentNode.data==key)
		{
			head=currentNode.next;
			System.out.println(key+ " found and deleted!");
			
		}
		while(currentNode!=null && currentNode.data!=key)
		{
			prev= currentNode;
			currentNode=currentNode.next;
		}
		if(currentNode!=null)
		{
			prev.next=currentNode.next;
			System.out.println(key+" found and deleted!!");
		}
		if(currentNode==null)
		{
			System.out.println(key+" not found!!");
		}
	}
	
	public static void printList()
	{
		Node currentNode=head;
		
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+"-->");
			currentNode=currentNode.next;
		}
		System.out.println();
	}
	
	public static void insertAtStart(int data)
	{
		Node newNode= new Node(data);
		newNode.data=data;
		newNode.next=null;
		newNode.next=head;
		head= newNode;
		
	}
	
	public static void insertAtIndex(int index, int data)
	{
		Node newNode= new Node(data);
		newNode.data=data;
		newNode.next=null;
		Node n=head;
		if(index==0)
		{
			insertAtStart(data);
		}
		for(int i=0; i<index-1; i++)
		{
			n=n.next;
		}
		newNode.next=n.next;
		n.next=newNode;
	}
	
	public static void deleteAtIndex(int index)
	{
		Node n= head;
		for(int i=0; i<index-1; i++)
		{
			n=n.next;
		}
		n.next=n.next.next;
	}
	
	public static void deleteLast()
	{
		Node n= head;
		while(n.next.next!=null)
		{
			n=n.next;
		}
		n.next=null;
	}
	
	public static void loop()
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=head;
	}
	
	

}
