package com.bridgelabz.fellowshipprograms.basicprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to find year is leap year or not
 * 
 * @author Sahil Kudake
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter any year to check leap year: ");
		int year = Utility.IntegerInput();
		if(Utility.leapYear(year)==true) 
			System.out.println(year+" is leap year");
		else 
			System.out.println(year+" is not leap year");
		
	}
}
