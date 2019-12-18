package com.bridgelabz.fellowshipprograms.FunctionalPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter temperature: ");
		double temp = Utility.doubleInput();
		System.out.println("Enter speed: ");
		double speed = Utility.doubleInput();
		Utility.windchill(temp, speed);
	}

}
