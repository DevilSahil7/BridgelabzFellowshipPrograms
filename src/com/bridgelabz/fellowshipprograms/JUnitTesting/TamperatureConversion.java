package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class TamperatureConversion {

	public static void main(String[] args) {
		System.out.println("1.Celcius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celcius");
		System.out.println("Enter your choice: ");
		int choice = Utility.IntegerInput();
		System.out.print("Enter temperature: ");
		double temp = Utility.doubleInput();
		Utility.temperatureConversion(temp, choice);

	}

}
