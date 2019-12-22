package com.bridgelabz.fellowshipprograms.BasicPrograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: replacing usser's name in a message
 * 
 * @author sahil
 *
 */
public class HelloUser {

	public static void main(String[] args) {
		String s = "Hello username, how are you?";
		System.out.println("Enter your name: ");
		String name = Utility.stringInput();
		String ns = s.replaceAll("username", name);
		System.out.println(ns);

	}

}
