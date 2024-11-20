import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
 * @author salam.1
 * Class: ALRemoveDup
 * Purpose: The purpose of this exercise to remove duplicates from a sorted ArrayList of integers (so that just one copy of each integer remains).
 * 
 * Test Cases:
 * 
 * Origin: 15, 62, 98, 98, 98, 100, 100, 214, 214, 516, 617, 617, 867, 896, 1000, 1000
 * New: 15, 62, 98, 100, 214, 516, 617, 867, 896, 1000
 * 
 * Origin: 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 7
 * New: 1, 2, 3, 4, 5, 6, 7
 */
public class ALRemoveDup {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("Duplicate.txt");
		
		Scanner scan = new Scanner(file);
		
		ArrayList <Integer> origin = new ArrayList <Integer> (); //Declares the array list as a variable.
	
		while(scan.hasNextInt()){
			origin.add(scan.nextInt());
		};
		
		scan.close(); //Close the scanner.
		
		System.out.println("Contents of the original array: " + origin);
		
		int index = 0; //The index which we are at.
		
		while (index < origin.size()){
			
			if (index != 0 && (origin.get(index).equals(origin.get(index - 1)))){
				
				origin.remove(index);
			} else {
				index++;
			}
		};
		
		System.out.println("Contents of the new array: " + origin);
	}
}
