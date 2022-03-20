package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the price of the item?");

		double price = sc.nextDouble();

		System.out.println("Price: $" + price);
		price = price * 100;
		int priceInt = (int) price;

		System.out.println("How much money was tendered by the customer?");
		double amtTendered = sc.nextDouble();

		System.out.println("Amount tendered: $" + amtTendered);
		amtTendered = amtTendered * 100;
		int amtTenderedInt = (int) amtTendered;

		int changeTotInt = (amtTenderedInt - priceInt);
		double changeTot = (double) changeTotInt / 100;
		System.out.println("Total change: $" + changeTot);

		if (amtTendered < price) {
			System.out.println("Customer provided too little.");
		}

		if (amtTendered == price) {
			System.out.println("Customer provided exact amount.");
		}

		// make change
		if (amtTendered > price) {
			System.out.println("Give the customer the following change: ");

			// twenties
			int twenties = changeTotInt / 2000;

			System.out.println("Twenty-dollar bill(s): " + twenties);

			int newChangeAfterTwenties = changeTotInt - (twenties * 2000);
			System.out.println("New change: " + newChangeAfterTwenties);

			// tens
			int tens = newChangeAfterTwenties / 1000;

			System.out.println("Ten-dollar bill(s): " + tens);

			int newChangeAfterTens = newChangeAfterTwenties - (tens * 1000);
			System.out.println("New change: " + newChangeAfterTens);

			// fives
			int fives = newChangeAfterTens / 500;

			System.out.println("Five-dollar bill(s): " + fives);

			int newChangeAfterFives = newChangeAfterTens - (fives * 500);
			System.out.println("New change: " + newChangeAfterFives);

			// ones
			int ones = newChangeAfterFives / 100;

			System.out.println("One-dollar bill(s): " + ones);

			int newChangeAfterOnes = newChangeAfterFives - (ones * 100);
			System.out.println("New change: " + newChangeAfterOnes);

			// quarters
			int quarters = newChangeAfterOnes / 25;

			System.out.println("Quarters: " + quarters);

			int newChangeAfterQuarters = newChangeAfterOnes - (quarters * 25);
			System.out.println("New change: " + newChangeAfterQuarters);

			// dimes
			int dimes = newChangeAfterQuarters / 10;

			System.out.println("Dimes: " + dimes);

			int newChangeAfterDimes = newChangeAfterQuarters - (dimes * 10);
			System.out.println("New change: " + newChangeAfterDimes);

			// nickels
			int nickels = newChangeAfterDimes / 5;

			System.out.println("Nickels: " + nickels);

			int newChangeAfterNickels = newChangeAfterDimes - (nickels * 5);
			System.out.println("New change: " + newChangeAfterNickels);

			// pennies
			int pennies = newChangeAfterNickels / 1;

			System.out.println("Pennies: " + pennies);

		}

		sc.close();
	}
}
