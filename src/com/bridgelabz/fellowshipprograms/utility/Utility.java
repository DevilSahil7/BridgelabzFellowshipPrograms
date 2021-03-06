package com.bridgelabz.fellowshipprograms.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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

	public static int[] count(int n) // to get the digits from number
	{
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;

			temp = temp / 10;

		}
		return count; // count array to be stored in n1count
	}

//<=================================Anagram==========================================>

	/**
	 * purpose: to check two strings are anagram or not
	 * 
	 * @param n1 : String 1
	 * @param n2 : String 2
	 * @return : true or false
	 */
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1); // generating digits from number

		int[] n2count = count(n2); // generating digits from number
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

//<=================================Prime Number==========================================>

	/**
	 * purpose: to check number is prime or not
	 * 
	 * @param num : number to check prime
	 */
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

//<=================================Flip Coin==========================================>

	/**
	 * @param chance : User's chances
	 */
	public static void flipCoin(int chance) {
		int heads = 0;
		int tails = 0;
		int flip = 1;

		while (flip <= chance) {
			if (Math.random() < 0.5) { // half half possibility of both heads and tails
				heads++;
			} else
				tails++;
			flip++;
		}
		System.out.println("Heads appeared " + heads + " times");
		System.out.println("Tails appeared " + tails + " times");
	}

//<=================================Leap Year==========================================>

	/**
	 * purpose: to check the leap year
	 * 
	 * @param year
	 * @return true or false
	 */
	public static boolean leapYear(int year) {
		int count = 0;
		int length = Integer.toString(year).length();
		if (length != 4) {
			System.out.print("Enter correct year: ");
			year = Utility.IntegerInput();
			leapYear(year);
		} else {
			if (year % 100 == 0 || year % 400 == 0 || year % 4 == 0) {
				count++;
			}
		}
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

//<=================================Power of 2==========================================>

	/**
	 * purpose: to print the power of 2 up to given number
	 * 
	 * @param power
	 */
	public static void powerOfTwo(int power) {
		if (power >= 0 && power <= 31) { // integer value exceeds when power to the base 2 goes above 31
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

//<=================================Harmonic Number==========================================>

	/**
	 * purpose: to print the harmonic number of given number
	 * 
	 * @param harmonic
	 */
	public static void harmonic(double harmonic) {
		double hr = 1;
		for (int i = 2; i <= harmonic; i++) {
			hr = hr + (float) 1 / i;
		}
		System.out.println("Harmonic number is " + hr);
	}

//<=================================Prime Factors==========================================>

	/**
	 * purpose: to print the prime factors of given number
	 * 
	 * @param num
	 */
	public static void primeFactors(int num) {
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + ", ");
				num = num / i;
			}
		}
	}

	public static long factorial(int n) {
		long sum = 1;
		for (int i = n; i > 0; i--) {
			sum = sum * i;
		}
		return sum;
	}

//<=================================2D Matrix==========================================>

	/**
	 * purpose: to print the 2D matrix and store it in file
	 * 
	 * @param rows
	 * @param cols
	 */
	public static void matrix(int rows, int cols) {
		// storing elements in matrix
		int arr[][] = new int[rows][cols];
		System.out.println("Enter elements in matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = Utility.IntegerInput(); // storing elements in matrix
			}
		}

		// printing matrix in console
		PrintWriter w = new PrintWriter(System.out); // using PrintWriter to display matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				w.print(arr[i][j] + " ");
			}
			w.println();
		}

		// writing matrix in external file
		PrintWriter w1 = null;
		try {
			w1 = new PrintWriter(new File("D:\\matrixtext.txt")); // writing matrix to the external file
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

//<=================================Triplet==========================================>

	/**
	 * purpose: to find sum of three numbers is zero
	 * 
	 * @param arr
	 */
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

//<=================================Euclidean Distance==========================================>

	/**
	 * purpose: to find the euclidean distance
	 * 
	 * @param x
	 * @param y
	 */
	public static void euclideanDistance(double x, double y) {
		double xx = Math.pow(x, 2);
		double yy = Math.pow(y, 2);
		double distance = Math.sqrt(xx + yy);
		System.out.println("Euclidean distance from 0 is: " + distance);
	}

//<=================================Roots of Equation==========================================>

	/**
	 * purpose: to find the roots of quadratic equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The roots are: " + x1 + " " + x2);
	}

//<=================================WindChill==========================================>

	public static void windchill(double temp, double speed) {
		double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * (Math.pow(speed, 0.16));
		System.out.println("WindChill is " + w);
	}

//<=================================Gambler==========================================>

	public static void gambler(int stake, int goal, int trials) {
		int bets = 0, wins = 0;

		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) { // cash should be greater than 0 and less than goal to play
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

//<=================================Coupon code==========================================>

	/**
	 * purpose: to generate random coupon number
	 * 
	 * 
	 */
	public static void generateCoupon() {
		int max = 1000000000;
		char[] ch = "qwertyuiopasdfghjklzxcvbnm0123456789".toCharArray();
		int random = (int) (Math.random() * max); // generates random number
		StringBuilder sb = new StringBuilder();
		while (random > 0) {
			sb.append(ch[random % ch.length]);
			random /= ch.length;
		}
		String coupon = sb.toString();
		System.out.println(coupon);

	}

//<=================================Stopwatch==========================================>

	public static void stopwatch() {
		double start = 0, end = 0, play, stop;
		System.out.println("Enter 1 to start");
		play = Utility.doubleInput();
		start = System.currentTimeMillis(); // gets the current time
		System.out.println("Enter 2 to stop");
		stop = Utility.doubleInput();
		end = System.currentTimeMillis(); // gets the current time
		double result = (end - start) / 1000; // gives the result of elapsed time
		System.out.println(result + " seconds");
	}

//<=================================Days of week==========================================>

	public static int dayOfWeek(int d, int m, int y) {
		int day, month, year;
		year = y - (14 - m) / 12;
		int x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;
		return day;

	}

//<=================================Temperature conversion==========================================>

	public static void temperatureConversion(double temp, int choice) {
		switch (choice) {
		case 1:
			double ctf = (temp * 9 / 5) + 32; // celcius to fahrenheit conversion
			System.out.println(temp + " Celcius is " + ctf + " Fahrenheit.");
			break;
		case 2:
			double ftc = (temp - 32) * 5 / 9; // fahrenheit to celcius conversion
			System.out.println(temp + " Fahrenheit is " + ftc + " Celcius.");
			break;
		default:
			System.out.println("Enter valid input!!");
		}
	}

//<=================================Monthly Payment==========================================>

	public static void monthlyPayment(double principal, double year, double interest) {
		double n = 12 * year;
		double r = interest / (12 * 100);
		double payment = (principal * r) * (1 - (Math.pow(1 + r, -n)));
		double total = principal / (year * 12);
		double result = total + payment;
		System.out.println(result);
	}

//<=================================Newtons square root==========================================>

	public static void sqrt(double num, double epsilon) {
		double t = num;
		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		System.out.println(t);
	}

//<=================================Decimal to Binary==========================================>

	/**
	 * purpose: to convert a number in to binary
	 * 
	 * @param num
	 */
	public static void toBinary(int num) {
		int arr[] = new int[8];
		int i = 0;
		while (num > 0) {
			arr[i] = num % 2; // storing 1 and 0 in array
			num = num / 2;
			i++;
		}
		System.out.print("The binary is: ");
		for (int j = i; j >= 0; j--) { // reversing the array to print the correct binary output
			System.out.print(arr[j]);
		}
		System.out.println();
	}

	public static void swapNibble(int num) {
		int newNum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4); // using 0F to & whose value is 0000 1111 to preserve
																// right side
		System.out.println("New no is: " + newNum); // bits and left shifting them by 4
		toBinary(newNum); // using F0 to & whose value is 1111 0000 to preserve left side
		boolean status = false; // bits and right shifting them by 4
		for (int i = 0; i < 8; i++) { // performing 'or' operation on both to merge the bits
			if (newNum == Math.pow(2, i)) {
				status = true;
			}
		}
		if (status) {
			System.out.println("The no is power of 2.");
		} else
			System.out.println("The no is not power of 2.");
	}

//<=================================String Permutation==========================================>

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

//<=================================String Binary Search==========================================>

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

//<=================================Binary Search Generics==========================================>

	public static <T extends Comparable<T>> int binarySearchGeneric(T arr[], int low, int high, T key) {
		// using generics for binary search
		if (high >= low) {
			int mid = low + (high - low) / 2; // finding mid
			if (arr[mid].compareTo(key) == 0)
				return mid;
			if (arr[mid].compareTo(key) > 0)
				return binarySearchGeneric(arr, low, mid - 1, key);
			if (arr[mid].compareTo(key) < 0)
				return binarySearchGeneric(arr, mid + 1, high, key);

		}
		return -1;

	}

//<=================================Integer Binary Search==========================================>

	public static int binarySearchInt(int arr[], int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2; // finding mid
			System.out.println(arr[mid] + " is the number :");
			System.out.println("if greater press t else f"); // asking user for correct answer
			String key = stringInput();
			if (key.equals("y"))
				return mid;
			else if (key.equals("t"))
				return binarySearchInt(arr, mid + 1, high); // recursively calling binarySearchInt method
			else if (key.equals("f"))
				return binarySearchInt(arr, low, mid - 1);
			else
				return binarySearchInt(arr, low, high);
		}
		return -1;
	}

//<=================================Sorting==========================================>

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

	public static int[] bubbleSort(int arr[]) {
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
		return arr;
	}

//<=================================Sorting LinkedList==========================================>

	public static void orderedLinkedList(LinkedList<Integer> ll) {
		int temp = 0;

		for (int i = 0; i < ll.size(); i++) {
			for (int j = i + 1; j < ll.size(); j++) {
				int a = ll.get(i);
				int b = ll.get(j);
				temp = a;
				a = b;
				b = temp;
			}
		}
	}

//<=================================Bubble Sort Generics==========================================>

	public static <T extends Comparable<T>> T[] bubbleSortGeneric(T[] arr) {
		T temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) >= 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		return arr;
	}

	public static int removeDuplicatesFromArray(int arr[], int length) {
		if (length == 0 || length == 1) {
			return length;
		}
		int temp[] = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];

		}
		temp[j++] = arr[length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

//<=================================Anagram==========================================>

	/**
	 * purpose: to check the two strings are anagram or not
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray(); // converting string to char array
		char[] ch2 = str2.toCharArray();
		boolean status = false;
		if (ch1.length != ch2.length) {
			status = false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) // checking value of every index of both arrays
					status = true;
				else
					status = false;
			}
		}
		if (status)
			return true;
		else
			return false;
	}

//<=================================Prime No Range==========================================>

	/**
	 * purpose: to print the prime numbers in given range
	 * 
	 * @param n: given range
	 * @return : list of prime numbers
	 */
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
				al.add(i); // it will store all prime no is list al
		}
		return al; // it will return prime no list to main method
	}

//<=================================Prime Anagram==========================================>

	public static int[] primeAnagram(ArrayList<Integer> al) {
		int k = 0;
		int arr[] = new int[170];
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (anagram(al.get(i), al.get(j)) == true) // it will check anagram function
				{

					arr[k] = al.get(i); // stores first anagram number in array
					k++; // increments index of array
					arr[k] = al.get(j); // stores second anagram number in array
					k++; // increments index of array
				}

			}
		}
		return arr; // returns array of prime anagrams
	}

//<=================================Prime Palindrome==========================================>

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
		return arr; // returning array of palindrome numbers
	}

//<=================================String file reader==========================================>

	public static LinkedList<String> readFile(String path) throws IOException {
		LinkedList<String> ll = new LinkedList<String>();
		File file = new File(path);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String strwords[] = in.readLine().split(" "); // storing file data in array
		for (int i = 0; i < strwords.length; i++) {
			ll.add(strwords[i]); // adding array to ArrayList
		}
		in.close();
		return ll; // returning list
	}

//<=================================Integer file reader==========================================>

	public static LinkedList<Integer> readFileInt(String path) throws IOException {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int num = 0;
		try {
			File file = new File(path);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String strwords[] = in.readLine().split(" "); // storing file data in array
			for (int i = 0; i < strwords.length; i++) {
				num = Integer.parseInt(strwords[i]);
				ll.add(num); // adding array to ArrayList
			}
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return ll;
	}

//<=================================LinkedList==========================================>

	static Node head;

	public static class Node {

		int data1; // for integer data
		String data; // for string data
		char data2;
		public Node next;

		public Node prev;

		public Node(int d) {
			this.data1 = d;
			this.next = null;
			this.prev = null;
		}

		Node(String d) {
			data = d;
			next = null;
		}

		Node(char d) {
			data2 = d;
			next = null;
		}
	};

	public static void insertLinkedList(String data) {
		System.out.println(data);
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			while (n.next != null) {

				n = n.next; // traversing linkedlist while n.next is not null
			}
			n.next = newNode; // when null found, inserting new node of String
		}
	}

	public static void insertLinkedListInt(int data) {
		System.out.println(data);
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			while (n.next != null) {

				n = n.next; // traversing linkedlist while n.next is not null
			}
			n.next = newNode; // when null found, inserting new node of int
		}
	}

	public static void deleteByKey(String key) throws FileNotFoundException {
		Node currentNode = head;
		int temp = 0;
		while (currentNode.next != null) {
			if ((currentNode.next.data).equals(key)) { // checking the user input with currentNode data
				currentNode.next = currentNode.next.next; // if equals then inserting data of next node into current
															// node
				temp++; // counting temp

			} else
				currentNode = currentNode.next; // traversing linkedlist
		}
		if (temp == 0) { // if temp is 0 means the user input not found
			System.out.println("not found. Adding word to link list....");
			insertLinkedList(key);
		} else {
			System.out.println("found and deleted");
		}
		printLinkedList();
	}
	

	public static void printLinkedList() throws FileNotFoundException { // linkedlist to print string
		Node currentNode = head;
		PrintWriter pw = new PrintWriter(new File("/home/admin1/Documents/file.txt")); // giving file location to store
																						// the data
		while (currentNode.next != null) {
			System.out.print(currentNode.data + "-->"); // printing every data data
			pw.print(currentNode.data); // writing existing data in external file
			pw.print(" ");
			currentNode = currentNode.next;
		}
		pw.print(currentNode.data); // writing added data or removing removed data
		pw.flush();
		System.out.println(currentNode.data); // displaying data
	}

	public static void printIntegerLinkedList(int arr[]) throws FileNotFoundException { // linkedlist to print int data
		Node currentNode = head;
		PrintWriter pw = new PrintWriter(new File("/home/admin1/Documents/output.txt")); // file to store output
		while (currentNode != null) {
			String s = Integer.toString(currentNode.data1);
			System.out.print(s + "-->");
			pw.print(s);
			pw.print("->");
			currentNode = currentNode.next;
		}
		pw.flush();

	}

	public static void writeFile(String list1) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("/home/admin1/Documents/output.txt"));
		pw.print(list1);
		pw.print(" ");
		pw.flush();

	}

	public static int[] linkedListToArrayConversion(LinkedList<Integer> ll) {
		int n = ll.size();
		int[] arr = new int[n];
		int a = 0;
		for (int i = 0; i < ll.size(); i++) {
			arr[i] = ll.get(a);
			a++;
		}
		return arr;
	}

	public static LinkedList<Integer> arrayToLinkedListConversion(int[] arr) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			ll.add(arr[i]);
		}
		return ll;
	}

//<=================================Balanced Parentheses==========================================>

	/**
	 * purpose: to check the balancing of parameters
	 * 
	 * @param exp : array of parentheses
	 * @return : true or false
	 */
	public static boolean isBalanced(char exp[]) {
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '{' || exp[i] == '[' || exp[i] == '(')
				StackUsingLinkedListUtility.push(exp[i]); // if found any opening brace then it will be pushed in stack
			if (exp[i] == '}' || exp[i] == ']' || exp[i] == ')') {
				if (StackUsingLinkedListUtility.isEmpty()) // checking for empty stack
					return false;
				else if (!isMatching(StackUsingLinkedListUtility.pop(), exp[i])) // if not empty checking if parentheses
																					// are balanced or not
					return false; // by passing two parameters
			}
		}

		if (StackUsingLinkedListUtility.isEmpty())
			return true;
		else
			return false;
	}

	public static boolean isMatching(char c1, char c2) { // checking for match
		if (c1 == '(' && c2 == ')')
			return true;
		if (c1 == '{' && c2 == '}')
			return true;
		if (c1 == '[' && c2 == ']')
			return true;
		else
			return false;
	}

//<=================================Binary search tree==========================================>

	/**
	 * @param node
	 * @param key  : the number to be found
	 * @return
	 */
	public static boolean exist(Node node, int key) {
		if (node == null) {
			return false;
		}
		if (node.data1 == key) {
			return true;
		}

		boolean result1 = exist(node.prev, key);
		if (result1)
			return true;
		boolean result2 = exist(node.next, key);
		return result2;
	}
//<=================================Calendar==========================================>

	/**
	 * purpose: to create a calendar of any month of any year
	 * 
	 * @param month
	 * @param year
	 * @return array of calendar
	 */
	public static String[][] createCalendar(int month, int year) {
		String calendar[][] = new String[7][7];
		int day = Utility.dayOfWeek(1, month, year);
		String dayOfWeek[] = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		int daysOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = daysOfMonth[month - 1];
		int k = 1, flag = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (k <= days) {
					if (i == 0) {
						calendar[i][j] = dayOfWeek[j];
					} else if (day == j) {
						calendar[i][j] = String.valueOf(k);
						day++;
						k++;
						flag = 1;
					} else {
						calendar[i][j] = "";
					}
				} else {
					calendar[i][j] = "";
				}
			}
			if (flag == 1) {
				day = 0;
			}
		}
		return calendar;
	}

//<=================================Bank Operations==========================================>

	/**
	 * purpose: to perform the banking operations like withdraw and deposit money
	 * 
	 * @param bankBalance : bank balance before transaction
	 * @return bankBalance : updated bank balance after transaction
	 */
	public static int transactions(int bankBalance) {
		System.out.println("++++++++++Welcome to Bank++++++++++");
		System.out.println("1.Withdraw Money");
		System.out.println("2.Deposit Money");
		System.out.print("Enter your choice: ");
		int choice = Utility.IntegerInput();
		bankBalance = yourChoice(choice, bankBalance); // performing users choice operation
		return bankBalance;
	}

	public static int yourChoice(int choice, int bankBalance) {
		switch (choice) {
		case 1:
			System.out.print("Enter money to withdraw: ");
			int withdraw = Utility.IntegerInput();
			bankBalance = calculations(withdraw, choice, bankBalance);
			QueueUtility.dequeue();// dequeuing user after transaction
			System.out.println("bank balance: " + bankBalance);
			System.out.println();
			System.out.println("Transaction completed. User Dequeued!\n");
			break;
		case 2:
			System.out.print("Enter money to deposite:");
			int deposite = Utility.IntegerInput();
			bankBalance = calculations(deposite, choice, bankBalance);
			QueueUtility.dequeue();// dequeuing user after transaction
			System.out.println("bank balance: " + bankBalance);
			System.out.println("Transaction completed. User Dequeued!\n");

			break;
		}
		return bankBalance;
	}

	public static int calculations(int money, int choice, int bankBalance) { // calculation of money by users input
																				// choice
		if (choice == 1) {
			bankBalance = bankBalance - money;
			return bankBalance;
		} else {
			bankBalance = bankBalance + money;
			return bankBalance;
		}
	}

}
