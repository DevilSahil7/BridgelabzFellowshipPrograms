package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: simulation of banking counter
 * 
 * @author sahil
 *
 */
public class BankingCashCounter {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of users: ");
		
		int users= Utility.IntegerInput();
		
			QueueUtility.enqueue(users);
		

	}

}
