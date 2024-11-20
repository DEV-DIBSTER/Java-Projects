import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author salam.1
 * Class: FindSum
 * Assignment: U1-3 Part 2
 * 
 * Test Cases:
 * 
 * -------------------------------------------
 * File Contents: 1 2 3 4 5 6 7 8
 * 
 * Find a normal sum:
 * 
 * Find Sum: 3
 * Indexes/Array Value: (0, 1) and (1, 2)
 * --
 * 
 * Find a sum based on first and last number:
 * 
 * Find Sum: 9
 * Indexes/Array Value: (0, 1) and (7, 8)
 * 
 * --
 * Find a sum based on something that isn't possible.
 * 
 * Find Sum: 40
 * 
 * No Indexes/Array Value: found with such sum.
 * 
 * -------------------------------------------
 * 
 * File Contents: 6 6 6 3 2 4 1 2
 * 
 * Find a normal sum:
 * 
 * FindSum: 6
 * Indexes/Array Value: (4, 2) and (5, 4)
 * 
 * -------------------------------------------
 * 
 * File Contents: 2 5 7 3 19 12 22 31
 * 
 * Find Sum: 34
 * Indexes/Array Value:: (4, 3) and (7, 31)
 * 
 * --
 * 
 * Find Sum: 32
 * 
 * No Indexes found with such sum.
 * -------------------------------------------
 */
public class FindSum {

    public static void main(String[] args) throws FileNotFoundException {
    	
        int[] array = new int[8]; //Declares my array with the integers present.

        File inputFile = new File("FindSum.txt"); //The file I'm going to reading from.
        
        Scanner fileScanner = new Scanner(inputFile); //Declare the file scanner.
        
        //Populate the array.
        for (int i = 0; i < array.length; i++) {
        	array[i] = fileScanner.nextInt();
        }

        fileScanner.close();
        
        //Display the array contents.
        System.out.print("Array Contents: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Ask the user to provide a sum.
        Scanner userInputScanner = new Scanner(System.in); //The user scanner object.
        System.out.print("\nWhat sum would you like to find in the data: ");
        int userSum = userInputScanner.nextInt(); //Stores the user input as int.

        boolean found = false; //Used for the loop condition to make sure it stops once we found a match.
        int firstIndex = 0;	   //Used for the current index we are in. This is outside the first loop.
        int secondIndex = 0; 	   //Used for the second index we are in. This in within the first loop.

        //Array.length refers to the number of indexes, which is one less than the length.
        while (firstIndex < (array.length - 1) && !found) {
        	
            secondIndex = firstIndex + 1; //We want to start looking for the number straight after the index we are searching for.
            
            while (secondIndex < array.length && !found) {
                if (array[firstIndex] + array[secondIndex] == userSum) {
                	                    
                    found = true; // Set the variable to true to exit both loops.
                } else {
                    secondIndex++;
                }
            }
            
            if (found == false){
            	firstIndex++;
            }
        }

        // If no indices are found with the specified sum
        if (!found) {
            System.out.println("No indices found with sum: " + userSum);
        } else {
        	System.out.println("Indices with sum " + userSum + ": (" + firstIndex + ", " + array[firstIndex] + ") and (" + secondIndex + ", " + array[secondIndex] + ")");
        }
        
        userInputScanner.close();
    }
}