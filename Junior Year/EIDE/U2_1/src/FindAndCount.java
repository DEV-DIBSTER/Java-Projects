import java.util.Scanner;

/**
 * Assignment: U2-1 Part 2
 * Class: FindAndCount
 * @author salam.1
 * Purpose: The purpose of Part 2 is to count the number of occurrences of the user-supplied character in a user-supplied phrase.
 * 
 * Test Cases:
 * 
 * testing
 * t - 2
 * e - 1
 * z - 0
 * 
 * teapot
 * t - 2
 * x - 0
 * e - 1
 * 
 * i love cars
 * r - 1
 * a - 1
 * z - 0
 */
public class FindAndCount {
	
	/**
	 * Find the number of time a letter was found within the string.
	 * 
	 * @param inputString - The input string you want to search through.
	 * @param inputChar - The input char you are comparing it with.
	 * @return int - The number of time the input char is found in the input string.
	 */
	public static int countChars(String inputString, String inputChar){
		
		int returnVal = 0; //The return value for string.
		
		for (int i = 0; i < inputString.length(); i++){
			if (inputString.substring(i, i + 1).equals(inputChar)){
				returnVal++;
			}
		}
		
		return returnVal;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Declare scanner object.
		
		System.out.print("Type a string: ");
		
		String inputString = scan.nextLine(); //Stores the string value from the user input.
		
		System.out.print("Type a character to find in your phrase: ");
		
		String inputChar = scan.nextLine(); //Stores the character value from the user input.
		
		scan.close();
		
		System.out.println("Your character, " + inputChar + " appeared " + countChars(inputString, inputChar) + " time(s).");
	}

}
