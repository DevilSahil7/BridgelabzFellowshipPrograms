package com.bridgelabz.fellowshipprograms.utility;

public class StackUsingLinkedListUtility {

	class Node{
		int data;
		Node link;
	}
	Node top;
	public StackUsingLinkedListUtility() {
		this.top=null;
	}
	
	public void push(int x) {
		Node temp = new Node();
		        
		temp.data=x;
		temp.link=top;
		top=temp;
	}
	public boolean isEmpty() {
		return top==null;
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("stack underflow");
			return;
		}
		top=(top).link;
	}
	
	public void display() {
		if(top==null) {
			System.out.println("stack underflow");
			return;
		}
		else {
			Node temp= top;
			while(temp!=null) {
				System.out.println(temp.data+"-->");
				temp=temp.link;
			}
		}
	}
}
