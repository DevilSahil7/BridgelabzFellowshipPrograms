package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.QueueUsingLinkedListUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to check the days of the week using queue using linked list
 * 
 * @author Sahil Kudake
 */
public class DaysOfWeek {

	public static void main(String[] args) {
		int week, month, year;
		do {
			System.out.println("Enter week from 1-5: ");
			week = Utility.IntegerInput();
			System.out.print("Enter month from 1-12: ");
			month = Utility.IntegerInput();
			System.out.print("Enter a year: ");
			year = Utility.IntegerInput();
		}while(week>0 && week<6 == false||month>12 && month <1);
		
		String calendar[][]= Utility.createCalendar(month, year);
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(week ==i) {
					if(calendar[i][j]!="") {
						QueueUsingLinkedListUtility.enqueue(calendar[i][j]);
					}
				}
			}
		}
		System.out.println("Dates of week are: ");
		QueueUsingLinkedListUtility.printQueue();
	}

}
