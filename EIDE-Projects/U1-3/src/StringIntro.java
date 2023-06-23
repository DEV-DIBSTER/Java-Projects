/* import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = "There's a lot to learn with Java programming!"; //The variable that stores the string. 
		
		System.out.println("Our string is: " + str + "\n");
		
		System.out.println("The length of our string is: " + str.length()  + " characters!\n");
		
		int firstChar = str.indexOf("r"); //Finds the index of the first r.
		char firstIndex = str.charAt(firstChar); //Finds the character at said index.
		
		String subString = str.substring(firstChar, firstChar + 1); //Splits the substring into a new one. 
		
		System.out.println("My letter using charAt() is: " + firstIndex);
		System.out.println("My letter using substring() is: " + subString + "\n");
		
		int indexOfWord = str.indexOf("gram"); //The index of "gram" in the original string.
		
		System.out.println("The phrase \"gram\" is in our string us found at index: " + indexOfWord + "\n");
		
		String day1 = "Friday";
		String day2 = "friday";
		
		boolean isSameDay = day1.equals(day2); //Checks if the two are the same.
		
		System.out.println("The strings \"" + day1 + "\" and \"" + day2 + "\" are equivalent: " + isSameDay + "\n");
		
		System.out.print("Please type a decimal number: ");
		
		String userInputDouble = scanner.nextDouble().toString(); //The decimal number input as double.
		
		System.out.println("My decimal number is " + userInputDouble + " and my string is " + str);
		
		scanner.nextLine();
		
		System.out.println("My string is an");
		
	}

} */

/**
 * Assignment Name (eg U1-3 P1)
 * Class/File name (eg StringIntro)
 * Purpose: The objective of this assignment is to get familiar with manipulating strings in Java.
 * @author: salam.1
 * Test Cases:   
 * I used 1.23 for the decimal test case, this was so I can check if the decimal was actually being stored properly as a double. 
 * I can also check this against itself in the string to make sure both line up.
 *
 * I used 4 to test out my integer as it was a simple number to check and compare through for my string and integer variables.
 *
*/ 


import java.util.Scanner;

public class StringIntro {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in); //Allows us the start scanning the console for input.
        
      String str = "There’s a lot to learn with Java programming!"; //This is our String variable.
      
      System.out.println("Our string is: " + str + "\n");
      
      System.out.println("The length of our string is: " + str.length() + "\n");
      
      char firstChar = str.charAt(3); //Gets the character at the given index.
      String firstChar2 = str.substring(3, 4); //Gets the String between the given index.
      
      int firstIndexOf = str.indexOf("gram");  //Finds the starting index of the phrase in the string.
    
      String day1 = "Friday"; //My first day variable as string.
      String day2 = "friday"; //My second day variable as string.
      
      boolean isEqualStrings = day1.equals(day2); //This variable stores the result of the two strings, if that match.
     
      System.out.println("My letter using charAt() is: " + firstChar);
      System.out.println("My letter using substring() is: " + firstChar2);
      System.out.println("The phrase \"gram\" in our string is found at index: " + firstIndexOf + "\n");
      System.out.println("The strings \"" + day1 + "\" and \"" + day2 + "\" are equivalent: " + isEqualStrings + "\n");
      
      System.out.print("Type a decimal number: ");
      double inputDouble = scanner.nextDouble(); //Stores the user input as double.
      scanner.nextLine();
      String inputString = Double.toString(inputDouble); //Converts my double to a string.
      
      System.out.println("My decimal number is " + inputDouble + " and my string is " + inputString + "\n");
      
      System.out.print("Type a integer number: ");
      String inputIntegerStr = scanner.nextLine(); //The input integer, but stored as string.
      int inputInteger = Integer.parseInt(inputIntegerStr); //Converting the string variable back to integer.
      
      System.out.println("My string is " + inputIntegerStr + " and my integer is " + inputInteger + "\n");
      
      String str2 = "Peter Piper picked a peck of pickled peppers from Mrs. Pott’s Petunia Parlor"; //My second string statement.
      String str2Updated = str2.toLowerCase(); //Replacing all usercase in top phrase to lowercase and stored as string.
      String str2Final = str2Updated.replace("p", "z"); //Replacing all p's with z's from the phrase above and stored as string.
      
      System.out.println("My original string was: " + str2);
      System.out.println("My updated string is: " + str2Updated);
      System.out.println("My final string is: " + str2Final);
    }
}