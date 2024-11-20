import java.util.Scanner;

/**
 * Assignment: U1-5 Part 5
 * Class: CalcPurchases
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 0.5 0
 * 0 0 0.5
 * To test the end value (0)
 * 0
 * 1 2 3 4 5 0
 * Output: 5 3.0 15
 * 
 * To test all the calculations
 * 
 * 1
 * 1 2 3 4 5 0
 * Output: 5 3.0 16
 * 
 * To test the tax value
 * 
 * 0
 * 1 3 4 0
 * Output: 3 2.66666 8.0
 * 
 * To test for no loss of data in the division step.
 * 
 * 
 * 0.7
 * 0
 * 
 * You didn't purchase anything!
 */

public class CalcPurchases {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter tax value: ");

		double tax = scan.nextDouble(); //tax value user inputs.

		boolean continueLoop = true; //This statement needs to be true in order for it to continue running.
		double total = 0; //holds the total cost of items.

		int amount = 0; //holds total amount of items.

		while (continueLoop) {

			System.out.print("Enter item price(0 to quit): ");

			double input = scan.nextDouble();
			
			if (input == 0) {
				continueLoop = false;
				scan.nextLine(); //consumes next line token.
			} else {
				total += input;
				amount++;
			}

		}
		
		scan.close();
		
		if (amount == 0) {
			System.out.println("You didn't purchase anything!");
		} else {
			System.out.println("You purchased " + amount + " items, and average cost of items: $" + total/amount + ", with the total price(plus tax): $" + (total + tax));
		}
	}
}