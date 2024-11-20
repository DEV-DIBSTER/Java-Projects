import java.util.Scanner;

/**
 * @author salam.1
 * Class: Sort4Strings
 * Assignment: U1-1 Part 1
 * Purpose: Ask user for 4 commas, then sort them into alphanumeric order.
 * Test Cases:
 * 
 * Your original strings were: cupcakes cake brownies apples
 * Your ordered strings are: apples brownies cake cupcakes
 * 
 * Your original strings were: yuvraj adib jack henry
 * Your ordered strings are: adib henry jack yuvraj
 * 
 * Your ordered strings were: acc a accz az
 * Your ordered strings are: a acc accz az
 */
public class Sort4Strings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please type 4 strings seperated by spaces: ");
		
		String string1 = scan.next();
		String string2 = scan.next();
		String string3 = scan.next();
		String string4 = scan.next();
				
		String tempString;
		
		System.out.println("Your original strings were: " + string1 + " " + string2 + " " + string3 + " " + string4);
		
		//PASS #1:
		
		//Checks if string1 is out of out with string2.
		if(string1.compareTo(string2) > 0){
			
			tempString = string1;
			
			string1 = string2;
			string2 = tempString;
		}
		
		//Checks if string2 is out of out with string3.
		if (string2.compareTo(string3) > 0){
			
			tempString = string2;
			
			string2 = string3;
			string3 = tempString;
		}
		
		//Checks if string3 is out of out with string4.
		if (string3.compareTo(string4) > 0){
					
			tempString = string3;
					
			string3 = string4;
			string4 = tempString;
		}
		
		//PASS #2:
		
		//Checks if string1 is out of out with string2.
		if(string1.compareTo(string2) > 0){
			
			tempString = string1;
			
			string1 = string2;
			string2 = tempString;
		}
		
		//Checks if string2 is out of out with string3.
		if (string2.compareTo(string3) > 0){
			
			tempString = string2;
			
			string2 = string3;
			string3 = tempString;
		}
		
		//PASS #3:
		
		//Checks if string1 is out of out with string2.
		if(string1.compareTo(string2) > 0){
			
			tempString = string1;
			
			string1 = string2;
			string2 = tempString;
		}
		
		//Checks if string2 is out of out with string3.
		if (string2.compareTo(string3) > 0){
			
			tempString = string2;
			
			string2 = string3;
			string3 = tempString;
		}
		
		String order = "Your ordered strings are: " + string1 + " " + string2 + " " + string3 + " " + string4;
		
		
		
		System.out.println(order);
	}

}
