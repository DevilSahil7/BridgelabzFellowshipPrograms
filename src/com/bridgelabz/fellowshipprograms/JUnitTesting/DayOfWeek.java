package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter day: ");
		int d = Utility.IntegerInput();
		System.out.println("Enter month: ");
		int m = Utility.IntegerInput();
		System.out.println("Enter year: ");
		int y = Utility.IntegerInput();
		Utility.dayOfWeek(d, m, y);

	}

}
