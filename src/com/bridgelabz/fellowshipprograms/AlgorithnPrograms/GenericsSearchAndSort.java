package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

import java.util.ArrayList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class GenericsSearchAndSort {
	public static void search(String s, String f) {
		String a[] = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		if (al.contains(f)) {
			System.out.println("found");
		} else
			System.out.println("not found");
	}

			

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		String s = Utility.stringInput();
		
		//search(s, f);
		String arr[]=s.split(" ");
		arr=Utility.bubbleSortGeneric(arr);
		for(String a: arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter element to find: ");
		String key = Utility.stringInput();
		int n=Utility.binarySearchGeneric(arr, 0, arr.length-1, key);
		if(n==-1) 
			System.out.println("not found");
		else
			System.out.println("found at "+n);
		
	}

}
