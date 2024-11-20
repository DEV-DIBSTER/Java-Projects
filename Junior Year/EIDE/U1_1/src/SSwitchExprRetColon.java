import java.util.Scanner;

/**
 * @author salam.1
 * Class: SSwitchExprRetColon
 * Assignment: U1-1 Part 6
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
public class SSwitchExprRetColon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); //Declares the scan scan object.
		
		System.out.print("Enter a month number (1-12) followed by a day of the month, separated by spaces: "); 
		
		int month = scan.nextInt(); //Stores the month as a int from user input.
		int day = scan.nextInt();   //Stores the day as a int from user input.
		
		scan.nextLine(); // consume newline character
		
		scan.close(); //Close the scanner.
				
		String season = switch (month) { //Declares the season variable as string.
		
			case 1, 2 : yield ("winter");
				
			case 3 : {
				
				if (day < 21){
					
					yield("winter");
					
				} else {
					
					yield("spring");
					
				}
			}
			
			case 4, 5 : yield ("spring");
				
			case 6 : {
				
				if (day < 21){
					
					yield("spring");
					
				} else {
					
					yield("summer");
					
				}
			}
							
			case 7, 8 : yield ("summer");
				
			case 9 : {
				
				if (day < 21){
					
					yield("summer");
					
				} else {
					
					yield("fall");
					
				}
			}
								
			case 10, 11 : yield ("fall");
								
			case 12 : {
				
				if (day < 21){
					
					yield("fall");
					
				} else {
					
					yield("winter");
					
				}
			}
				
			default : yield ("Invalid month specified.");
		};
		
		
		if(season.equals("Invalid month specified.")){
			System.out.println(season);
		} else {
			System.out.println("The current season is: " + season);
		}

	}

}