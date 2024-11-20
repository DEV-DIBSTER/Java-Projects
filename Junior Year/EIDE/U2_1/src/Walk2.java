import java.util.Arrays;

public class Walk2 {
	
	/**
	 * Find random number in range.
	 * @param length - The length of the array which we pass.
	 * @return int - Returns the an int index of the the number in specified range.
	 */
	private static int findRandomNum(int length){
		
		int returnVal; //The value to return to integer.
		
		returnVal = (int) (Math.random() * length);
		
		return returnVal;
	}
	
	/**
	 * 
	 * @param index - int value of the index of the array
	 * @param array - int[] to actually get the value of the element
	 * @return boolean
	 */
	private static boolean getIndexValue(int index, int[] array){
		
		boolean isDivisible = false; //Return value.
		boolean isEven = false; //Return value.
		int indexValue = array[index]; //The index value of array.
		
		//If it's even.
		if (indexValue % 2 == 0){
			isEven = true;
		};
		
		//If it's divisible by 6.
		if (indexValue % 6 == 0){
			isDivisible = true;
		};
		
		return (!isDivisible && isEven);
	}
	
	public static void main(String[] args) {

		int[] array = new int[6]; //The array to store values.
				
		array[0] = 1;
		array[1] = 2;
		array[2] = 12;
		array[3] = 4;
		array[4] = -3;
		array[5] = 5;
		
		int randomIndex = findRandomNum(array.length); //Determine the random integer number.
		
		System.out.println("Contents of the Array: " + Arrays.toString(array));
		System.out.println("The random index was determined to be: " + randomIndex + " (" + array[randomIndex] + ")");
		
		System.out.println("Result: " + getIndexValue(randomIndex, array));
		
		
	}
}
