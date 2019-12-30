package com.bridgelabz.fellowshipprograms.Practice;

import com.bridgelabz.fellowshipprograms.utility.StackUtility;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("Enter integers to  push in to stack: ");
		for(int i=0; i<5; i++) {
			int x = Utility.IntegerInput();
			StackUtility.push(x);
		}
		System.out.println();
		System.out.print("popped elemens are: ");
		for(int i = 0; i<5; i++) {
			int a = StackUtility.pop();
			System.out.print(a+" ");
		}
	}

}
