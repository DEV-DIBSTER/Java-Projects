import java.text.DecimalFormat;
import java.util.Scanner;

public class U1_2FormatSpecifiers {
	
	public static void main(String[] args) {
		int myInt = 5; // an integer for the example
		double myD = 42.8925; // a double for the example
		String myStr = "Hello!"; // a string for the example

		System.out.printf("My string is, %s My int is %d and my double is %f or it could be %.4f.\n\n", myStr, myInt, myD, myD);
		
		Scanner scan = new Scanner(System.in); //Declares the scanner object.
		
		System.out.print("Please type a decimal value: ");
		
		double userInput = scan.nextDouble(); //Stores user intput as double.
		
		scan.close();
		
		String pattern = "0.00"; // display pattern to use
		
		DecimalFormat dfmt = new DecimalFormat (pattern);
		
		System.out.println("Your output is: " + dfmt.format(userInput));
	}
}
