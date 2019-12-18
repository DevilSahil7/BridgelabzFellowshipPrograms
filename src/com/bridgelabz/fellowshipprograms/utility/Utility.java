package com.bridgelabz.fellowshipprograms.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int IntegerInput() {
		return sc.nextInt();
	}

	public static double doubleInput() {
		return sc.nextDouble();
	}

	public static String stringInput() {
		return sc.nextLine();
	}

	public static Long longInput() {
		return sc.nextLong();
	}

	public static int[] count(int n) 	//to get the digits from number 
	{
		int[] count = new int[10]; 		
		int temp = n;
		while (temp != 0) {
			int r = temp % 10; 	
			count[r]++; 
						
			temp = temp / 10; 
								
		}
		return count; 					//count array to be stored in n1count
	}

	public static boolean anagram(int n1, int n2) 
	{
		int[] n1count = count(n1); 		//generating digits from number
									
		int[] n2count = count(n2); 		//generating digits from number
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	public static void isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("No is prime!!!");
		else
			System.out.println("No is not prime!!!");
	}

	public static void flipCoin(int chance) {
		int heads = 0;
		int tails = 0;
		int flip = 1;

		while (flip <= chance) {
			if (Math.random() < 0.5) {   //half half possibility of both heads and tails
				heads++;
			} else
				tails++;
			flip++;
		}
		System.out.println("Heads appeared " + heads + " times");
		System.out.println("Tails appeared " + tails + " times");
	}

	public static void leapYear(int year) {
		int length = Integer.toString(year).length();
		if (length != 4) {
			System.out.print("Enter correct year: ");
			year = Utility.IntegerInput();
			leapYear(year);
		} else {
			if (year % 100 == 0 || year % 400 == 0 || year % 4 == 0)		
				System.out.println(year + " is leap year");
			else
				System.out.println(year + " is not leap year");
		}
	}

	public static void powerOfTwo(int power) {
		if (power >= 0 && power <= 31) {				//integer value exceeds when power to the base 2 goes above 31
			for (int i = 0; i < power; i++) {
				int res = (int) Math.pow(2, i);			
				System.out.println("2^" + i + " is " + res);
			}
		} else {
			System.out.println("Enter power between 0 and 31: ");
			power = Utility.IntegerInput();
			powerOfTwo(power);
		}
	}

	public static void harmonic(double harmonic) {
		double hr = 1;
		for (int i = 2; i <= harmonic; i++) {
			hr = hr + (float) 1 / i;
		}
		System.out.println("Harmonic number is " + hr);
	}

	public static void primeFactors(int num) {
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + ", ");
				num = num / i;
			}
		}
	}

	public static void matrix(int rows, int cols) {
		// storing elements in matrix
		int arr[][] = new int[rows][cols];
		System.out.println("Enter elements in matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = Utility.IntegerInput();			//storing elements in matrix
			}
		}

		// printing matrix in console
		PrintWriter w = new PrintWriter(System.out);		//using PrintWriter to display matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				w.print(arr[i][j] + " ");					
			}
			w.println();
		}

		// writing matrix in external file
		PrintWriter w1 = null;
		try {
			w1 = new PrintWriter(new File("D:\\matrixtext.txt"));  //writing matrix to the external file
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					w1.print(arr[i][j] + " ");
				}
				w1.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		w.flush();
		w1.flush();
		w.close();
		w1.close();
	}

	public static void triplet(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("The triplets are: " + arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void euclideanDistance(double x, double y) {
		double xx = Math.pow(x, 2);
		double yy = Math.pow(y, 2);
		double distance = Math.sqrt(xx + yy);
		System.out.println("Euclidean distance from 0 is: " + distance);
	}

	public static void quadratic(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The roots are: " + x1 + " " + x2);
	}

	public static void windchill(double temp, double speed) {
		double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * (Math.pow(speed, 0.16));
		System.out.println("WindChill is " + w);
	}

	public static void gambler(int stake, int goal, int trials) {
		int bets = 0, wins = 0;

		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {		//cash should be greater than 0 and less than goal to play
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		System.out.println(wins + " wins of " + trials + " trails");
		System.out.println("Percentage of wins are: " + wins * 100 / trials);
		System.out.println("Percentage of loss are: " + (trials - wins) * 100 / trials);
	}

	public static void generateCoupon() {
		int max = 1000000000;
		char[] ch = "qwertyuiopasdfghjklzxcvbnm0123456789".toCharArray();
		int random = (int) (Math.random() * max);    //generates random number
		StringBuilder sb = new StringBuilder();
		while (random > 0) {
			sb.append(ch[random % ch.length]);
			random /= ch.length;
		}
		String coupon = sb.toString();
		System.out.println(coupon);

	}

	public static void stopwatch() {
		double start = 0, end = 0, play, stop;
		System.out.println("Enter 1 to start");
		play = Utility.doubleInput();
		start = System.currentTimeMillis();			//gets the current time
		System.out.println("Enter 2 to stop");
		stop = Utility.doubleInput();
		end = System.currentTimeMillis();			//gets the current time
		double result = (end - start) / 1000;		//gives the result of elapsed time
		System.out.println(result + " seconds");
	}

	public static void dayOfWeek(int d, int m, int y) {
		int day, month, year;
		year = y - (14 - m) / 12;
		int x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;

		switch (day) {
		case 0:
			System.out.println("Its Sunday");
			break;
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		}
	}

	public static void temperatureConversion(double temp, int choice) {
		switch (choice) {
		case 1:
			double ctf = (temp * 9 / 5) + 32;					//celcius to fahrenheit conversion
			System.out.println(temp + " Celcius is " + ctf + " Fahrenheit.");
			break;
		case 2:
			double ftc = (temp - 32) * 5 / 9;					//fahrenheit to celcius conversion
			System.out.println(temp + " Fahrenheit is " + ftc + " Celcius.");
			break;
		default:
			System.out.println("Enter valid input!!");
		}
	}

	public static void monthlyPayment(double principal, double year, double interest) {
		double n = 12 * year;
		double r = interest / (12 * 100);
		double payment = (principal * r) * (1 - (Math.pow(1 + r, -n)));
		double total = principal / (year * 12);
		double result = total + payment;
		System.out.println(result);
	}

	public static void sqrt(double num, double epsilon) {
		double t = num;
		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		System.out.println(t);
	}

	public static void toBinary(int num) {
		int arr[] = new int[8];
		int i = 0;
		while (num > 0) {
			arr[i] = num % 2;					//storing 1 and 0 in array
			num = num / 2;		
			i++;
		}
		System.out.print("The binary is: ");
		for (int j = i; j >= 0; j--) {				//reversing the array to print the correct binary output
			System.out.print(arr[j]);
		}
		System.out.println();
	}

	public static void swapNibble(int num) {
		int newNum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);	//using 0F to & whose value is 0000 1111 to preserve right side
		System.out.println("New no is: " + newNum);				//bits and left shifting them by 4
		toBinary(newNum);										//using F0 to & whose value is 1111 0000 to preserve left side
		boolean status = false;									//bits and right shifting them by 4
		for (int i = 0; i < 8; i++) {							//performing 'or' operation on both to merge the bits	
			if (newNum == Math.pow(2, i)) {
				status = true;
			}
		}
		if (status) {
			System.out.println("The no is power of 2.");
		} else
			System.out.println("The no is not power of 2.");
	}

	public static void permutation(String str, int sp, int ep) {
		if (sp == ep) {
			System.out.println(str);
		} else {
			for (int i = sp; i < ep; i++) {
				str = swap(str, sp, i);
				permutation(str, sp + 1, ep);
			}
		}
	}

	public static String swap(String str, int i, int j) {
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

	public static int binarySearch(String arr[], String key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int res = key.compareTo(arr[mid]);	
			if (res == 0)
				return mid;
			if (res < 0)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static void insertionSort(int arr[]) {
		int temp, j;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void anagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();    		//converting string to char array
		char[] ch2 = str2.toCharArray();
		boolean status = false;
		if (ch1.length != ch2.length) {				
			status = false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i])				//checking value of every index of both arrays
					status = true;
				else
					status = false;
			}
		}
		if (status)
			System.out.println("The strings are anagram.");
		else
			System.out.println("Not anagram.");
	}

	public static ArrayList<Integer> primeNoRange(int n) {
		int num = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0)
					counter = counter + 1;
			}
			if (counter == 2)
				al.add(i); 				// it will store all prime no is list al
		}
		return al;					 // it will return prime no list to main method
	}

	public static int[] primeAnagram(ArrayList<Integer> al) {
		int k = 0;
		int arr[] = new int[170];
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (anagram(al.get(i), al.get(j))) 			// it will check anagram function
				{
					
					arr[k] = al.get(i);						//stores first anagram number in array
					k++;									//increments index of array
					arr[k] = al.get(j);						//stores second anagram number in array
					k++;									//increments index of array
				}
			}
		}
		return arr;											//returns array of prime anagrams
	}

	public static ArrayList<Integer> isPallindrome(ArrayList<Integer> a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int n : a) {
			int temp = n;
			int sum = 0;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if (sum == n)
				arr.add(sum);
		}
		return arr;
	}

	public static LinkedList<String> readFile(String path) throws IOException {
		LinkedList<String> ll = new LinkedList<String>();
		File file = new File(path);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String strwords[] = in.readLine().split(" ");			//storing file data in array
		for (int i = 0; i < strwords.length; i++) {
			ll.add(strwords[i]);								//adding array to ArrayList
		}
		in.close();
		return ll;												//returning list
	}

	static Node head;

	public static class Node {

		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	public static void insertLinkedList(String data) {
		System.out.println(data);
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			while (n.next != null) {

				n = n.next;
			}
			n.next = newNode;
		}
	}

	public static void deleteByKey(String key) {
		Node currentNode = head;
		Node prev = null;
		if (currentNode != null && currentNode.data == key) {
			head = currentNode.next;
			System.out.println("found and deleted");
		}
		while (currentNode != null && currentNode.data != key) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode != null) {
			prev.next = currentNode.next;
			System.out.println("found and deleted");
		}
		if (currentNode == null) {
			System.out.println("not found");
		}

		printLinkedList();
	}

	public static void printLinkedList() {
		Node currentNode = head;
		while (currentNode.next != null) {
			System.out.print(currentNode.data + "-->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}

}
