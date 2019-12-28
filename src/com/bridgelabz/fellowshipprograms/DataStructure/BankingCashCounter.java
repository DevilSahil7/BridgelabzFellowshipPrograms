package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		int i, bankBalance=70000;
		System.out.print("Enter number of users: ");
		int users = Utility.IntegerInput();
		System.out.println("Enqueueing people...\n");
		for(i=0; i<users; i++) {
			QueueUsingLinkedListUtility.enqueue(i);
		}
		for(i=0; i<users; i++) {
			bankBalance = Utility.transactions(bankBalance);
		}

	}

}
