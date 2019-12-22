package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: customizing the message using regular expression
 * 
 * @author sahil
 *
 */
public class Regex {

	public static void main(String[] args) {

		String str = "Hello <<name>> we have your full name as <<fullname>>. Your contact number is 91-xxxxxxxxxx. Today's data is xx/xx/xxxx";
		System.out.println("Enter your name: ");
		String name = Utility.stringInput();
		System.out.println("Enter your full name: ");
		String fullName = Utility.stringInput();
		System.out.println("Enter your mobile number: ");
		String mobNo = Utility.stringInput();
		System.out.println("Enter today's date in dd/mm/yyyy: ");
		String date = Utility.stringInput();
		str = str.replace("<<name>>", name);
		str = str.replace("<<fullname>>", fullName);
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m= p.matcher(mobNo);
		if(m.find())
			str=str.replace("xxxxxxxxxx", mobNo);
		Pattern p1= Pattern.compile("[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");
		Matcher m1= p1.matcher(date);
		if(m1.find())
			str=str.replace("xx/xx/xxxx", date);
		System.out.println(str);
	}

}
