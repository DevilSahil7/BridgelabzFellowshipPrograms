package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: Check the string is palindrome or not using dequeue
 * 
 * @author Sahil Kudake
 *
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter a string to check palindrome: ");
		String str = Utility.stringInput();
		int mid = str.length() / 2;
		for (int j = str.length() - 1; j >= 0; j--) {
			QueueUsingLinkedListUtility.enqueue(str.charAt(j)); // adding data to queue
		}
		QueueUsingLinkedListUtility.printQueue();

		char c1, c2;
		int i = 0;
		int flag = 0;
		while (i < mid) {
			c1 = QueueUsingLinkedListUtility.dequeueFront(); //taking first element from front of queue
			System.out.println();
			System.out.print(c1);
			c2 = QueueUsingLinkedListUtility.dequeueRear();// taking last element from rear of queue
			System.out.print(c2);
			System.out.println();

			if ((c1 == c2) != true) { //comparing the elements of front and rear one by one
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 1)
			System.out.println("String is not palindrome");
		else
			System.out.println("String is palindrome");
	}

}
