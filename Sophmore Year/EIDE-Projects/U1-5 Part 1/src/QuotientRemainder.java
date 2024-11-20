
import java.util.Scanner;

/**
 * Assignment: U1-5 Part 1
 * Class: QuotientRemainder
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * I used the test case 1 2 1 for the following:
 * 
 * For 1/1: Quotient: 1 Remainder: 0
 * For 2/1: Quotient: 2 Remainder: 0
 * 
 * I used the test case 1 10 2 for the following:
 * 
 * For 1/2: Quotient: 0 Remainder: 1
 * For 2/2: Quotient: 1 Remainder: 0
 * For 3/2: Quotient: 1 Remainder: 1
 * For 4/2: Quotient: 2 Remainder: 0
 * For 5/2: Quotient: 2 Remainder: 1
 * For 6/2: Quotient: 3 Remainder: 0
 * For 7/2: Quotient: 3 Remainder: 1
 * For 8/2: Quotient: 4 Remainder: 0
 * For 9/2: Quotient: 4 Remainder: 1
 * For 10/2: Quotient: 5 Remainder: 0
 */

public class QuotientRemainder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please type a low number: ");
		
		//Stores the low num and stores as int.
		int lowNumber = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Please type a high number: ");
		
		//Stores the high num and stores as int.
		int highNumber = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Indicate the divisor to use: ");
		
		//Stores the divisor as an int.
		int divisor = scan.nextInt();
		scan.nextLine();
		
		for (int i = lowNumber; i <= highNumber; i++){
			
			//The quotient and remainder stored as int.
			int quotient = i / divisor;
			int remainder = i % divisor;
			
			System.out.println("For " + i + "/" + divisor + ": Quotient: " + quotient + " Remainder: " + remainder);
		}
	}

}
