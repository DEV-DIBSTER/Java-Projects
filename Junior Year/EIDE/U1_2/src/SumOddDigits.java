import java.util.Scanner;

/**
 * @author salam.1
 * Class: SumOddDigits
 * Assignment: U1-2 Part 4
 * Purpose: The purpose of this program is to sum all the odd digits of a user-provided number.
 * 
 * Test Cases:
 * 
 * CHECKS IF A IT CAN DETECT MULTIPLE ODD NUMBERS FROM THE BEGINNING, THE END, AND IN THE MIDDLE.
 * 1457 - 13
 * 
 * CHECKS IF ALL THE NUMBERS ARE EVEN NUMBERS, AND MAKING SURE THE OUTPUT IS 0.
 * 222 - 0
 * 
 * CHECKS IF THERE IS ONLY 1 NUMBER AND THE FOR LOOP DOESN'T ENDLESSLY CONTINUE, WHILE ALSO OUTPUTTED 0.
 * 0 - 0
 * 
 * CHECKS IF THERE IS ONLY 1 NUMBER AND THE FOR LOOP DOESN'T ENDLESSLY CONTINUE, WHILE ALSO OUTPUTTED 5.
 * 5 - 5
 * 
 * CHECKS IF ALL NUMBERS ARE ODD, AND MAKING SURE NO VALUES ARE LEFT OUTSIDE OF THE LOOP, WHILE ALSO OUTPUTTED 15.
 * 555 - 15
 * 
 * CHECKS IF THE START NUMBER AND END NUMBER ARE EVEN, BUT ONLY THE MIDDLE NUMBER IS ODD, RESULTING IN THE OUTPUT SHOULD BE 5.
 * 22522 - 5
 */
public class SumOddDigits {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in); //Declares scanner object to scan input.
		
		System.out.print("Enter a number to sum the odd digits: ");
		
		int input = scan.nextInt(); //Store the input as String.
		
		//Modulo: isEqualTo()
				
		int count = 0; //Total count of all the odd numbers.
		
		while (input > 0){
			int number = (input % 10); //Stores the number as int.
			
			if ((number % 2) != 0){
				count = count + number;
			}
			
			input = (int) (input / 10);
		}
		
		scan.close();
		
		System.out.println("The sum of the odd digits in your number is: " + count);
	}
}
