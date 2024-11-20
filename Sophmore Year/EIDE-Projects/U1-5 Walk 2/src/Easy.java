import java.util.Scanner;

public class Easy {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); //Set up to read input.
		
		System.out.print("What is your favorite is color: ");
		
		String favColor = scan.nextLine(); //The user input for favorite color.
		
		System.out.print("What is your favorite number: ");
		
		int favNumber = scan.nextInt(); //The user input for favorite number.
		
		System.out.println("Hey user, your favorite color is " + favColor + " and your favorite number is " + favNumber + "!");
	}

}
