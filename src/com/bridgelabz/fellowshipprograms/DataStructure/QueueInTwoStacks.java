package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUtility2;
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
				QueueUtility.enqueue(arr[i][j]);
			}
		}
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				StackUtility.push(QueueUtility.dequeueFront());
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 1");
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				items = StackUtility.pop();
				StackUtility2.push(items);
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 2");
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				items = StackUtility2.pop();
				System.out.print(items+"\t");
			}
			System.out.println();
		}

	}

}
