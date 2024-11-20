import java.util.Scanner;

/**
 * @author salam.1
 * Class: Sort4Strings
 * Assignment: U1-1 Part 3
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
public class SSwitchClassic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); //Declares the scan scan object.
		
		System.out.print("Enter a month number (1-12) followed by a day of the month, separated by spaces: "); 
		
		int month = scan.nextInt(); //Stores the month as a int from user input.
		int day = scan.nextInt();   //Stores the day as a int from user input.
		
		scan.nextLine(); // consume newline character
		
		scan.close(); //Close the scanner.
		
		String season = "The current season is: "; // resulting season
		
		switch (month) {
		
			case 1: case 2:
				
				season += "winter";
				
				break;
				
			case 3:
				
				if (day < 21){
					
					season += "winter";
					
				} else {
					
					season += "spring";
					
				}
				
				break;
			
			case 4: case 5:
				
				season += "spring";
				
				break;
				
			case 6:
				
				if (day < 21){
					
					season += "spring";
					
				} else {
					
					season += "summer";
					
				}
				
				break;
				
			case 7: case 8:
				
				season += "summer";
				
				break;
				
			case 9: 
				
				if (day < 21){
					
					season += "summer";
					
				} else {
					
					season += "fall";
					
				}
				
				break;
				
			case 10: case 11:
				
				season += "fall";
				
				break;
				
			case 12:
				
				if (day < 21){
					
					season += "fall";
					
				} else {
					
					season += "winter";
					
				}
				
				break;
				
			default:
				
				season = "Invalid month specified.";
				
				break;
		}
		
		
		
		System.out.println(season); 

	}

}