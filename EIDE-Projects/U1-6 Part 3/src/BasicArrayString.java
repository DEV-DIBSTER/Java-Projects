import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BasicArrayString {
/**
	* U1-6 Part 3
	* BasicArrayString
	* Purpose: 1: Using Arrays
	* @author: salam.1
	* Test Cases:  
	* "3", "Chemistry", "Physics", "CS"
	* got Your class listing is: [Chemistry, Physics, CS]
	  Your class listing is: Chemistry Physics CS
	  Is your favorite class Physics? (y/n) y
	  It took 12 guesses to guess your favorite class!
	*/
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); //Setting Up The Scanner
		Random rand = new Random(); //Setting up the random object
		
		System.out.print("How many classes are you taking this semester: ");
		
		int numOfsubs = scan.nextInt(); //the number of semesters
		
		String[] subjects = new String[numOfsubs]; //Subject is input from the user.
		scan.nextLine();
		
		int i = 1; //The Loop Counter
		
		while(i <= numOfsubs){
			System.out.print("Enter the title for class " + i + ": ");
			subjects[i-1] = scan.nextLine();
			i++;
		}
		System.out.println("\nYour class listing is: " + Arrays.toString(subjects));
		
		int counter = 0; //The loop counter stored as a integer.
		String result = ""; //The result stored as a string.
		
		while(counter < subjects.length){
			result += subjects[counter] + " ";
			counter++;
		}
		
		System.out.println("\nYour class listing is: " + result);
		
		int c = 0; //The loop counter
		boolean done = false; //an boolean to stop the below while loop.
		
		while(!done){
			System.out.print("\nIs your favorite class " + subjects[rand.nextInt((subjects.length - 0) + 0)] + "? (y/n): ");
			String ans = scan.nextLine();
			
			if(ans.equals("y")){
				c++;
				done = true;
			} else { 
				c++;
			}
		}
		
		scan.close();
		
		System.out.println("It took " + c + " guesses to guess your favorite class!");
	}
}
