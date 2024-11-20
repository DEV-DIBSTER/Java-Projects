import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * @author salam.1
 * Class: FindSum
 * Assignment: U1-3 Part 2
 * 
 * Test Cases:
 * 
 * 1 2 3 4 5
 * 
 * ----------------------------------------------
 * Removing the first element of the array.
 * 
 * Remove?: y
 * Number?: 1
 * 
 * 2 3 4 5
 * 
 * Remove?: n
 * 
 * Final Array: [2, 3, 4, 5, 0, 0, 0, 0, 0, 0]
 * ----------------------------------------------
 * Removing the last element of the array.
 * 
 * Remove?: y
 * Number?: 5
 * 
 * 1 2 3 4
 * 
 * Remove?: n
 * 
 * Final Array: [1, 2, 3, 4, 0, 0, 0, 0, 0, 0]
 * ----------------------------------------------
 * Removing all numbers within the array.
 * 
 * Remove?: y
 * Number?: 5
 * 
 * 1 2 3 4
 * 
 * Remove?: y
 * Number?: 4
 * 
 * 1 2 3
 * 
 * Remove?: y
 * Number?: 3
 * 
 * 1 2
 * 
 * Remove?: y
 * Number?: 2
 * 
 * 1
 * 
 * Remove?: y
 * Number?: 1
 * 
 * 
 * 
 * Remove?: n
 * Final Array: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * ----------------------------------------------
 * Remove the middle element from the array.
 * 
 * Remove?: y
 * Number?: 3
 * 
 * 1 2 4 5
 * 
 * Remove?: n
 * 
 * Final Array: [1, 2, 4, 5, 0, 0, 0, 0, 0, 0]
 * ---------------------------------------------
 *
 * NEW TEST FROM FILE: 1 1 2 2 2 3 3 4 5
 * 
 * Remove the first element of duplicate.
 * 
 * Remove?: y
 * Number?: 2
 * 
 * 1 1 2 2 3 3 4 5
 * 
 * Remove?: n
 * Final Array: [1, 1, 2, 2, 3, 3, 4, 5, 0, 0]
 * --------------------------------------------
 * Remove a number that wasn't found.
 * 
 * Remove?: y
 * Number?: 6
 * 
 * Value not found.
 * 
 * 1 1 2 2 2 3 3 4 5
 * 
 * Remove?: n
 * Final Array: [1, 1, 2, 2, 2, 3, 3, 4, 5, 0]
 * --------------------------------------------
 */
public class SortedRemove {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("SortedRemove.txt"); //The file I'm going to reading from.
        Scanner fileScan = new Scanner(inputFile); //The scanner for the file.
        Scanner scan = new Scanner(System.in); //Declares the console scanner.

        int[] vals = new int[10]; //The array to store values within.

        int validNums = 0; //The validNums stores the amount of valid numbers within the array.

        while (fileScan.hasNextInt() && validNums < vals.length) {
            int val = fileScan.nextInt(); //The int value stored as an int.

            vals[validNums] = val;

            validNums++;
        }

        System.out.println("Numbers of currently used elements in an array: " + validNums);
        System.out.print("Contents of Arrays: ");

        for (int i = 0; i < validNums; i++) {
            System.out.print(vals[i] + " ");
        }

        boolean isDoneRemovingNumbers = false; //This is the condition for the loop statement, to see how many numbers you want removed from the array.

        while (isDoneRemovingNumbers == false) {
        	
            System.out.print("\n\nDo you want to remove an element from the array? (y/n): ");
            
            String response = scan.nextLine(); //The user response stored as string.
            
            if (response.equals("n")) {
                System.out.println("\nYou choose not to remove any additional elements.");

                isDoneRemovingNumbers = true;

            //The user decides they want to remove elements from the array.
            } else {
                System.out.print("\nType a VALUE you want to remove from the array: ");

                int userInput = scan.nextInt(); //This stores the user input as an integer.

                boolean isFound = false; //Stores the condition for the loop statement.

                int index = 0; //The index where the element is located.

                while (isFound == false && index < vals.length) {

                    if (vals[index] == userInput) {
                        isFound = true;
                    } else {
                        index++;
                    }
                }
                
                //This is just a check to make sure if I don't find the value, it would just stop.
                if (isFound == false) {
                	System.out.println("That value was not found within the array.");
                	
                //This else would mean I found the value, and now I want to "remove" it from the array.
                } else {
                	
                    int replaceIndex = index; //This variable determines the index of the removed array I am at. This will not increase if I found the number I want to remove.
                    int normalIndex = index;  //This variable determines the index of the current unchanged array. This will increase even if I found the number, as I don't want to save that index.
                                                         
                    //This checks I don't go over the number of valid numbers.
//                    while (normalIndex < validNums) {
//                                       	
//                    	//Debug line. You may safely ignore.
//                        System.out.println("Index: " + index + "| ReplaceIndex: " + replaceIndex + "| NormalIndex: " + normalIndex + "| ValidNums: " + validNums);
//                        
//                        if (normalIndex != index) {                        	
//                        	int replaceValue = vals[normalIndex]; //Temporary variable to store the actual value found at that index.
//                        	
//                        	vals[replaceIndex] = replaceValue; //Replace the index value with the correct value after removal.
//                        	
//                        	normalIndex++;
//                        	replaceIndex++;
//                        } else {
//                        	//Do nothing, as we are skipping over this. We will only increment the normal array, so we'd remove this current index with the following number.
//                        	
//                        	normalIndex++;
//                        }
//                        
//                    }
                    
                    for (int i = index; i < validNums; i++) {
                       	
                    	//Debug line. You may safely ignore.
                        System.out.println("Index: " + index + " | ReplaceIndex: " + replaceIndex + " | NormalIndex: " + normalIndex + " | ValidNums: " + validNums);
                        
                        if (normalIndex != index) {                        	
                        	int replaceValue = vals[normalIndex]; //Temporary variable to store the actual value found at that index.
                        	
                        	vals[replaceIndex] = replaceValue; //Replace the index value with the correct value after removal.
                        	
                        	normalIndex++;
                        	replaceIndex++;
                        } else {
                        	//Do nothing, as we are skipping over this. We will only increment the normal array, so we'd remove this current index with the following number.
                        	
                        	normalIndex++;
                        }
                        
                    }   
                }
                
                validNums--; //Reduce the number of valid numbers by one.
            }
                                    
            System.out.print("Here is your array with valid elements seperated by spaces: ");
            
            for (int i = 0; i < validNums; i++) {
                System.out.print(vals[i] + " ");
            }
            
            for (int i = (validNums - 1); i < vals.length; i++){
            		vals[i] = 0;
            }
                     
            System.out.println();
                        
            if (isDoneRemovingNumbers == false){
                scan.nextLine();
            }
        }
        
        //This is where I need to display the output.
        System.out.print("Here is your final array: ");
        System.out.println(Arrays.toString(vals));

        //Close both of the scanner objects.
        fileScan.close();
        scan.close();
    }

}