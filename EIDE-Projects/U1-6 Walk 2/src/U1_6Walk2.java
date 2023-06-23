import java.util.Arrays;

public class U1_6Walk2 {

	public static void main(String[] args) {
		int[] myVals = { 10, 20, 30, 40, 50 }; //Stores the items of array.
		
		System.out.println("-------------------------------");
		
		//For Loop.
		for (int i = 0; i <= (myVals.length - 1); i++){
			System.out.println(myVals[i]);
		}
		
		//Stores the index counter.
		int counter = 0;
		
		System.out.println("-------------------------------");
		
		//Checks if the counter matches the length.
		while (counter < myVals.length) {
			System.out.println(myVals[counter]);
		
			counter++;
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(Arrays.toString(myVals));
	}

}
