import java.util.Scanner;

/**
 * @author salam.1
 * Class: Season
 * Assignment: U1-1 Part 2
 * Purpose: Takes two integer inputs, and determine the season based on the month and day provided.
 * Test Cases:
 * 
 * Checking a day after the change to winter. Non Change Month + Non Change Day.
 * 1 10
 * Winter
 * 
 * <============= I THINK I WAS MISSING THIS ONE HERE ============>
 * Checking a day after the change to winter. Non Change Month + Change Day.
 * 1 21
 * Winter
 * 
 * Checking a day after the change to winter. Change Month + Non Change Day.
 * 3 5
 * Winter
 * 
 * Checking the day of the spring change. Change Month + Change Day.
 * 3 21
 * Spring
 * 
 * Checking a day after spring change. Change Month + Non Change Day.
 * 3 30
 * Spring
 * 
 * Checking a day before summer change. Change Month + Non Change Day.
 * 6 12
 * Spring
 * 
 * Checking day of summer change. Change Month + Change Day.
 * 6 21
 * Summer
 * 
 * Checking on a day after the summer change. Change Month + Non Change Day.
 * 6 30
 * Summer
 * 
 * Checking on a day after the summer change. Non Change Month + Non Change Day.
 * 7 11
 * Summer
 * 
 * Checking on a day before fall change. Change Month + Non Change Day.
 * 9 11
 * Summer
 * 
 * Checking day of fall change. Change Month + Change Day.
 * 9 21
 * Fall
 * 
 * Checking a day after fall change. Change Month + Non Change Day.
 * 9 30
 * Fall
 * 
 * Checking a day after fall change. Non Change Month + Non Change Day.
 * 11 11
 * Fall
 * 
 * Checking if it's before Winter change. Change Month + Non Change Day.
 * 12 1
 * Fall
 * 
 * Checking the day of change to winter. Change Month + Change Day.
 * 12 21
 * Winter
 * 
 * Checking after the change to winter. Change Month + Non Change Day.
 * 12 30
 * Winter
 */
public class Season {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //Initialize the scanner object.
		
		System.out.print("Enter a month number (1-12) followed by a day of the month, seperated by spaces: ");
		
		int month = scan.nextInt(); //Month input stored as int.
		int day = scan.nextInt();   //Day input stored as int.
		
		scan.close(); //Close the scanner.
		
		String output = ""; //Store output as string.
		
		if (month <= 3){
			
			if(day >= 21 && month == 3){
				
				output = "Spring";
				
			} else {
				
				output = "Winter";
				
			}
			
		} else if (month <= 6){
			
			if(day >= 21 && month == 6){
				
				output = "Summer";
				
			} else {
				
				output = "Spring";
				
			}
			
		} else if (month <= 9){
			
			if(day >= 21 && month == 9){
				
				output = "Fall";
				
			} else {
				
				output = "Summer";
				
			}
			
		} else {
			//Since all inputs valid, our month is going to fall in between 9 - 12.
			
			if(day >= 21 && month == 12){
				
				output = "Winter";
				
			} else {
				
				output = "Fall";
				
			}
		};
		
		System.out.println("The current season is: " + output);
	}
}
