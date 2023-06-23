import java.util.Scanner;

public class LeapYear {
	/**
	 * Assignment: U1-4 Part 4
	 * Class: ElevatorSim
	 * Purpose: To practice basic conditional use.
	 * @Author: salam.1
	 * Testcases:
	 * 
	 * 1969, which outputted is a leap year: false, as expected.
	 * 2000, which outputted is a leap year: true, as expected.
	 * 2004, which outputted is a leap year: true, as expected.
	 * 1900, which outputted is a leap year: false, as expected.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.print("Please type a year number: ");
		int year = scanner.nextInt(); //Stores year input as integer.
		scanner.nextLine(); //Consumes next line character.
		
		boolean isLeapYear; //Stores the condition if leap year.
		
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		
		System.out.println("Is year " + year + " a leap year? " + isLeapYear);
	}
}

