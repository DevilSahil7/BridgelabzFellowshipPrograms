package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: to check the parentheses are balanced or not
 * 
 * @author Sahil Kudake
 *
 */
public class BalancedParentheses {

	public static void main(String[] args) {
		char exp[] = { '{', '[', '(', ')', ']', '}' };
		if (Utility.isBalanced(exp))
			System.out.println("Balanced");
		else
			System.out.println("not Balanced");

	}

}
