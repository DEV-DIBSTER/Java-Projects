import java.util.Scanner;

/**
 * @author salam.1
 * Class: FindMaxMinOddEven
 * Assignment: U1-2 Part 5
 * Purpose: The purpose of this program is to accept a number of integers and determine the maximum integer,
 * and the minimum integer from what was entered. Then, also determine how many of the inputed,
 * numbers were odd and how many of the inputed numbers were even.
 * 
 * Test Cases:
 *
 * Checks if the max number which is placed at the end is found, and the minimum value placed at the beginning is found at the beginning.
 *
 * Entered: 4
 * Numbers: 5 6 7 8
 * Max: 8
 * Min: 5
 * Odd: 2
 * Even: 2
 * 
 * Checks low number inputs, checks if max and minimum are the same number, and checks if the counter for even stays at 0, and counter for odd ends with 2.
 * Entered: 2
 * Numbers: 1 1
 * Max: 1
 * Min: 1
 * Odd: 2
 * Even: 0
 * 
 * Checks if they are all 0, and make sure max, min, and odd are all 0, while even is the number of 0 present.
 * 
 * Entered: 6
 * Numbers: 0 0 0 0 0 0
 * Max: 0
 * Min: 0
 * Odd: 0
 * Even: 6
 * 
 * This test case below has high numbers, and then goes down, makes sure it can check the minimum value which is at the very end.
 * Entered: 5
 * Numbers: 5 4 3 2 1
 * Max: 5
 * Min: 1
 * Odd: 3
 * Even: 2
 * 
 * Entered: 2
 * Numbers: 0 2
 * Max: 2
 * Min: 0
 * Odd: 0
 * Even: 2
 * 
 * These two checks does negative numbers, and make sure's all the min and max values are correct, while maintaining odd and even numbers.
 * 
 * Entered: 2
 * Numbers: 0 -3
 * Max: 0
 * Min: -3
 * Odd: 1
 * Even: 1
 * 
 * Entered: 3
 * Numbers: 5 -3 2
 * Max: 5
 * Min: -3
 * Odd: 2
 * Even: 1
 * 
 * Checks if there is one number present.
 * 
 * Entered: 1
 * Numbers: 2
 * Max: 2
 * Min: 2
 * Odd: 0
 * Even: 1
 */

public class FindMaxMinOddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //Declares scanner object to scan input.
		
		System.out.print("How many numbers will you be entering? ");
		
		int totalCount = scan.nextInt(); //Total count of numbers.
		
		if (totalCount != 0) {
			int evenCount = 0; //The even number counter stored as int.
			int oddCount = 0;  //The odd number counter stored as int.
			int maxNum = Integer.MIN_VALUE; //The max number out of the entire string stored as int.
			int minNum = Integer.MAX_VALUE; //The min number out of the entire string stored as int.
			
			scan.nextLine();
			
			System.out.print("Enter your numbers seperated by spaces: ");
			
			for (int i = 0; i < totalCount; i++){
				int input = scan.nextInt();
				
				if (input < minNum) {
					minNum = input;
				}
				
				if (input > maxNum) {
					maxNum = input;
				}
				
//				if (evenCount == 0 && oddCount == 0){
//					minNum = input;
//				} else if (input < minNum) {
//					minNum = input;
//				} else {
//					//Do Nothing.
//				}
//				
//				if (evenCount == 0 && oddCount == 0){
//					maxNum = input;
//				} else if (input > maxNum) {
//					maxNum = input;
//				} else {
//					//Do Nothing.
//				}
				
				if ((input % 2) == 0){
					evenCount++;
				} else {
					oddCount++;
				}
			}
					
			System.out.println("\n\nThe maximum number is: " + maxNum);
			System.out.println("The minimum number is: " + minNum);
			System.out.println("The number of even numbers is: " + evenCount);
			System.out.println("The number of odd numbers is: " + oddCount);
			
		} else {
			System.out.println("Well you didn't type any numbers, what do you want me to do?");
		}
		
		scan.close();
	}

}
