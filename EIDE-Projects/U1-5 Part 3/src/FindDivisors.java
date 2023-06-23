import java.util.Scanner;

/**
 * Assignment: U1-5 Part 3
 * Class: FindDivisors
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * 30:
 * 
 * 1 2 3 5 6 10 15 30
 * 8
 * 
 * 20:
 * 
 * 1 2 4 5 10 20
 * 6
 * 
 * 
 * 
 */

public class FindDivisors {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please type a divisor: ");
		
		int divisor = scan.nextInt(); //Stores the divisor and stores as int.
		scan.nextLine();
		
		String outputString = ""; 	//Stores the output string.
		
		//Stores the divisibleCount.
		int divisibleCount = 0;
		
		for (int i = 1; i <= divisor; i++){
			
			if(divisor % i == 0){
				outputString += i + " ";
				
				divisibleCount++;
			}
		}
		
		System.out.println("Divisors are: " + outputString);
		System.out.println("Number of divisors found: " + divisibleCount);
	}

}
