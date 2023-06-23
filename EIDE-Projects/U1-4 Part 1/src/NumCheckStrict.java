import java.util.Scanner;

public class NumCheckStrict {
	/**
	 * Assignment: U1-4 Part 1
	 * Class: NumCheckStrict
	 * Purpose: To practice basic conditional use.
	 * @Author: salam.1
	 * Testcases:
	 * 1 2 3 as this would result in increasing order.
	 * 3 2 1 was tested and resulted in decreasing order.
	 * 1 9 1 resulted in neither as it went up then down.
	 * 1 1 1 resulted in neither as it was the same number.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.print("Please type 3 integers seperated by spaces: ");
		
		int num1 = scanner.nextInt(); //Stores first int input.
		int num2 = scanner.nextInt(); //Stores second int input.
		int num3 = scanner.nextInt(); //Stores third int input.
		scanner.nextLine();			  //Consumes the new line character.
		
		String response; //The response statement that will be stored and printed out.
		
		if (num3 > num2 && num2 > num1) {
			response = "It is in increasing order.";
		} else if (num1 > num2 && num2 > num3) {
			response = "It is in decreasing order.";	
		} else {
			response = "Neither increasing nor decreasing.";
		}
		
		System.out.println(response); 
	}

}
