package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: simulation of banking cash counter
 * 
 * @author sahil kudake
 *
 */
public class BankingCashCounter {

	public static void main(String[] args) {
		int i, bankBalance = 70000;
		System.out.print("Enter number of users: ");
		int users = Utility.IntegerInput();
		System.out.println("Enqueueing people...\n");
		QueueUtility nw = new QueueUtility(users);
		for (i = 0; i < users; i++) {
			QueueUtility.enqueue(i); // adding users to the queue
		}
		for (i = 0; i < users; i++) {
			bankBalance = Utility.transactions(bankBalance); // users transactions
		}

	}

}
