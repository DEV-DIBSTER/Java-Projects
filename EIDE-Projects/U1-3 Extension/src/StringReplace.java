/**
 * Assignment Name (eg U1-3 Extension)
 * Class/File name (eg StringReplace)
 * Purpose: The purpose of this extension is to try your hand at manual string replacement. – the overall goal is to find a substring
within a bigger string and then replacing that substring with something else.
 * @author: salam.1
 * Test Cases:   
 * I used "I am the coolest kid on the block" as my string stored as one.
 * With this I used the substring "est" which resulted in it removed from the string.
 * I tested this as I knew what the string before and after comes in the string, which I can type out quickly.
 *
 */ 

import java.util.Scanner;

public class StringReplace {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.
      
      System.out.print("Enter in your string: ");
      String userInput = scanner.nextLine(); //Stores the inputted string as a string.
      
      System.out.println("You entered: " + userInput);
      
      System.out.print("Now enter a substring that can be found within the original string: ");
      String userInputSubString = scanner.nextLine(); //Stores the inputted substring as a string.
      
      System.out.println(userInputSubString);
      
      int subStringIndex = userInput.indexOf(userInputSubString); //Finds the starting index of the substring from the main string as a int.
      
      System.out.println("The starting position of your substring within the original string is at index: " + subStringIndex);
      
      String stringBeforeSubString = userInput.substring(0, subStringIndex); //Storing the string before the starting index of the sub string.
      String stringAfterSubString = userInput.substring(subStringIndex + userInputSubString.length()); //Gets the end of the subStringIndex, and the end of the entire phrase, so it gets the last part of the string.
      
      System.out.println("The string that comes before your specified substring is: " + stringBeforeSubString);
      System.out.println("The string that comes after your specified substring is: " + stringAfterSubString);
      
      System.out.print("Specify a replacement string: ");
      String replacementInput = scanner.nextLine(); //Stores the replacement string as a string.
      String newString = stringBeforeSubString + replacementInput + stringAfterSubString; //Concatenate all parts of the string into a string. Also stores as string.
      
      System.out.println("Your new string is: " + newString);
    }
}