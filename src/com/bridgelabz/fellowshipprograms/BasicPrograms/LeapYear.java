package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find year is leap year or not
 * 
 * @author sahil
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter any year to check leap year: ");
		int year = Utility.IntegerInput();
		Utility.leapYear(year);
	}

}
