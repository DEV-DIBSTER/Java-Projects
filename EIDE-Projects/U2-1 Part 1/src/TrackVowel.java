import java.util.Scanner;
import java.util.Arrays;

public class TrackVowel {
	/**
	 * 
	 * Assignment: U2-1 Part 1
	 * Class Name: TrackVowels
	 * Purpose: Using Methods.
	 * @author: salam.1
	 * 
	 * Test Cases:
	 * 
	 * Please type out a phrase lowercase: adib
	 * [1, 0, 1, 0, 0]
	 * 
     * Please type out a phrase lowercase: railcar
	 * [2, 0, 1, 0, 0]
	 * 
	 * Please type out a phrase lowercase: failure
	 * [1, 1, 1, 0, 1]
	 */
	private static int[] countVowel(String str) {
		int[] vowels = new int[5];
		
		for (int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'a'){
				vowels[0]++;
			} else if (str.charAt(i) == 'e') {
				vowels[1]++;
			} else if (str.charAt(i) == 'i') {
				vowels[2]++;
			} else if (str.charAt(i) == 'o') {
				vowels[3]++;
			} else if (str.charAt(i) == 'u') {
				vowels[4]++;
			} else {
				//A character that is not one of the vowels.
				//The action is do nothing.
			}
		}
		
		return vowels;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Setting up the Scanner object.
		
		System.out.print("Please type out a phrase lowercase: ");
		
		String input = scan.nextLine(); //Stores the input string as string.
		
		String result = Arrays.toString(countVowel(input)); //Stores result from method as string.
		
		System.out.println(result); //Prints out result.
		
		scan.close();
		
	}

}
