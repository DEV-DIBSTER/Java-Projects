import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	/**
	 * When a value is not found in an unsorted array as part of a Linear Search, the number of elements inspected is: The length of the array.
	 * Assignment: U1-6 Part 4
	 * Class Name: LinearSearch
	 * Purpose: Using Arrays.
	 * @author: salam.1
	 * 
	 * Test Cases:
	 * 
	 * 3
	 * 4
	 * 5
	 * 6
	 * 1
	 * 2
	 * 5
	 * 7
	 * 88
	 * 45454
	 * 343
	 * 323
	 * 806
	 * 
	 * What value do you want to search for? 88
	 * Your value was found at index: 8
	 * 
	 * What value do you want to search for? 77
	 * Your value was not found.
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		   
		   
		Scanner scan = new Scanner(new File("input.txt")); //Setting up scan object.
		int[] sortInts = new int[10]; //An array that contains contents of the file.
		       
		int myNum; //The number read from the input.txt file.
		int j = 0; //The loop counter stored as int.

		while (scan.hasNextInt() && j < sortInts.length) {
			myNum = scan.nextInt();
			
			sortInts[j] = myNum;
			
			j++;
		}
		
		scan.close();

		System.out.println("The contents of the array are: " + Arrays.toString(sortInts));
	       
        Scanner consoleScanner = new Scanner(System.in); //Setting up the scanner object.
       
        System.out.print("What value do you want to search for? ");
       
        int target = consoleScanner.nextInt(); //The search integer stored as int.
        consoleScanner.close();
       
        int indexResult = -1; //Stores the results as index.
        boolean found = false; //This statement determines whether or not to stop the while loop.
        int i = 0; //The loop counter stored as int.
       
        while(found == false && i < sortInts.length){
	        if (sortInts[i] == target) {
	            indexResult = i;
	            found = true;
	        }
	        
	        i++;
        }

        if (indexResult == -1) {
            System.out.println("Your value was not found.");
        } else {
            System.out.println("Your value was found at index: " + (indexResult));
        }
    }
}
