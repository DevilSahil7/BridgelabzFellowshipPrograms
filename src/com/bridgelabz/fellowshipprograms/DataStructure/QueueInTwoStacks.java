package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUsingLinkedListUtility2;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class QueueInTwoStacks {

	public static void main(String[] args) {
		
		String items;
		System.out.print("Enter month: ");
		int month = Utility.IntegerInput();
		System.out.print("Enter year: ");
		int year = Utility.IntegerInput();
		
		String [][] arr = Utility.createCalendar(month, year);
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				QueueUsingLinkedListUtility.enqueue(arr[i][j]);
			}
		}
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				StackUsingLinkedListUtility.push(QueueUsingLinkedListUtility.dequeueFront());
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 1");
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				items = StackUsingLinkedListUtility.pop();
				StackUsingLinkedListUtility2.push(items);
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 2");
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				items = StackUsingLinkedListUtility2.pop();
				System.out.print(items+"\t");
			}
			System.out.println();
		}

	}

}
