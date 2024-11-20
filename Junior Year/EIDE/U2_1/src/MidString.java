import java.util.Scanner;

/**
 * Assignment: U2-1 Part 1
 * Class: MidString
 * @author salam.1
 * Purpose: The purpose of Part 1 is to find the middle character(s) of an inputted string.
 * 
 * Test Cases:
 * 
 * test
 * es
 * 
 * testing
 * t
 * 
 * apples
 * pl
 * 
 * adib
 * di
 * 
 * a
 * a
 * 
 * bb
 * bb
 */
public class MidString {

	/**
	 * Purpose: Find the middle character(s) from the string.
	 * @param origString - The original string you want to find the values for.
	 * @return String - The two or the one remaining values.
	 */
	public static String findMid(String origString) {
		
		String returnVal; //The return value for this method.
		
		if (origString.length() % 2 == 0){
			int startNum = (origString.length() / 2) - 1; //The starting number for substring.
			int stopNum = (origString.length() / 2) + 1; //The ending number for substring.
			
			returnVal = origString.substring(startNum, stopNum);
			
		} 
		else {
			int startNum = (origString.length() / 2); //The starting number for substring.
			int stopNum = (origString.length() / 2) + 1; //The ending number for substring.
			
			returnVal =  origString.substring(startNum, stopNum);
		}
		
		return returnVal;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Declare scanner object.
		
		System.out.print("Type a string: ");
		
		String returnVal = findMid(scan.nextLine()); //Stores the value from the method.
		
		scan.close();
		
		System.out.println("The middle character(s) are: " + returnVal);
	}

}
