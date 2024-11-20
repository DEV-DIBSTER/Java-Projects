import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author salam.1
 * Class: UserAverage
 * Assignment: U1-2 Part 1
 * Purpose: The objective of this assignment is primarily to get familiar with using loops in Java, as well as to get
 * familiar with using the increment operator, the compound assignment operator, and a bit of number formatting.
 * 
 * Test Cases:
 * 
 * 5 8 13 -1
 * 
 * You entered 3.0 values.
 * Your raw number is: 8.666666666666666
 * The average of your numbers (using DecimalFormat) is 8.67
 * The average of your numbers (using format/printf) is 8.67
 * 
 * 15 -3 4 2 -1
 * 
 * You entered 4 values.
 * Your raw number is: 4.5
 * The average of your numbers (using DecimalFormat) is 4.50
 * The average of your numbers (using format/printf) is 4.50
 * 
 * 5 25 15
 * 
 * You entered 3 values.
 * Your raw number is: 15.0
 * The average of your numbers (using DecimalFormat) is 15.00
 * The average of your numbers (using format/printf) is 15.00
 * 
 * -1
 * 
 * You entered 0 values.
 * As no numbers have been entered, no average is calculated.
 */
public class UserAverage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //Declares the scanner object.
		
		boolean isDone = false; //The condition for the loop.
		
		double total = 0; //Total amount from numbers.
		int count = 0; //Counter of numbers as int.
		
		while (isDone == false){
					
			System.out.print("Enter an integer (-1 to quit): ");			
			
			int input = scan.nextInt(); //Stores user input as variable to be used.
			
			if(input == -1){
				isDone = true;
			} else {	
				total = total + input;
				
				count++;
				
				scan.nextLine();
			}
		}		
		
		System.out.println("\n\nYou entered " + count + " values.");
		
		if (count != 0){
			double raw = (total / count); //Store raw number as double.
			
			String pattern = "0.00"; //Stores pattern as string.
			DecimalFormat dfmt = new DecimalFormat(pattern); //Creates the decimal format object to be used.
			
			System.out.println("Your raw number is: " + raw);
			System.out.println("The average of your numbers (using DecimalFormat) is " + dfmt.format(total / count));
			System.out.format("The average of your numbers (using format/printf) is %4.2f", raw);
		} else {
			System.out.println("As no numbers have been entered, no average is calculated.");
		}
		
		scan.close(); //Close scanner object.
	}

}