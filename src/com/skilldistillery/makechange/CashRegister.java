package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the price of the item?");

		double price = sc.nextDouble();
		System.out.println("Price: $" + price);
		/*
		 * User Story #1 The user is prompted asking for the price of the item.
		 */

		/*
		 * User Story #2 The user is then prompted asking how much money was tendered by
		 * the customer.
		 */
		System.out.println("How much money was tendered by the customer?");
		double amtTendered = sc.nextDouble();

		System.out.println("Amount tendered: $" + amtTendered);

		if (amtTendered < price) {
			System.out.println("Customer provided too little.");
		}

		if (amtTendered == price) {
			System.out.println("Customer provided exact amount.");
		}
		/*
		 * User Story #3 Display an appropriate message if the 
		 * customer provided too
		 * little money or the exact amount.
		 */
		if (amtTendered > price) {

			System.out.println("Give customer the following change: ");
			
			/* possibilities: 
			 1) does difference have a tens place?
			 * 	a) Y 
			 * 		i) how many 20s should I give?
			 * 		ii) how many 10s should I give?
			 * 		iii) move on
			 * 	b) N
			 2) does difference have a ones place?
			 	a) Y
			 		i) how many 5s should I give?
			 		ii) how many 1s should I give?
			 		iii) move one
			 	b) N
			 3) decimal portion... same as above on 
			 	opposite side of decimal... 
			 	multiple decimal portion by 100 and 
			 	ask similar questions...
			 	
			 	a) Y
			 		i) is it divisible by 25? quarters
			 		ii) is it divisible by 10? dimes
			 		iii) is it divisible by 5? 5 nickels fizzBuzz
			 		iv) otherwise pennies if digit in ones place
			 		
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 	b) N go to next question
			 * 2) doe
			 * 3) decimal % (1.0/25.00) == 0... give quarters... how many?
			 * 3) difference has a tenths place... dimes
			 */
		}
		
		
		 /* User Story #4 If the amount tendered is more 
		 * than the cost of the item,
		 * display the number of bills and coins that should 
		 * be given to the customer.
		 */
		
		sc.close();
	}

}
