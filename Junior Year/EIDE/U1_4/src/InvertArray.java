import java.util.Arrays;

/**
 * @author salam.1
 * Class: FillRowMajor
 * Assignment: U1-4 Extension Part 2
 * Purpose: The purpose of part is to invert a 2D array (swap the rows with the columns) by creating a new array with the necessary size and populating it accordingly.
 */

public class InvertArray {

	public static void main(String[] args) {
		
		int[][] array = {
				{10, 11, 12, 13, 14, 15},
				{20, 21, 22, 23, 24, 25},
				{30, 31, 32, 33, 34, 35},
				{40, 41, 42, 43, 44, 45}
		}; //The 2D array object.
		
		System.out.println("Original 2D Array: ");
		for (int[] valrow: array){
			for (int val : valrow){
				System.out.print(val + " ");
			}
			
			System.out.println();
        }
		
		int[][] reverseArray = new int[array[0].length][array.length]; //The new reversed array.
		
		for (int row = 0; row < array.length; row++){
			
			for (int col = 0; col < array[0].length; col++){
				reverseArray[col][row] = array[row][col];
			}
		}
		
		System.out.println("\n\nReverse 2D Array: ");
		for (int[] valrow: reverseArray){
			for (int val : valrow){
				System.out.print(val + " ");
			}
			
			System.out.println();
        }
	}

}
