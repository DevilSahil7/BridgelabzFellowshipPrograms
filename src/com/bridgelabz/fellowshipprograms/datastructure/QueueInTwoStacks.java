package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.StackUsingLinkedListUtility2;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose : Display calendar using queue in two stacks
 * 
 * @author Sahil Kudake
 *
 */
public class QueueInTwoStacks {

	public static void main(String[] args) {

		String items;
		System.out.print("Enter month: ");
		int month = Utility.IntegerInput();
		System.out.print("Enter year: ");
		int year = Utility.IntegerInput();

		String[][] arr = Utility.createCalendar(month, year);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				QueueUsingLinkedListUtility.enqueue(arr[i][j]);// adding calendar data into queue
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				StackUsingLinkedListUtility.push(QueueUsingLinkedListUtility.dequeueFront());// removinf from front and
																								// pushing it to stack
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 1");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				items = StackUsingLinkedListUtility.pop(); // removing items from stack
				StackUsingLinkedListUtility2.push(items); // pushing removed items from stack to another stack
			}
		}
		System.out.println();
		System.out.println("Popped items from stack 2");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				items = StackUsingLinkedListUtility2.pop(); // removing items from stack2
				System.out.print(items + "\t");
			}
			System.out.println();
		}

	}

}
