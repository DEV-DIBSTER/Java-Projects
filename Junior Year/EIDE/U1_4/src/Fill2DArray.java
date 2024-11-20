import java.util.Arrays;

public class Fill2DArray {
	public static void main(String[] args) {
		
		int[][] array2D = new int[5][4]; //The 2D Array that we are working with.

        int counter = 1; //The number counter for the object.

        //Populate the 2D Array Loop.
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
                array2D[row][col] = counter++;
            }
        }

        // Display the contents of the array using a regular nested loop.
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            
            System.out.println(); //This just generates a new line character.
        }

        System.out.println("\n" + Arrays.deepToString(array2D));		
	}
}