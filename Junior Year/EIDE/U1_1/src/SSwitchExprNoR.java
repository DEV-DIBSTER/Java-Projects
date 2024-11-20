import java.util.Scanner;

/**
 * @author salam.1
 * Class: SSwitchExprNoR
 * Assignment: U1-1 Part 4
 * Purpose: Ask the user for two numbers separated by space where one is month and one is day and determines which season it is.
 * Test Cases:
 * 
 * 1 10
 * winter
 * 
 * 1 21
 * winter
 * 
 * 3 10
 * winter
 * 
 * 3 21
 * spring
 * 
 * 5 10
 * spring
 * 
 * 13 1
 * Invalid month specified.
 */
public class SSwitchExprNoR {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); //Declares the scan scan object.
		
		System.out.print("Enter a month number (1-12) followed by a day of the month, separated by spaces: "); 
		
		int month = scan.nextInt(); //Stores the month as a int from user input.
		int day = scan.nextInt();   //Stores the day as a int from user input.
		
		scan.nextLine(); // consume newline character
		
		scan.close(); //Close the scanner.
		
		String season = "The current season is: "; // resulting season
		
		switch (month) {
		
			case 1, 2 -> season += "winter";
				
			case 3 -> {
				
				if (day < 21){
					
					season += "winter";
					
				} else {
					
					season += "spring";
					
				}
			}
			
			case 4, 5 -> season += "spring";
				
			case 6 -> {
				
				if (day < 21){
					
					season += "spring";
					
				} else {
					
					season += "summer";
					
				}
			}
							
			case 7, 8 -> season += "summer";
				
			case 9 -> {
				
				if (day < 21){
					
					season += "summer";
					
				} else {
					
					season += "fall";
					
				}
			}
								
			case 10, 11 -> season += "fall";
								
			case 12 -> {
				
				if (day < 21){
					
					season += "fall";
					
				} else {
					
					season += "winter";
					
				}
			}
				
			default -> season = "Invalid month specified.";
		}
		
		
		
		System.out.println(season); 

	}

}