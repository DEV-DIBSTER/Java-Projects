import java.util.Scanner;

/**
 * @author salam.1
 * Class: GuessNumber
 * Assignment: U1-2 Part 2
 * Purpose: The objective of this assignment is primarily to get familiar with using loops in Java, as well as to get
 * familiar with using the increment operator, the compound assignment operator, and a bit of number formatting.
 * 
 * Test Cases:
 * 
 * 
 * THIS TEST CASE IS TO GUESS A HIGH NUMBER OF ATTEMPTS, GETTING IT RIGHT, AND MAKING SURE ATTEMPTS ARE CORRECT.
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 9
 * You guessed too high! Try again.
 * 
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 2
 * You guessed too low! Try again.
 * 
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 1
 * You guessed too low! Try again.
 * 
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 5
 * You guessed too low! Try again.
 * 
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 7
 * You guessed too low! Try again.
 * 
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 8
 * You got it right! It was: 8! It took you 6 attempts.
 * 
 * -------------------------------------------------------
 * 
 * CHECKS IF THE USER CAN GUESS THE NUMBER ON THE FIRST ATTEMPT, AND THE ATTEMPT COUNTER IS CORRECT, AND DOESN'T DISPLAY 0.
 * 
 * Hint: The secret number is: 19
 * Enter a guess (-1 to quit): 19
 * You got it right! It was: 19! It took you 1 attempts.
 * 
 * -------------------------------------------------------
 * 
 * CHECKS IF THE USER QUITS RIGHT AWAY AND MAKE SURE THE FOR LOOP IS STOPPED.
 * 
 * Hint: The secret number is: 24
 * Enter a guess (-1 to quit): -1
 * Game over.
 * 
 * -------------------------------------------------------
 * 
 * CHECKS IF THE USER ATTEMPTS TO GUESS, BUT THEN DECIDES TO QUIT, AND MAKE SURE LOOPS ENDS WITHOUT ANY ERRORS.
 * 
 * Hint: The secret number is: 6
 * Enter a guess (-1 to quit): 3
 * You guessed too low! Try again.
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): 7
 * You guessed too low! Try again.
 * 
 * Hint: The secret number is: 8
 * Enter a guess (-1 to quit): -1
 * Game over.
 */
public class GuessNumber {

	public static void main(String[] args) {
		
		final int RANDOM = (int) ((Math.random() * 50) + 1); //Sets the number as integer.
		
		boolean isFound = false; //If the item is found, used for loop.
		boolean isQuit = false; //If user quits, used for loop.
		int counter = 0; //Counts the number of guesses.
		
		Scanner scan = new Scanner(System.in); //Declares new scanner class.
		
		while (isFound == false && isQuit == false){
			System.out.println("Hint: The secret number is: " + RANDOM);
			System.out.print("Enter a guess (-1 to quit): ");
			
			int guess = scan.nextInt(); //The user's guess.
			
			scan.nextLine();
			
			counter++;
			
			if(guess == RANDOM){				
				System.out.println("You got it right! It was: " + guess + "! It took you " + counter + " attempt(s).");
				
				isFound = true;
				
			} else if (guess == -1) {
				System.out.println("Game over.");
				
				isQuit = true;
				
			} else if (guess > RANDOM) {
				System.out.println("You guessed too high! Try again.\n\n");
				
			} else {
				System.out.println("You guessed too low! Try again.\n\n");
			}		
		}
		
		scan.close();
	}

}
