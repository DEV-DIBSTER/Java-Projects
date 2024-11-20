/**
 * @author salam.1
 * Class: ExpandIt
 * Assignment: U1-4 Extension Part 4
 * Purpose: Given a 2D array of a given size expand the data into a larger array (expansion in both in rows and columns).
 */
public class ExpandIt {

	public static void main(String[] args) {		

		int[][] array2D = {
							{25, 24, 23, 22 },
							{21, 20, 19, 18 },
							{17, 16, 15, 14 }
		}; //The old 2D array.

		int[][] newArray2D = new int[4][5]; //The newer larger expanded 2D array.
		
		int counter = 0; //The counter for the for loop.
		
		
		for (int row = 0; row < array2D.length; row++) {

			for (int col = 0; col < array2D[0].length; col++) {

				newArray2D[((counter) / newArray2D[0].length)][((counter) % newArray2D[0].length)] = array2D[row][col];
				
				counter++;				
			}
		}

	
		System.out.println("2D Array: ");

		for (int row = 0; row < array2D.length; row++) {

			for (int col = 0; col < array2D[0].length; col++) {

				System.out.print(array2D[row][col] + " ");
			}

			System.out.println();
		}
		
		System.out.println("\nNew 2D Array: ");

		for (int row = 0; row < newArray2D.length; row++) {
			for (int col = 0; col < newArray2D[0].length; col++) {
				System.out.print(newArray2D[row][col] + " ");
			}
			
			System.out.println();
		}
	}
}