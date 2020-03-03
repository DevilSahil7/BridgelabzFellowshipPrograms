package com.bridgelabz.fellowshipprograms.datastructure;


/**
 * Purpose : To perform linked list operations
 * 
 * @author Sahil Kudake
 *
 */
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
	
	public static LinkedListDemo insert(LinkedListDemo list, int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		
		if(list.head==null)
		{
			list.head=newNode;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	
	public static LinkedListDemo deleteByKey(LinkedListDemo list, int key)
	{
		Node currentNode = list.head;
		Node prev= null;
		
		if(currentNode!=null && currentNode.data==key)
		{
			list.head=currentNode.next;
			System.out.println(key+ " found and deleted!");
			return list;
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
		return list;
	}
	
	public static void printList(LinkedListDemo list)
	{
		Node currentNode=list.head;
		
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
	
	public static void main(String[] args) {

		LinkedListDemo list= new LinkedListDemo();
		
		list= insert(list, 1);
		list= insert(list, 2);
		list= insert(list, 3);
		list= insert(list, 4);
		list= insert(list, 5);
		list= insert(list, 6);
		list= insert(list, 7);

		printList(list);
		System.out.println();
		deleteByKey(list, 2);
		System.out.println();
		insertAtStart(25);
		printList(list);
		
		deleteAtIndex(2);
		deleteLast();
		
		printList(list);
	}

}
