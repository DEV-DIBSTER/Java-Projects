import java.util.Scanner;
public class PersonInfoMore {
	public static void main (String[] args) {

		//Exception in thread "main" java.util.InputMismatchException is the error when a String was entered when it was supposed to be a integer.
		//Exception in thread "main" java.util.InputMismatchException is the error when a double (decimal) was entered when it was supposed to be a integer.
		//No, because you grade level is absolute, nobody says 10.35 grade, they say an absolute grade level of 10. Same thing for age, you say your year, not year plus decimals.

		//I used a scan.nextLine(); To finish scanning this line, and will get the NewLine, which would be my favorite teacher. When I used NextInt, as soon as it found the next Integer Token, it doesn't scan through the entire line, leaving a white space because it is a delimiter. Using the scan.nextLine() will finish scanning the rest of the line and go past the remaining white space. Without this, the response would yields "" as it's still on the current line with the whitespace, as it's only looked for a input token, which would be the age. The delimiter in this case would be the empty string/white space on the string. scan.nextLine() will not stop for any delimiters whatsoever until the line stops. This is what I can use to solve the whitespace encountered.

		Scanner scan = new Scanner (System.in);

		System.out.print("Please type your first name and last name: ");

		String fullName = scan.nextLine(); //The user first and last name input.

		System.out.print("Plase type your favorite course this year: ");

		String favoriteCourse = scan.nextLine(); //The user favorite course input.

		System.out.print("Please type your grade level as a number: ");
	
		int gradeLevel = scan.nextInt(); //The user grade level input.

		System.out.print("Please type your birth year for educational purposes: ");

		int birthYear = scan.nextInt(); //The user birthyear from input.
		
		String filler = scan.nextLine(); //Trying to filter out to the next line.

		int age = 2023 - birthYear; //The calculated age from this year.

		System.out.print("Who is your favorite teacher: ");

		String favoriteTeacher = scan.nextLine(); //The favorite teacher from input.
		

		System.out.println("Hi " + fullName + "! You were born in year " + birthYear + " and you will be " + age + " years old this year!\n" + "Your favorite course is " + favoriteCourse  + " and you are in " + gradeLevel + "th grade!\n Your favorite teacher of all time is " + favoriteTeacher + "!");						
	}
}