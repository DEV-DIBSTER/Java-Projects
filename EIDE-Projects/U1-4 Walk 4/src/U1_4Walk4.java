import java.util.Scanner;

public class U1_4Walk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.println("=============================");
		System.out.print("Please type the character: ");
		
		String inputChar = scanner.nextLine(); //The input user character.
		String colorMask; //The color of the mask.
		
		if(inputChar.equals("Leonardo")) {
			colorMask = "blue";
		} else if (inputChar.equals("Raphaell")) {
			colorMask = "red";
		} else if (inputChar.equals("Donatello")) {
			colorMask = "purple";
		} else {
			colorMask = "orange";
		}
		
		System.out.println("You wear a " + colorMask + " mask.");
	}

}
