import java.util.Arrays;

/**
 * @author salam.1
 * Class: SwapRowsThenCols
 * Assignment: U1-4 Part 3
 * Purpose: The purpose of this part is to first swap two rows in a 2D array and then swap two columns in that same array.
 *
 */
public class SwapRowsThenCols {

	public static void main(String[] args) {
		
		int[][] array = {
				{10, 11, 12, 13, 14, 15},
				{20, 21, 22, 23, 24, 25},
				{30, 31, 32, 33, 34, 35},
				{40, 41, 42, 43, 44, 45}
		}; //The 2D array object.
		
        System.out.println(Arrays.deepToString(array) + "\n");
		
		// Display the contents of the array using a regular nested loop.
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            
            System.out.println(); //This just generates a new line character.
        }
        
        //Swaps the rows.
        int[] tempArray = new int[array[0].length]; //Temporarily store the values for the first array here.
        
        tempArray = array[1]; //Puts first row data in tempArray.
        array[1] = array[3];  //Swaps the two arrays.
        array[3] = tempArray; //Fills the last array with the last swapped data.
        
        System.out.println("\n");
        
        // Display the contents of the array using a regular nested loop.
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            
            System.out.println(); //This just generates a new line character.
        }
        
        //Swaps the columns.
        int[] tempColArray = new int[array.length]; //This is used to store the values of the column that I need to swap.
        
        //Storing the first element of each column into array.
        for (int i = 0; i < array.length; i++){
        	tempColArray[i] = array[i][0];
        }
        
        //Changing the first element of the array to the second element of the array.
        for (int i = 0; i < array.length; i++){
        	array[i][0] = array[i][1];
        }
        
        //Changing the second element of the array to the first element of the array stored in the temp array.
        for (int i = 0; i < array.length; i++){
        	array[i][1] = tempColArray[i];
        }
        
       
        System.out.println("\n");
        
        for (int[] valrow: array){
			for (int val : valrow){
				System.out.print(val + " ");
			}
			
			System.out.println();
        }
	}

}
