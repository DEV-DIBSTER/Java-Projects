import java.util.Scanner;

/**
 * Assignment: U1-5 Part 4
 * Class: FindFirstChar
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * adib
 * z
 * 
 * I was not able to find the string!
 * ----------------------------------
 * 
 * adib
 * i
 * 
 * I found it! It was located at index: 2
 * ----------------------------------
 * 
 * adib
 * a
 * 
 * I found it! It was located at index: 0
 */
public class FindFirstChar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //The new scanner.
		
		System.out.print("Please type a string: ");
		
		String input = scan.nextLine(); //Stores the input as string.
		
		System.out.print("Please type a character within the string: ");
		
		char inputChar = scan.nextLine().charAt(0); //Stores char as string then finds the specific char.
		
		boolean continueLoop = false; //Tell if the loop needs to be stopped.
		int indexSearched = 0; //Stores the index.
		
		while (continueLoop == false) {
			if ((input.charAt(indexSearched)) == inputChar){
				continueLoop = true;
				
				System.out.println("I found it! It was located at index: " + indexSearched);
			} else if (indexSearched == (input.length() - 1)){
				System.out.println("I was not able to find the string!");
				
				continueLoop = true; //Technically it wasn't found, but we need to stop the loop either way.
			}
			
			indexSearched++; //Increasing the index by one.
		}
	}
}
