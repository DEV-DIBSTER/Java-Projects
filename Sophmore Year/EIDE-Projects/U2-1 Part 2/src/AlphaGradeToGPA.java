import java.util.Scanner;
import java.util.Arrays;

public class AlphaGradeToGPA {
	/**
	 * 
	 * Assignment: U2-1 Part 2
	 * Class Name: AlphaGradeToGPA
	 * Purpose: Using Methods.
	 * @author: salam.1
	 * 
	 * Test Cases:
	 * 
	 * Please type out a letter grade: A-
	 * Your final GPA is: 3.7
	 * 
	 * Please type out a letter grade: F+
	 * Your final GPA is: 0.0
	 * 
	 * Please type out a letter grade: B-
	 * Your final GPA is: 2.7
	 * 
	 * Please type out a letter grade: A+
	 * Your final GPA is: 4.0
	 * 
	 * Please type out a letter grade: F
	 * Your final GPA is: 0.0
	 */
	private static String[] extractParts(String input) {
		String[] split = new String[2];
		
		split[0] = input.substring(0, 1); //This would be the letter.
		
		if(input.length() == 2) {
			split[1] = input.substring(1, 2); //This would be the - or + if given.
		}		
		
		return split;
	}
	
	private static double findBaseGPA(String letter) {
		double baseGPA = 0.0; //Stores baseGPA as double.
		
		if (letter.equals("A")){
			baseGPA = 4.0;
		} else if (letter.equals("B")){
			baseGPA = 3.0;
		} else if (letter.equals("C")){
			baseGPA = 2.0;
		} else if (letter.equals("D")){
			baseGPA = 1.0;
		} else {
			baseGPA = 0.0;
		};
		
		return baseGPA;
	}
	
	private static double findFinalGPA (double baseGPA, String[] gradeParts) {
		double finalGPA = baseGPA; //Stores finalGPA as double.
		
		String mod = gradeParts[1];
		
		//If the letter grade is not an F, and the modifier is present.
		if (baseGPA != 0.0 && mod != null){
			
			//If my letter grade has a plus, but makes sure it's not an A. Since A and A+ is the same.
			if (mod.equals("+") && baseGPA != 4.0){
				finalGPA = finalGPA + 0.3;
				
			} else if (mod.equals("-")) {
				
				finalGPA = finalGPA - 0.3;
				
			} else {
				//The modifier is null aka nothing.
				//This means that the modifier is null, and no change is made to the grade.
			}
			
		} else {
			//The modifier is null aka nothing.
			//This means that the modifier is null, and no change is made to the grade.
		}
		
		return finalGPA;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Setting up the Scanner object.
		
		System.out.print("Please type out a letter grade: ");
		
		String userIn = scan.nextLine(); //The input as variable string.
		
		String[] extractedParts = extractParts(userIn); //Stores the extracted array as string array.
		
		double baseGPA = findBaseGPA(extractedParts[0]); //Stores baseGPA as double.
		
		//System.out.println("Your base GPA is: " + baseGPA);
		
		double finalGPA = findFinalGPA(baseGPA, extractedParts); //Stores finalGPA as double.
		
		System.out.println("Your final GPA is: " + finalGPA);
		
		scan.close();
	}

}
