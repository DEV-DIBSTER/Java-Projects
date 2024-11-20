import java.util.Arrays;
import java.util.Scanner;

public class SelfDivisor {
	/**
	 * @author salam.1
	 * Assignment: U1-5 Coding Round 2
	 * Class: SelfDivisor
	 * 
	 * Purpose: Find self divisors from a starting int
	 * 
	 * Test Cases: 
	 * 200
	 * find: 3
	 * 211, 212 213
	 * 
	 * 10
	 * find 3
	 * 11, 12, 15
	 * 
	 * 1000
	 * find 2
	 * 1111 1112 1113
	 * 
	 **/

	public static void main(String[] args) {		
		Scanner scan = new Scanner (System.in); //Creating the scanner object.
		
		System.out.print("Enter the start value to search for self divisors: ");
		
		int startNum = scan.nextInt(); //The initial value to start from.
		
		boolean isSelfDivisor = false; //Checks each number to verify if it is a self-divisor.
		
		System.out.print("Indicate the number of self‐divisor results to be achieved: ");
		int numCount = scan.nextInt(); //The number of self divisors that we want to get.
		
		int arrayNum = 0; //The array index for each number
		
		int selfDivisors[] = new int[numCount]; //The numbers that are self-divisors are stored in here
				
		while(arrayNum < numCount){
			
			int number = startNum; //The number stored in the variable temporarily.
			
			while(number > 0){
				int lastDigit = number % 10; //Getting the last digit of the number
				
				if (lastDigit == 0 || startNum % lastDigit != 0) {
				
					number = -1; //This is our while loop trigger, we stop the loop.
					isSelfDivisor = false;
					
				}
				else {
					
					isSelfDivisor = true;	
				}
				number /= 10;
			}

			if (isSelfDivisor == true){
				
				selfDivisors[arrayNum] = startNum;
				arrayNum++;
				isSelfDivisor = false;
			}
			
			startNum++;
		}
		
		scan.close(); //Close the scanner object.

		System.out.println(Arrays.toString(selfDivisors));
	}
}