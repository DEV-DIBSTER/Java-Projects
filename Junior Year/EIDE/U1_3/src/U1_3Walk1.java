import java.util.Scanner;
import java.util.Arrays;

public class U1_3Walk1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in); //Declares the new scanner object.
		
		System.out.print("Type 5 integer numbers: ");
		
		int[] items = new int[5]; //Stores user input in int array.
				
		int whileCounter = 0; //The counter for the while loop.
		
		//Populate the array.
		for (int i = 0; i < items.length; i++){
			int value = scan.nextInt();
			
			items[i] = value;	
		}
		
		System.out.println("\n\nWHILE LOOP BELOW: ");
		while (whileCounter < items.length){
			System.out.print(items[whileCounter] + " ");
			
			whileCounter++;
		};
		
		System.out.println("\n\nFOR LOOP BELOW: ");
		for (int i = 0; i < items.length; i++){		
			System.out.print(items[i] + " ");
		}
		
		//Activity 2:
		
		
		String[] strat2Array = {"Adib", "Henry", "Jack", "Yuvraj" }; //Stores the new int array.
		
		System.out.println("\n\nStrategy 2:");
		System.out.println(Arrays.toString(strat2Array));
		System.out.println(strat2Array);
		
		//Activity 3:		
		
		System.out.println("\n\nStrategy 3:");
		
		for (String element : strat2Array) {
			System.out.print(element + " ");
		}
		
		System.out.println("\n");
				
		for (int element : items) {
			System.out.print(element + " ");
		}
		
		
		scan.close();
	}

}
