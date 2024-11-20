import java.util.Scanner;
/**
 * Assignment: U2-1 Part 4
 * Class: GCD
 * @author salam.1
 * Purpose: The purpose of Part 4 is to find the Greatest Common Denominator using this specified algorithm.
 * 
 * Test Cases:
 * 
 * 67 12
 * 1
 * 
 * 33 11
 * 11
 * 
 * 15 3
 * 3
 * 
 * 91 9
 * 1
 */
public class GCD {

	/**
	 * Purpose: Find the greatest common factor out of two numbers.
	 * @param input1 - First number input.
	 * @param input2 - Second number input.
	 * @return int - The Greatest common factor given the two input numbers.
	 */
	public static int GCD(int input1, int input2){
		
		int temp; //Stores the temp.
		
		while (input2 != 0){
			
			temp = input2;
			input2 = input1 % input2;
			input1 = temp;
		}
		
		return input1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Declares the scanner class.
		
		System.out.print("Type two ints: ");
		
		int input1 = scan.nextInt(); //Stores the int for first number.
		int input2 = scan.nextInt(); //STores the int for the second number.
		
		int GCD = GCD(input1, input2); //The int from GCD.
		
		System.out.println("The GCD is: " + GCD);
	}

}
