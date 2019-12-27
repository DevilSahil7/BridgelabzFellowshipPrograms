package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: Check the string is palindrome or not using dequeue
 * 
 * @author sahil
 *
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter a string to check palindrome: ");
		String str = Utility.stringInput();
		int mid = str.length() / 2;
		for (int j = str.length() - 1; j >= 0; j--) {
			QueueUtility.enqueue(str.charAt(j));

		}
		QueueUtility.printQueue();

		char c1, c2;
		int i = 0;
		int flag = 0;
		while(i<mid) {
			c1 = QueueUtility.dequeueFront();
			System.out.println();
			System.out.print(c1);
			c2 = QueueUtility.dequeueRear();
			System.out.print(c2);
			System.out.println();
			
			if((c1==c2)!=true) {
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1) {
			System.out.println("String is not palindrome");
		}
		else {
			System.out.println("String is palindrome");
		}
	}

}
