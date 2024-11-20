import java.util.Scanner;

/**
 * Assignment: U2-1 Part 3
 * Class: CalcScores
 * @author salam.1
 * Purpose: The purpose of Part 3 is to read a set of quiz scores into an array and then computer the average after dropping the lowest score.
 * 
 * Test Cases:
 * 
 * 3
 * 5 10 15
 * 12.5
 * 
 * 2
 * 3 3
 * 3
 * 
 * 7
 * 1 1 5 5 3 3 3
 * 3.33
 * 
 * 5
 * 5 5 5 5 4
 * 5.0
 * 
 */
public class CalcScores {
	
	/**
	 * This starts a scanner. Scans the count. Stores the test scores, and returns them.
	 * @return int[] the scores that we collected.
	 */
	private static int[] acceptVals(){
		Scanner scan = new Scanner(System.in); //Declare scanner object.
		
		System.out.print("Enter the number of test scores to be entered: ");
		
		int testCount = scan.nextInt(); //Stores the int value from the user input.
		
		scan.nextLine();
		
		System.out.print("Enter each test scores separated by a space: ");
		
		int[] tests = new int[testCount]; //The tests stored as an array.
		
		for (int i = 0; i < testCount; i++){
			tests[i] = scan.nextInt();
		}
		
		scan.close();
		
		return tests; //Returns the test scores.
	}
	
	/**
	 * Returns the lowest number value's index within an array.
	 * @param scores - the int[] scores that we got before
	 * @return int - the lowest number value's index
	 */
	private static int findIndex(int[] scores){
		
		int returnVal = -1; //Stores index.
		
		int lowestNum = Integer.MAX_VALUE; //Stores the lowest number.
		
		for (int i = 0; i < scores.length; i++){
			if (scores[i] < lowestNum){
				lowestNum = scores[i];
				returnVal = i;
			}
		}
		
		return returnVal;
	}
	
	/**
	 * Takes an array, and calculates the average while avoiding where an index is specified and ignored.
	 * @param scores - The test scores that we got before.
	 * @param omitIndex - The index with the lowest value is omitted.
	 * @return double - the average of the numbers as a double.
	 */
	private static double findAvg(int[] scores, int omitIndex){
		
		double returnVal; //Stores the return value until we return.
		double count = scores.length - 1; //Divided by the amount of scores we will use.
		double totalVal = 0; //Adds the total scores together.
		
		for (int i = 0; i < scores.length; i++){
			if (i != omitIndex) {
				totalVal = totalVal + scores[i];
			}
		}
		
		returnVal = totalVal / count;
		
		return returnVal; //Returns the double value.
	}
	
	public static void main(String[] args) {
		
		int[] tests = acceptVals(); //Invokes this method.
		
		int findIndex = findIndex(tests); //Stores the result from the methods.
		
		double average = findAvg(tests, findIndex); //Gets the result of the average score.
		
		System.out.println("The average of your score (dropping the lowest score): " + average);
	}

}
