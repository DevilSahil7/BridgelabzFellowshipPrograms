package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to show the calendar of month
 * 
 * @author sahil kudake
 *
 */
public class Calendar {

	public static void main(String[] args) {
		System.out.print("Enter Month: ");
		int month = Utility.IntegerInput();
		System.out.print("Enter year: ");
		int year = Utility.IntegerInput();
		String calendar[][] = Utility.createCalendar(month, year);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("\t" + calendar[i][j]);
			}
			System.out.println();
		}
	}

}
