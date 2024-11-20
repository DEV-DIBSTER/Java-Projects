import java.util.Arrays;
import java.util.ArrayList;

public class Shift {
	
	private static void shiftLeft (ArrayList <Integer> myList) {
		int val = myList.get(0);
		
		myList.add(val);
		
		myList.remove(0);
	}
	
	private static boolean evenlyDivide (int val1, int val2) {
		boolean returnVal; //The return value for this.
		
		if (val1 == 0 || val2 == 0){
			returnVal = false;
		} else {
			if (val1 % val2 == 0){
				returnVal = true;
			} else if (val2 % val1 == 0) {
				returnVal = true;
			} else {
				returnVal = false;
			}
		}
		
		return returnVal;
	}
	
	public static void main (String[] args){
		ArrayList <Integer> values = new ArrayList <Integer> ();
		
		int[] nums = new int[] {1, 2, 3, 4};
		
		for (int i = 0; i < nums.length; i++){
			values.add(nums[i]);
		}
		
		shiftLeft(values);
		
		System.out.println(values);
		
		System.out.println(evenlyDivide(5, 5));
	}
}
