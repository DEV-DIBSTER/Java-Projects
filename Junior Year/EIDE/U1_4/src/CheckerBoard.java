
/**
 * @author salam.1
 * Class: CheckerBoard
 * Assignment: U1-4 Part 1
 * Purpose: The objective of this assignment is to get familiar with working with 2D Arrays in Java.
 * 
 */
public class CheckerBoard {

	public static void main(String[] args) {
		
		int[][] array2D = new int[8][8]; //The 2D Array that we are working with.
		
        int counter = 0; //The number counter for the object.
        
        //Populate the 2D Array Loop.
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
            	
            	array2D[row][col] = (col + row) % 2;
            	
            }
        }
        
        // Display the contents of the array using a regular nested loop.
        for (int row = 0; row <= array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            
            System.out.println(); //This just generates a new line character.
        }
        
        System.out.println("\n\n\n");
       
        
        for (int[] valrow: array2D){
			for (int val : valrow){
				System.out.print(val + " ");
			}
			
			System.out.println();
        }
	}

}
