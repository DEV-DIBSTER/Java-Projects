import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author salam.1
 * Class: U1-3_Walk3
 * Assignment: U1-3 Walk3
 * Purpose: Searching is the process of looking for a particular item in a data structure.
 * Test Case:
 * 
 * ---------------------------
 * Find the value of the instance, normal test.
 * 
 * 5 7 6 2 3 1 0 0 4 3
 * 
 * Find: 7
 * Found 7 at index 1.
 * 
 * ---------------------------
 * Finds the **first** instance of a duplicate number.
 * 3 2 6 6 6 2 7 8 1 4
 * 
 * Find: 6
 * Found 6 at index 2.
 * ---------------------------
 * Find a value that doesn't exist!
 * 
 * 3 2 6 6 6 3 3 3 3 3
 * Find: 0
 * Unable to find your value.
 * 
 * ---------------------------
 * Find a value that exist's at the very last element.
 * 
 * 3 2 6 6 6 3 3 3 3 8
 * Find: 8
 * Found 8 at index 9.
 * ---------------------------
 * Find a value at the very first index of the array.
 * 
 * 1 2 3 4 5 6 7 8 9 1
 * Find: 1
 * Found 1 at index 0.
 * ---------------------------
 * Making sure 0 is a valid number you can find.
 * 
 * 0 2 3 4 5 6 7 8 9 1
 * Find: 0
 * Found 0 at index 0.
 * ---------------------------
 * What if there are more than 10 entries? It just won't take them all. Any values after the 9th index will not appear in the array.
 * 
 * 0 0 0 0 0 0 0 0 0 0 1
 * 
 * Find: 1
 * 
 * Unable to find your value.
 * --------------------------
 * What if there are less than 10 entries? The other values will be default to 0, but I don't want those values.
 * 
 * 1 2 3 4 5
 * 
 * Find: 0
 * Unable to find your value.
 * --------------------------
 * What if there are less than 10 entries? But I want to find a good value, without going through the default values?
 * 
 * 1 2 3 4 5
 * 
 * Find: 6
 * Unable to find 6.
 * --------------------------
 */
public class U13_Walk3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File ("input.txt"); //The file we are importing from.
		Scanner scan = new Scanner(inputFile); //Declares the file scanner.
		
		Scanner inputScan = new Scanner(System.in); //Declares the console scanner.
		
		int[] values = new int[10]; //The new values stored as int.
		int popCount = 0; //Stores the counter for the populate loop.
		
		while (scan.hasNextInt() && popCount < values.length) {
			
			int num = scan.nextInt(); //Stores the next value found in the file into an array.
			
			values[popCount] = num; //Assign the array index the value.
			
			popCount++;
		}
		
		System.out.print("Type a number you want to find: ");
		
		int input = inputScan.nextInt(); //Stores the user input as int.
		
		boolean isFound = false; //Stores the while loop condition as isFound.
		int itemIndex = 0; //Stores the counter for the loop.
		
		while (isFound == false && itemIndex < popCount) {
			
			int num = values[itemIndex]; //Store the index value as int.
			
			if(num == input){
				isFound = true;
			} else {
				itemIndex++;
			}
			
		}
		
		//Checks if the value was just not found when the loop ends.
		if (isFound == false){
			System.out.println("Unable to find the value.");
		} else {
			System.out.println("We found your value of " + input + " at index " + itemIndex + ".");
		};
		
		//Close both scanners.
		scan.close();
		inputScan.close();
	}
}
