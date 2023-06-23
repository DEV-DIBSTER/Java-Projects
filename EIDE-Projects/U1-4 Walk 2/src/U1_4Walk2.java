import java.util.Scanner;

public class U1_4Walk2 {

	/**
	 * Assignment: U1-4 Walk 2
	 * Class: U1_4Walk2
	 * Purpose: To practice basic conditional use.
	 * Author: salam.1
	 * Testcases:
	 * 4
	 * 5
	 * 
	 * 5
	 * 4
	 * 
	 * It would be used to test if the if statements for the conditionals work for apple and oranges. Vice versa to test it as well.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.print("Please type the number of oranges: ");	
		
		int oranges = scanner.nextInt(); //Get the number of oranges from input line.
		
		System.out.print("Please type the number of apples: ");
		int apples = scanner.nextInt(); //Get the number of oranges from input line.
		
		if (oranges > apples) {
			System.out.println("It's a citrus day.");
		} else {
			System.out.println("Johnny Appleseed rules.");
		}
		
		System.out.print("Please enter a minute value: ");
		
		int minutes = scanner.nextInt(); // Stores the user input minutes as a integer.
		scanner.nextLine();
				
		if (minutes % 60 == 0) {
			System.out.println("New Hour!");
		} else {
			System.out.println("No new hour!");
		}
	}

}
