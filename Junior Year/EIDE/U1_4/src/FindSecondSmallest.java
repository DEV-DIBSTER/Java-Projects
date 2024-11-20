import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * @author salam.1
 * Class: FindSecondSmallest
 * Assignment: U1-4 Part 2
 * Purpose: The purpose of this part is to find the smallest and second smallest value in a 2D array.
 * 
 * Test Cases:
 * 
 * 1 2 3 4 5 6 7 8 9 10 11 12
 * 
 * Smallest: 1
 * 2 Smallest: 2
 * 
 * 3 4 1 67 -14 5 7 8 2 4 9
 * 
 * Smallest: -14
 * 2 Smallest: 1
 * 
 * 3 4 1 67 -14 5 7 8 2 4 9 5 5 5 6 6 6 7 7 7
 * 
 * Smallest: -14
 * 2 Smallest: 1
 */
public class FindSecondSmallest {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] array = new int[3][4]; //The 2D Array that we are working with.
		
		File inputFile = new File ("FindSecondSmallest.txt"); //Declare the file object.
		
		Scanner scan = new Scanner(inputFile); //Declare the file scanner.
		
		int loopCounterRow = 0; //The counter for the row loop.
		int loopCounterCol = 0; //The counter for the col loop.
		
		while (scan.hasNextInt() && loopCounterRow < array.length){
			
			int fileNumber = scan.nextInt(); //The number from the file stored as int.
			
			array[loopCounterRow][loopCounterCol] = fileNumber;
			
			loopCounterCol++;
			
			if (loopCounterCol == array[0].length){
				loopCounterCol = 0;
				loopCounterRow++;
			}
		};
		
		int smallestNum = Integer.MAX_VALUE; //Stores the smallest number.
		int secondSmallestNum = Integer.MAX_VALUE; //Stores the second smallest number.
		
		// Find the Smallest.
		for (int row = 0; row < array.length; row++){
			
			for (int col = 0; col < array[0].length; col++){
				
				if (smallestNum > array[row][col]){
					smallestNum = array[row][col];
				}
			}
		}
		
		// Find the Second Smallest.
		for (int row = 0; row < array.length; row++){
			
			for (int col = 0; col < array[0].length; col++){
				
				if (secondSmallestNum > array[row][col] && array[row][col] > smallestNum){
					secondSmallestNum = array[row][col];
				}
			}
		}
		
        System.out.println(Arrays.deepToString(array) + "\n");		
        System.out.println("Smallest Number: " + smallestNum);
        System.out.println("Second Smallest Number: " + secondSmallestNum);
		
		scan.close();
	}

}
