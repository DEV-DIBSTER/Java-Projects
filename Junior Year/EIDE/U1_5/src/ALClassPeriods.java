import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author salam.1
 * Class: ALClassPeriods
 * Purpose: The purpose of Part 1 is to get a feel for basic ArrayList activities.
 * 
 * Test Cases:
 * 
 * Remove: 3
 * 1
 * 2
 * 4
 * 5
 * 6
 * 7
 * 
 * Remove: 8
 * 
 * Not possible, doesn't exist.
 * 
 * Remove: 0
 * 
 * Not possible, doesn't exist.
 * 
 * Remove: 7
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 */
public class ALClassPeriods {

	public static void main(String[] args) {
		
		ArrayList <String> myStrings = new ArrayList <String> (); //Declares the array list as a variable.

		myStrings.add("CS1");
		myStrings.add("CS2");
		myStrings.add("Gov");
		myStrings.add("Physics");
		myStrings.add("Calculus");
		myStrings.add("English");
		myStrings.add("CompSci");
		myStrings.add("CompSci2");
		myStrings.add("CompSci3");
		myStrings.add("CompSci4");
		
		System.out.println("Size of my array: " + myStrings.size());
		
		System.out.println("\nContents of my array is: \n");
		
		System.out.println(myStrings);
		
		//Update the elements.
		for (int i = 0; i < myStrings.size(); i++){
			myStrings.set(i, "Period " + (i + 1) + ": " + myStrings.get(i));
		}
		
		System.out.println("\nContents of my updated list using regular FOR loop: \n");
		
		for (int i = 0; i < myStrings.size(); i++){
			System.out.println(myStrings.get(i));
		}
		
		Scanner scan = new Scanner(System.in); //The scanner object.
		
		System.out.print("\nWhich class do you want to remove (choose with period number): ");
		
		int period = scan.nextInt(); //The period stored as int.
		
		boolean isFound = false; //Stores the is found as true or false.
		
		int digitLength = String.valueOf(period).length();
						
		for (int i = 0; i < myStrings.size(); i++){
			
			//System.out.println(String.valueOf(period) + " | " + myStrings.get(i).substring(7, 8));
						
			if(myStrings.get(i).substring(7, (7 + digitLength)).equals(String.valueOf(period))){
				//System.out.println("Found! " + myStrings.get(i));
				
				myStrings.remove(i);
				isFound = true;
			}
		}
		
		if (isFound){
			System.out.println("\nYour revised schedule (using a enhanced FOR loop): ");
			
			
			for (String name : myStrings){
				System.out.println(name);
			}
			
		} else {
			System.out.println("No changes to your schedule ‐ that class period doesn't exist!");
		}
	}

}
