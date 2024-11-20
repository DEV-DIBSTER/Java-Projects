import java.util.Scanner;

public class DOW {
	/**
	 * Assignment: U1-4 Part 2
	 * Class: DOW
	 * Purpose: To practice basic conditional use.
	 * @Author: salam.1
	 * Testcases:
	 * 
	 * 1 to test the weekend. It worked as expected.
	 * 2 to test just another weekday, it worked as expected.
	 * 4 to test the first statement. Works as expected.
	 * 6 to test the Friday statement. Works as expected.
	 * 160 to test the unknown day. Else statement worked as expected.
	 * 
	 */
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.
		
		System.out.print("Please type in a day of the week (1 - 7): ");
		
		int day = scanner.nextInt(); //Looks for input day integer.
		String output; //Stores the output string.
		
		if (day == 3) {
			output = "Way to go Wednesday!";
		} else if (day == 5) {
			output = "Fabulous Friday!";
		} else if (day < 5) {
			output = "Just another weekday.";
		} else {
			output = "Weekend relaxation!";
		};
		
		System.out.println(output);
	}
}
