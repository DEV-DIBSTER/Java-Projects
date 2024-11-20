import java.util.Arrays;

/**
 * @author salam.1
 * Class: FillColMajor
 * Assignment: U1-4 Extension Part 1
 * Purpose: The purpose of part is to fill a 2D array in column-major order from a 1D array.
 */
public class FillColMajor {

	public static void main(String[] args) {
		
		int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29}; //The 1D array.
		
		System.out.println("Content of 1D Array: \n\n" + Arrays.toString(array));
		
		int[][] array2D = new int[4][5]; //Declare the new 2D array.
		
		int counter = 0; //The counter for the loop.
		
		for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
            	
            	if (counter < array.length){
            		array2D[row][col] = array[counter];
            	}
            	            	
            	counter++;
            }            
        }
		
		System.out.println("\n\nContents of the 2D Array: \n");
		
		for (int[] valrow: array2D){
			for (int val : valrow){
				System.out.print(val + " ");
			}
			
			System.out.println();
        }
	}

}
