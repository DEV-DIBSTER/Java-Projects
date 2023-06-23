import java.util.Scanner;
public class WorkWithInput {
	public static void main (String[] args) {
		
		//Set up to read input  (declare and instantiate your Scanner object)
		Scanner scan = new Scanner (System.in);

		//Tell the user to input a phrase or quote with at least 3 words
		//(Note:  User entry should be on the same line as the prompt)
		System.out.print("Enter a phrase or quote with at least 3 words: ");	
		

		// Read the entire input line and store in one variable
		String firstQuoteInput = scan.nextLine(); // This stores the entire quote line.


		// Output the contents of the variable on a line by itself. 
                // (Note: Don't include any other words/content on the output line) 
		System.out.println(firstQuoteInput);


		// Tell the user to input another phrase or quote with at least 3 words
		//(Note:  User entry should be on the same line as the prompt)
		System.out.print("Enter another phrase or quote with at least 3 words: ");
		

		// Read and set the first word of this second phrase/quote to one variable
		String firstWordInput = scan.next(); //First word of the second quote input.


		// Read and set the remainder of this second phrase/quote to another variable. 
		String remainderInput = scan.nextLine(); //Remainder of the input of the quote.


		// Output the contents of the first word on a line by itself
  		// (Note: Don't include any other words/content on the output line) 
		System.out.println(firstWordInput);


		//Output the remaining words on a separate line (again, no other words/content on output line) 
		System.out.println(remainderInput);	
	}
}