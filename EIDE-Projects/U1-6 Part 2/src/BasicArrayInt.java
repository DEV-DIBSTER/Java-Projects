import java.util.Scanner;

import java.util.Arrays;

import java.io.File;

import java.io.FileNotFoundException;

public class BasicArrayInt {

	/**
	 * Assignment: U1-6 Part 2
	 * Class Name: BasicArrayInt
	 * Purpose: Using Arrays
	 * @author: salam.1
	 * 
	 * Test Cases: 
	 * Input: "input.txt" which has 1,2,3,4,5,6,7,8
	 * Output: 1 2 3 4 5 6 7 8
	 * Input: "input.txt" which has 1,2,3,4,5,6,7,8,9,10
	 * Output: 1 2 3 4 5 6 7 8
	 * Input: "input.txt" which has 1,2,3,4,5,6
	 * Output: 1 2 3 4 5 6 0 0
	 */

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = new File ("input.txt"); //Setting up the file object

		Scanner scan = new Scanner(inputFile); //Setting up scan
	
		int myNum; //The Number Read From the input.txt

		int[] myInts = new int[8]; //The Array That Holds 8 int.s

		
		int i = 0; //loop counter

		while (scan.hasNextInt() && i < myInts.length) {

			myNum = scan.nextInt();

			myInts[i] = myNum;

			i++;

		}

		System.out.println("The contents of the array using the Arrays.toString() method is: " + Arrays.toString(myInts));

		scan.close();

		int j = 0; //loop counter

		String result = ""; //The Result From The Loop
	

		while(j < myInts.length){
			result += myInts[j] + " ";

			j++;
		}

		System.out.println("The contents of the array using a loop is: " + result);

		scan.close();
	}
}