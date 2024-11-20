import java.util.Scanner;

public class APIBasic {
	/*
	 * U1-2
	 * Class Name: APIBasic
	 * Purpose: Showcasing skills in understanding Java's API packages.
	 * @author: salam.1
	 * Testcases: 
	 * 
	 * 2 3 for int, and 5.8 4.2, and I tested out the expected output.
	 * I had to change some variables from double to integer as I had unneeded characters in my rounded numbers.
	 * This showed the use case of my switch case.
	 * Repeating these test cases showed numerous instances where such unneeded characters were shown.
	 * 
	 * Running with 3 4 for int, and 7.8 and 4.3 and tested it as expected.
	 * As I changed the totalInteger to a int instead of double, it resulted the average to be incorrect.
	 * This allowed me to discover and fix the error with my dividing.
	 * 
	 * I used 4.3 and 7.8 to test out the rounded decimal answer. As it  would result in hopefully a 0, which was the case.
	 * Helped me understand the specific switch case.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); //Set up to read input.
		
		System.out.print("Please type your two Integers: ");
			
		int integerOne = scan.nextInt(); //The user input for first integer.
		int integerTwo = scan.nextInt(); //The user input for second integer.
		
		scan.nextLine(); //Gets rid of the unwanted delimiter.
		
		System.out.print("Please type your two Decimal Numbers: ");
		
		double doubleOne = scan.nextDouble(); //The user input for the first double/decimal.
		double doubleTwo = scan.nextDouble(); //The user input for the second double/decimal.
		
		int maxInteger = Math.max(integerOne, integerTwo); //Finds the biggest integer out of the two.
		int totalInteger = integerOne + integerTwo; //Gets the total of the two integers for the average.
		double averageInteger = (double) (totalInteger) / 2.0; //Gets the average of the two integers.
		float averageInteger2 = (float) ((totalInteger) / 2.0); //Gets the average of the two integers. But stores it as a float. Also known as implicit casting.
		
		int roundedInteger = Math.round(averageInteger2); //The rounded integer.
		long roundedNumber = Math.round(averageInteger); //The rounded integer with the float type. Implicit casting.
		double integerSquared = Math.pow(integerOne, 2); //The first integer to the second power. 
		
		int finalDividedDecimal = (int) (doubleOne / doubleTwo); //Gets the divided value of the doubles.
		double areaOfCircle = Math.PI * Math.pow(doubleTwo, 2); //Gets the area of the circle with the given area.
		
		System.out.println("\nThe max integer is: " + maxInteger + "\n");
		System.out.println("The average of your integers is: " + averageInteger);
		
		//Still need to finish this.
		System.out.println("The average of your integers is: " + averageInteger2 + "\n");
		
		System.out.println("The average rounded to the nearest whole number is: " + roundedInteger);
		System.out.println("The average rounded to the nearest whole number is: " + roundedNumber + "\n");
		
		System.out.println("The first integer raised to the second power is: " + integerSquared + "\n");
		
		System.out.println("The integer result of dividing the first decimal by the second decimal is: " + finalDividedDecimal + "\n");
		
		System.out.println("The area using " + integerOne + " as the radius is: " + areaOfCircle + "\n");
	}
}
