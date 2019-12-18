package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

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
