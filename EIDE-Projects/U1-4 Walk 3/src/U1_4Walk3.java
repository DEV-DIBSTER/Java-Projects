import java.util.Scanner;

public class U1_4Walk3 {
	/*
	 * U1-4Walk3
	 * Purpose: Understanding and using proper if and else statements.
	 * @author: salam.1
	 * Test cases:
	 * 
	 * I first tested Leonardo, and all my test cases did work as expected with all saying blue mask.
	 * I tested Raphaell which will result in red masks, which turned out true for all.
	 * I tested Donatello which will result in purple masks, which turned out true for all.
	 * I tested Michelangelo which will result in orange masks, which turned out true for all.
	 * I tested Adib as my error case, which the first resulted in non existent character, and the rest didn't output anything.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.println("=============================");
		System.out.print("Please type the character: ");
		
		String inputChar = scanner.nextLine(); //The input user character.
		
		
		if(inputChar.equals("Leonardo")) {
			System.out.println("You wear a blue mask.");
		} else if (inputChar.equals("Raphaell")) {
			System.out.println("You wear a red mask.");
		} else if (inputChar.equals("Donatello")) {	
			System.out.println("You wear a purple mask.");
		} else if (inputChar.equals("Michelangelo")) {	
			System.out.println("You wear a orange mask.");
		} else {
			System.out.println("Non-existent character.");
		}
		
		System.out.println("\nDone with substack 1.\n=============================\n");
		
		if(inputChar.equals("Leonardo")) {
			System.out.println("You wear a blue mask.");
		} else if (inputChar.equals("Raphaell")) {
			System.out.println("You wear a red mask.");
		} else if (inputChar.equals("Donatello")) {	
			System.out.println("You wear a purple mask.");
		} else {
			System.out.println("You wear a orange mask.");
		}
		
		System.out.println("\nDone with substack 2.\n=============================\n");
		
		if(inputChar.equals("Leonardo")) {
			System.out.println("You wear a blue mask.");
		} else if (inputChar.equals("Raphaell")) {
			System.out.println("You wear a red mask.");
		} else if (inputChar.equals("Donatello")) {	
			System.out.println("You wear a purple mask.");
		} else if (inputChar.equals("Michelangelo")) {	
			System.out.println("You wear a orange mask.");
		} else {
			//Do nothing.
			//Nothing to be printed and the user inputted the wrong value.
		}
		
		System.out.println("\nDone with substack 3.\n=============================\n");
	}

}
