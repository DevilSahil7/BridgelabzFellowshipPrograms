package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find day of week
 * 
 * @author sahil
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter day: ");
		int d = Utility.IntegerInput();
		System.out.println("Enter month: ");
		int m = Utility.IntegerInput();
		System.out.println("Enter year: ");
		int y = Utility.IntegerInput();
		int day = Utility.dayOfWeek(d, m, y);

		switch (day) {
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
