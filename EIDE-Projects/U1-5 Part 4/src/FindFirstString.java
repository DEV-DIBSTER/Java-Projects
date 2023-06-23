import java.util.Scanner;

/**
 * Assignment: U1-5 Part 4
 * Class: FindFirstString
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * adib
 * z
 * 
 * I was not able to find the string!
 * ----------------------------------
 * 
 * adib
 * i
 * 
 * I found it! It was located at index: 2
 * ----------------------------------
 * 
 * adib
 * a
 * 
 * I found it! It was located at index: 0
 * ----------------------------------
 * adib
 * 
 * b
 * 
 * I found it! It was located at index: 3
 */
public class FindFirstString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Setting up the Scanner object.

		boolean done = false; //The statement to continue while loop.

		int i = 0; 

		System.out.print("Input a string: ");

		String ser_String = scan.nextLine();

		System.out.print("Input the character to find: ");

		String ser_letter = scan.nextLine();

		while(done == false && i <= ser_String.length()){
			if(i < ser_String.length()){
				
				String inputString = ser_String.substring(i, i + 1);
				
				if(inputString.equals(ser_letter)){
					System.out.println("Your character was found at position: " + i);
					
					done = true;
				}
			}
			i++;
		}

		if(done == false && i >= ser_String.length()){
			System.out.println("Your character was not found in the string!");
		}
		
		scan.close();
	}
}
