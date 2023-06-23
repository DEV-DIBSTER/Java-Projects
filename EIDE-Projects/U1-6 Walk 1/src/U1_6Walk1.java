import java.util.Arrays;

public class U1_6Walk1 {

	public static void main(String[] args) {
		int[] myNums = new int[3];
		myNums[0] = 25;
		myNums[1] = 30;
		myNums[2] = 35;
		
		System.out.println(myNums[0]);
		
		
		String[] breakfast = {"Bacon", "Eggs", "Waffles", "Muffins", "Coffee"}; //Actual array of items.
		int length = breakfast.length; //Length of array as int.
		
		//System.out.println(breakfast[4]);
		
		System.out.println(Arrays.toString(breakfast));
		System.out.println("Length: " + length);
	}

}
