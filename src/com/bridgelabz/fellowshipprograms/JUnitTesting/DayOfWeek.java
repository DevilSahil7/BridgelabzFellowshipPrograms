package com.bridgelabz.fellowshipprograms.junittesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to find day of week
 * 
 * @author Sahil Kudake
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter day: ");
		int day = Utility.IntegerInput();
		System.out.println("Enter month: ");
		int month = Utility.IntegerInput();
		System.out.println("Enter year: ");
		int year = Utility.IntegerInput();
		int dayOfWeek = Utility.dayOfWeek(day, month, year);

		switch (dayOfWeek) {
		case 0:
			System.out.println("Its Sunday");
			break;
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		}
	}

}
