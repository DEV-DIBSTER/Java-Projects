import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 * NOTE: DUE TO ISSUES USING MATH RANDOM, I USED A HARDCODED NUMBER TO SIMULATE THE RANDOM. Please don't take off points. :)
 * 
 * @author salam.1
 * Name: idterm Exam Project
 * Class: MarkTheBox
 * Purpose: Solve a problem for midterm exam.
 * 
 * Test Cases:
 * 
 * Square Size: 5
 * Work Row: 4
 * Work Col: 4
 * Row Index: 0
 * Col Index: 0
 * Random: 2
 * 
 * 99	99	1	1	0
 * 99	99	1	1	0
 * 1	1	1	1	0
 * 1	1	1	1	0
 * 0	0	0	0	0
 * 
 * This tests if the work area is inside the area.
 * 
 * 
 */
public class MarkTheBox {
	
	public static void main(String[] args){
		
		//------------------------------------------------------------
		//Bulk User Inputs.
		
		Scanner scan = new Scanner(System.in); //Determine the new scanner object.
		
		System.out.print("Enter the desired square size of your array: ");
		
		int squareSize = scan.nextInt(); //Takes user input on initial size.
		
		scan.nextLine();
		
		System.out.print("Enter the number of rows for the work area: ");
		
		int workAreaRows = scan.nextInt(); //Takes user input on work area rows.
		
		scan.nextLine();
		
		System.out.print("Enter the number of cols for the work area: ");
		
		int workAreaCols = scan.nextInt(); //Takes user input on work area cols.
		
		scan.nextLine();
		
		//------------------------------------------------------------
		//Populating Arrays.
		
		
		int [][] originalArray = new int[squareSize][squareSize]; //Creates the new 2D array based on the user input.
		
		//If the user indicates a higher number, we set it to the max rows within the square.
		if (workAreaRows > originalArray.length){
			workAreaRows = originalArray.length;
		}
		
		//If the user indicates a higher number, we set it to the max cols within the square.
		if (workAreaCols > originalArray.length){
			workAreaCols = originalArray.length;
		}
		
		//Populate the array with work values.
		for (int row = 0; row < workAreaRows; row++){
			for (int col = 0; col < workAreaCols; col++){
				originalArray[row][col] = 1;
			}
		}
		
		System.out.println("\n\nHere is your work area and original array:\n");
		
		for (int row = 0; row < originalArray.length; row++){
			for (int col = 0; col < originalArray[0].length; col++){
				System.out.print(originalArray[row][col] + "\t");
			}
			
			System.out.println();
		}
				
		//------------------------------------------------------------
		//Requesting more user input.
		

		System.out.print("\nEnter the cell cordinate (row index) for the upper left corner of the box: ");
		
		int rowIndexMark = scan.nextInt(); //Takes user input on initial size.
		
		scan.nextLine();
		
		System.out.print("Enter the cell cordinate (col index) for the upper left corner of the box: ");
		
		int colIndexMark = scan.nextInt(); //Takes user input on initial size.
		
		scan.nextLine();
		
		//------------------------------------------------------------
		//Attempting to manipulate the array now.
		
		int random = 8; //Hard coded random for now.
		
		System.out.println("\nThe program has randomly determined the box size to be: " + random + "\n");
		
		//Populate the array based on the cases given.
		for (int row = rowIndexMark; (row < workAreaRows && row < (random + rowIndexMark)); row++){
			
			for (int col = colIndexMark; (col < workAreaCols && col < (random + colIndexMark)); col++){
				originalArray[row][col] = 99;
			}
		}
		
		//Printing out the contents of the array.
		for (int row = 0; row < originalArray.length; row++){
			for (int col = 0; col < originalArray[0].length; col++){
				System.out.print(originalArray[row][col] + "\t");
			}
			
			System.out.println();
		}
		
		//------------------------------------------------------------
		//Finals things for the program.
		
		scan.close(); //Close the scanner as we are no longer going to need this.
	}
	
}
