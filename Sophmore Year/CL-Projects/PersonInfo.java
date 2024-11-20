import java.util.Scanner;
public class PersonInfo {
	public static void main (String[] args) {

		//Exception in thread "main" java.util.InputMismatchException is the error when a String was entered when it was supposed to be a integer.
		//Exception in thread "main" java.util.InputMismatchException is the error when a double (decimal) was entered when it was supposed to be a integer.
		//No, because you grade level is absolute, nobody says 10.35 grade, they say an absolute grade level of 10. Same thing for age, you say your year, not year plus decimals.


		Scanner scan = new Scanner (System.in);

		System.out.print("Please type your first name and last name: ");

		String fullName = scan.nextLine(); //The user first and last name input.

		System.out.print("Plase type your favorite course this year: ");

		String favoriteCourse = scan.nextLine(); //The user favorite course input.

		System.out.print("Please type your grade level as a number: ");
	
		int gradeLevel = scan.nextInt(); //The user grade level input.

		System.out.print("Please type your birth year for educational purposes: ");

		int birthYear = scan.nextInt(); //The user birthyear from input.

		int age = 2023 - birthYear; //The calculated age from this year.

		System.out.println("Hi " + fullName + "! You were born in year " + birthYear + " and you will be " + age + " years old this year!\n" + "Your favorite course is " + favoriteCourse  + " and you are in " + gradeLevel + "th grade!");						
	}
}