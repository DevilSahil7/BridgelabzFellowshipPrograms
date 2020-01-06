package com.bridgelabz.fellowshipprograms.Practice;

import java.io.File;
import java.util.Scanner;
import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.LinkedListUtility;

public class hash {
	static Object[] ob = new Object[11];

	public static LinkedListUtility<Integer> inputFromFile() throws Exception {
		LinkedListUtility<Integer> intlist = new LinkedListUtility<Integer>();
		File file = new File("/home/admin1/Documents/number.txt");
		Scanner s = new Scanner(file);
		while (s.hasNextInt())
		{
			intlist.insert(s.nextInt());
		}
		// LinkedListUtility.show();
		return intlist;
	}

	public static void getvalue(int key, int data) {
		LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[key];
		if (LinkedListUtility.search(data)) {
			LinkedListUtility.deleteAtIndex((int) list.index(data));

		} else {
			list.insert(data);
		}
		 list.show();
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < ob.length; i++) {
			ob[i] = new LinkedListUtility<Integer>();
		}
		LinkedListUtility<Integer> input = inputFromFile();
		for (int i = 0; i < input.size(); i++) {

			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[(i % 11)];
			list.insert(i);
		}
		
		
		for (int i = 0; i < ob.length; i++) {

			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[i];
			System.out.println();
			list.show();

		}

		System.out.println();
		System.out.println("Enter a data to search ");
		int data = Utility.IntegerInput();

		getvalue(data%11,data);
		//Hashing.writeToFile(input));
	}

}
