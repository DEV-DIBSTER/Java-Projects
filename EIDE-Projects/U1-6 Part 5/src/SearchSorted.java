import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SearchSorted {
	/**
	 * 
	 * When a value is not found in a sorted array as part of a linear search, the number of elements inspected is: the length of the array. 
	 * 
	 * When the element value is greater than the target number we are searching for,
	 * we know we can stop the loop and we will not find it because
	 * the array is aleady sorted in order.
	 * 
	 * If I'm searching for the number 15, and my next array element is 20,
	 * that my element is not in the array as it is already pre sorted in order.
	 * 
	 * When I have two different values within my array, both could find the same number at the different index.
	 * Because linear searches each and every one by one, binary doesn't go linear, instead it goes to the middle, and then narrows it down from each side.
	 * So if I have multiple number "3", my binary search could find a later value.
	 * While my linear search will find the first value of "3".
	 * 
	 * 
	 * Assignment: U1-6 Part 5
	 * Class Name: SearchSorted
	 * Purpose: Using Arrays.
	 * @author: salam.1
	 * 
	 * The contents of the array are: [1, 2, 4, 8, 15, 19, 31, 73, 101, 150]
	 * What value do you want to search for? 8
	 * Your value was found at index: 3
	 * 
     * The contents of the array are: [1, 2, 4, 8, 15, 19, 31, 73, 101, 150]
	 * What value do you want to search for? 1
	 * Your value was found at index: 0
	 * 
	 * The contents of the array are: [1, 2, 4, 8, 15, 19, 31, 73, 101, 150]
	 * What value do you want to search for? 150
	 * Your value was found at index: 9
	 * 
	 * The contents of the array are: [1, 2, 4, 8, 15, 19, 31, 73, 101, 150]
	 * What value do you want to search for? 3
	 * Your value was not found.
	 * 
	 * Test Cases:
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		   
		   
		Scanner scan = new Scanner(new File("input.txt")); //Setting up scan
		int[] sortInts = new int[10]; //An array that contains contents of the file
		       
		int myNum; //The Number Read From the input.txt
		int j = 0; //loop counter.
		
		//Personal Note: Sets all the values into the array.
		while (scan.hasNextInt() && j < sortInts.length) {
			myNum = scan.nextInt();
			
			sortInts[j] = myNum;
			
			j++;
		}
				
		scan.close();

		System.out.println("The contents of the array are: " + Arrays.toString(sortInts));
	       
        Scanner consoleScanner = new Scanner(System.in); //Setting up the scanner
       
        System.out.print("What value do you want to search for? ");
       
        int target = consoleScanner.nextInt(); //The search int
        consoleScanner.close();
       
        
        int indexResult = -1; //The Result
        boolean stopCounter = false; //The While Loop Breaker
        int i = 0; //loop counter
       
        while(stopCounter == false && i < sortInts.length){
        	
	        if (sortInts[i] == target) {
	            indexResult = i;
	            stopCounter = true;
	            
	        } else if (sortInts[i] > target){
	        	
	        	stopCounter = true;
	        } else {
	        	//Nothing is to be done, as this will just continue to the loop.
	        	//The value is lower than expected, and was not found in the array.
	        }
	        
	        i++;
        }
        
        int binaryResult = Arrays.binarySearch(sortInts, target); //Finds the index of the element inside the array with binary search.

        System.out.println(binaryResult);
        
        if (indexResult == -1) {
            System.out.println("Your value was not found.");
        } else {
            System.out.println("Your value was found at index: " + (indexResult));
            System.out.println("Your value with binary search was found at index: " + (binaryResult));
        }
    }
}
