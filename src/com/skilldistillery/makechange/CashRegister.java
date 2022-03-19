package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the price of the item?");

		double price = sc.nextDouble();
		System.out.println("Price: $" + price);

		System.out.println("How much money was tendered by the customer?");
		double amtTendered = sc.nextDouble();

		System.out.println("Amount tendered: $" + amtTendered);

		double changeTot = amtTendered - price;

		if (amtTendered < price) {
			System.out.println("Customer provided too little.");
		}

		if (amtTendered == price) {
			System.out.println("Customer provided exact amount.");
		}

		// make change
		if (amtTendered > price) {
			System.out.println("Total change due: $" + changeTot);
			System.out.println();
			System.out.println("Give the customer the following change: ");
			System.out.println();

			// twenties
			double twenties = changeTot / 20;
			twenties = (int) twenties;

			System.out.println("Twenty-dollar bill(s): " + twenties);

			double newChangeAfterTwenties = changeTot - (twenties * 20);
			System.out.println();

			// tens
			double tens = newChangeAfterTwenties / 10;
			tens = (int) tens;

			System.out.println("Ten-dollar bill(s): " + tens);

			double newChangeAfterTens = newChangeAfterTwenties - (tens * 10);
			System.out.println();

			// fives
			double fives = newChangeAfterTens / 5;
			fives = (int) fives;

			System.out.println("Five-dollar bill(s): " + fives);

			double newChangeAfterFives = newChangeAfterTens - (fives * 5);
			System.out.println();

			// ones
			double ones = newChangeAfterFives;
			ones = (int) ones;

			System.out.println("One-dollar bill(s): " + ones);

			double newChangeAfterOnes = newChangeAfterFives - ones;
			System.out.println();

			// quarters
			double quarters = newChangeAfterOnes / .25;
			quarters = (int) quarters;

			System.out.println("Quarters: " + quarters);

			double newChangeAfterQuarters = newChangeAfterOnes - (quarters * .25);
			System.out.println();

			// dimes
			double dimes = newChangeAfterQuarters / .10;
			dimes = (int) dimes;

			System.out.println("Dimes: " + dimes);

			double newChangeAfterDimes = newChangeAfterQuarters - (dimes * .1);
			System.out.println();

			// nickels
			double nickels = newChangeAfterDimes / .05;
			nickels = (int) nickels;

			System.out.println("Nickels: " + nickels);

			double newChangeAfterNickels = newChangeAfterDimes - (nickels * .05);
			System.out.println();

			// pennies
			double pennies = newChangeAfterNickels / .01;
			pennies = (int) pennies;

			System.out.println("Pennies: " + pennies);

		}

		sc.close();
	}
}
