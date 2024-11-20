import java.util.ArrayList;

/*
 * @author salam.1
 * Class: Walk1
 * Purpose: Learning about ArrayList
 */
public class Walk1 {

	public static void main(String[] args) {
		
		ArrayList <Integer> myNums = new ArrayList <Integer> (); //Declares the array list as a variable.
		
		myNums.add(30);
		myNums.add(35);
		myNums.add(40);
		myNums.add(45);
		myNums.add(50);
		
		System.out.println("Size of ArrayList (myNums): " + myNums.size() + "\n");
		
		for (int i = 0; i < myNums.size(); i++){
			System.out.println("Element in index " + i + " is: " + myNums.get(i));
		}
		
		System.out.println("\nList content printed out:\n" + myNums);
		
		myNums.add(2, 37); //Adds 37 between 35 and 40.
		
		myNums.remove(4); //Removes 30.
		
		
		System.out.println("\nArraylist content displayed by enhanced FOR Loop:\n");
		
		int index = 0; //The index of it.
		
		for (int nums : myNums){
			System.out.println("Element at index " + index + " is: " + nums);
			index++;
		}
	}

}
