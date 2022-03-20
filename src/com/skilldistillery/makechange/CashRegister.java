package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the price of the item?");

		double price = sc.nextDouble();

		System.out.println("$" + price);
		price = price * 100;
		int priceInt = (int) price;

		System.out.print("How much money was tendered by the customer?");
		double amtTendered = sc.nextDouble();

		System.out.println("$" + amtTendered);
		amtTendered = amtTendered * 100;
		int amtTenderedInt = (int) amtTendered;

		int changeTotInt = (amtTenderedInt - priceInt);
		double changeTot = (double) changeTotInt / 100;
		System.out.println("\n" + "Total change due: $" + changeTot);

		if (amtTendered < price) {
			System.out.println("Error: customer provided too little.");
		}

		if (amtTendered == price) {
			System.out.println("Customer provided exact amount.");
		}

		// make change
		if (amtTendered > price) {
			System.out.println("\n" + "Give the following change: ");

			// twenties
			int twenties = changeTotInt / 2000;

			System.out.print("Twenties: " + twenties);

			int newChangeAfterTwenties = changeTotInt - (twenties * 2000);

			// tens
			int tens = newChangeAfterTwenties / 1000;

			System.out.print("\t Tens: " + tens);

			int newChangeAfterTens = newChangeAfterTwenties - (tens * 1000);

			// fives
			int fives = newChangeAfterTens / 500;

			System.out.print("\t Fives: " + fives);

			int newChangeAfterFives = newChangeAfterTens - (fives * 500);

			// ones
			int ones = newChangeAfterFives / 100;

			System.out.println("\t Ones: " + ones + "\n");

			int newChangeAfterOnes = newChangeAfterFives - (ones * 100);

			// quarters
			int quarters = newChangeAfterOnes / 25;

			System.out.print("Quarters: " + quarters);

			int newChangeAfterQuarters = newChangeAfterOnes - (quarters * 25);

			// dimes
			int dimes = newChangeAfterQuarters / 10;

			System.out.print("\t Dimes: " + dimes);

			int newChangeAfterDimes = newChangeAfterQuarters - (dimes * 10);

			// nickels
			int nickels = newChangeAfterDimes / 5;

			System.out.print("\t Nickels: " + nickels);

			int newChangeAfterNickels = newChangeAfterDimes - (nickels * 5);

			// pennies
			int pennies = newChangeAfterNickels / 1;

			System.out.print("\t Pennies: " + pennies);

		}
		
		sc.close();
	}
}
