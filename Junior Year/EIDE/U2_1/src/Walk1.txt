
public class Walk1 {

	/**
	 * Finds the smallest number given 3.
	 * @param var1 - int first number to use
	 * @param var2 - int second number to use
	 * @param var3 - int third number to use
	 * @return - Returns the smallest number out of 3 members.
	 */
	private static int findSmallest(int var1, int var2, int var3){
		
		int smallestNum = var1; //Setting the lowest value possible.
				
		if (smallestNum > var2){
			smallestNum = var2;
		}
		
		if (smallestNum > var3){
			smallestNum = var3;
		}
		
		return smallestNum;
	}
	
	public static void main(String[] args) {

		int num1 = 4; //Stores the first num.
		int num2 = -16; //Stores the second num.
		int num3 = 3; //Stores the third num.
		
		System.out.println(findSmallest(num1, num2, num3));
	}
}
