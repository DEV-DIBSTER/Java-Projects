import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 * @author salam.1
 * U1-6 Part 1
 * File: ReadFromFile
 * Testcases:
 * 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 
 * ----
 * 
 * 0
 * 1
 * 2
 * 2
 * 3
 * 4
 * 5
 * 4
 */

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("input.txt"); //Setting up the file object.
		
		Scanner scan = new Scanner(inputFile); //Setting up scan object for file.
		
		int myNum; //The numbers from input.txt
		
		while (scan.hasNextInt()){
			myNum = scan.nextInt();
			scan.nextLine(); //Consume the new line token.
			
			System.out.println(myNum);
		};
		
		scan.close();
	}

}
