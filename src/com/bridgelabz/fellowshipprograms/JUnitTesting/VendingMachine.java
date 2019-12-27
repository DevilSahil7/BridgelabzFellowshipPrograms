package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * purpose: fewest notes to be returned by vending machine
 * 
 * @author sahil
 *
 */
public class VendingMachine {

	public static void yourChoice(int choice, int quantity) {
		int amount = 0, cash = 0;
		int cocaCola = 25, sprite = 23, thumbsUp = 27, pepsi = 22, mirinda = 24;
		switch (choice) {
		case 1:
			amount = cocaCola * quantity;
			System.out.println("Your total: " + amount);
			System.out.print("Enter cash: ");
			cash = Utility.IntegerInput();
			if (cash < amount)
				System.out.println("Enter enough cash!!");
			else
				amount = cash - amount;
			noteCalc(amount);
			break;
		case 2:
			amount = sprite * quantity;			
			System.out.println("Your total: " + amount);
			System.out.print("Enter cash: ");
			cash = Utility.IntegerInput();
			if (cash < amount)
				System.out.println("Enter enough cash!!");
			else
				amount = cash - amount;
			noteCalc(amount);
			break;
		case 3:
			amount = thumbsUp * quantity;
			System.out.println("Your total: " + amount);
			System.out.print("Enter cash: ");
			cash = Utility.IntegerInput();
			if (cash < amount)
				System.out.println("Enter enough cash!!");
			else
				amount = cash - amount;
			noteCalc(amount);
			break;
		case 4:
			amount = pepsi * quantity;
			System.out.println("Your total: " + amount);
			System.out.print("Enter cash: ");
			cash = Utility.IntegerInput();
			if (cash < amount)
				System.out.println("Enter enough cash!!");
			else
				amount = cash - amount;
			noteCalc(amount);
			break;
		case 5:
			amount = mirinda * quantity;
			System.out.println("Your total: " + amount);
			System.out.print("Enter cash: ");
			cash = Utility.IntegerInput();
			if (cash < amount) {
				System.out.println("Enter enough cash!!");
				cash = Utility.IntegerInput();
			} else
				amount = cash - amount;
			noteCalc(amount);
			break;
		default:
			System.out.println("Enter valid input!!!");
		}
	}

	public static void noteCalc(int amount) {
		int arr[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			int note = amount / arr[i];
			if (note != 0) {
				System.out.println("Collect your " + note + " notes of Rs." + arr[i]);
			}
			amount = amount % arr[i];
		}
	}

	public static void main(String[] args) {
		System.out.println("1.Coka Cola - Rs.25");
		System.out.println("2.Sprite    - Rs.23");
		System.out.println("3.Thumbs up - Rs.27");
		System.out.println("4.Pepsi     - Rs.22");
		System.out.println("5.Mirinda   - Rs.24");
		System.out.print("Enter your choice: ");
		int choice = Utility.IntegerInput();
		System.out.print("Enter quantity: ");
		int quantity = Utility.IntegerInput();
		yourChoice(choice, quantity);

	}

}
