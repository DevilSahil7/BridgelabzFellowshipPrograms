package com.bridgelabz.fellowshipprograms.junittesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * Purpose: to calculate monthly payment
 * 
 * @author Sahil Kudake
 *
 */
public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.print("Enter principal amount: ");
		double principal = Utility.doubleInput();
		System.out.print("Enter years: ");
		double year = Utility.doubleInput();
		System.out.print("Enter Rate of interest: ");
		double interest = Utility.doubleInput();
		Utility.monthlyPayment(principal, year, interest);

	}

}
