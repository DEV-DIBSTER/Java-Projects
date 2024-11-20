import java.util.Arrays;

public class LastClassEx {

	public static void main(String[] args) {
	
		//compare() Method:
		char array1[] = {'a', 'b', 'c', 'd', 'e'};
		//char array2[] = {'f', 'g', 'h', 'i', 'j'};
		char array2[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.println("compare()\n\n");
		
		System.out.println(Arrays.compare(array1, array2));
		
		System.out.println("" 
			+ "\nThe way I would do this method is:\n"
			+ "Check the lengths of the arrays. Simple as checking the properties.\n"
			+ "If 1 is lexicographically less than 2, negative. If 2 is lexicographically less than 1, positive.\n"
			+ "2) Check the values of the array. If the first array has greater lexicographically values than the second one, positive.\n"
			+ "If 2 is lexicographically greater than 1, negative.\n\n"
		);
		
		System.out.println("" 
			+ "Two input parameters are: Two arrays containing characters."
			+ "\nMethod does: Compares the two to see which one is lexicographically greater and output a number that is either negative, zero, or positive."
			+ "\nPositive is 1 is lexicographically greater than 2."
			+ "\nNegative is 2 is lexicographically greater than 1."
			+ "\nZero is lexicographically the same for both.\n\n"
		);
		
		
		System.out.println("-------------------------------\n");
		
		//copyOf() Method:
		
		System.out.println("copyOf()\n\n");
		
		int arrayLength = 10; //Stores the length of the new array.
		
		char copyArray[] = Arrays.copyOf(array1, arrayLength);
		
		System.out.println(Arrays.toString(copyArray));
		
		System.out.println(""
			+ "\nThe way I would do this method is: "
			+ "\nCreate an array with the length given in the second parameter."
			+ "\nThen I would for loop the original array length, with the condition being the end of whichever array is smaller."
			+ "\nEnd the loop when it's done, and the new array is copied over without the build in method."
			+ "\nThe input data is first the array you want to copy from, and the second is the new array length you want to create."
			+ "\nThe methods copies from one array into another new array that you have preset with a size as a parameter."
			+ "\nThe result is a new array object."
		);
		
		
		System.out.println("-------------------------------\n");
		
		//copyOfRange() Method:
		
		System.out.println("copyOfRange()\n\n");

		
		int startIndex = 0; //Starting index of array.
		int endIndex = 2;   //Ending index of array.
		
		char[] copyOfRangeArray = Arrays.copyOfRange(array1, startIndex, endIndex);
		
		System.out.println(Arrays.toString(copyOfRangeArray));
		
		System.out.println(""
				+ "\nThe way I would do this method is: "
				+ "\nCreate an array with the length by calculating it from the last two parameters."
				+ "\nThen I would for loop the length of the array I calculated, with it starting on the start index and ending on the end index."
				+ "\nEnd the loop when it's done, and the new array is created over without the build in method."
				+ "\nThe input data is first the array you want to take from, and the second is the start index where you want to start."
				+ "\nThe last one is the end index where you want to look for."
				+ "\nThe methods copies a certain part of an array given the start index and end index of the array."
				+ "\nThe result is a new array object."
		);
		
		
		
		System.out.println("-------------------------------\n");
		
		//equals() Method:
		
		System.out.println("equals()\n\n");
		
		boolean isSame = Arrays.equals(array1, array2);
		
		System.out.println(isSame);
		
		System.out.println(""
				+ "\nThe way I would do this method is: "
				+ "\nCheck if the arrays have the same length, if so, continue to check each element of each index to see if they match."
				+ "\nIf the index of any element is different, I throw false. If the loops finishes and finds no irregularities, throw true."
				+ "\nReturns a true or false statement."
				+ "\nThe first param is the first array I want to check, the 2nd param is the second index I want to check."
				+ "\nThe method checks the two to see if they are exactly the same and if they are, return a true boolean, if not, a false boolean."
				+ "\nThe result is a boolean."
		);
		
		
		System.out.println("-------------------------------\n");
		
		//fill() Method:
		
		System.out.println("fill()\n\n");
		
		Arrays.fill(array1, 'b');
		
		System.out.println(Arrays.toString(array1));
		
		System.out.println(""
				+ "\n\nFills out every single element within the array with the specified char value in my second parameter."
				+ "\nThe way I would do this would simply for the length of the array and set the index value to the character value."
				+ "\nThe first param is the first array I want the elements to replace."
				+ "\nThe 2nd param is the char value that I want each element within the array to be replaced with."
				+ "\nThe method just replaces every element with the passed on array from the first param into the value passed in the second param."
		);
		
		System.out.println("-------------------------------\n");
		
		//mismatch() Method:
		
		System.out.println("mismatch()\n\n");
		
		int mismatched = Arrays.mismatch(array1, array2);
		
		System.out.println(mismatched);
		
		System.out.println(""
				+ "\n\nLooks through two different arrays, compares indexes, and finds the first index where there is a mismatch."
				+ "\nMy way would be a loop statement through both arrays comparing each element. If different, return the index."
				+ "\nIf the loop ends without a mismatch, return -1."
				+ "\nThe first parameter is the first array I'm looking through."
				+ "\nThe 2nd param is the second array I'm looking through."
				+ "\nThe method just checks each index in both arrays and compares to see if there are any mismatch. If none returns -1, if yes, returns index."
		);
		
	}

}
