import java.util.Scanner;

/**
 * Assignment: U1-5 Extension 1
 * Class: InvestRuleOf72
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * 100 2
 * 
 * "It took 36 periods to double your money"
 * 
 * 500 2.5
 * 
 * "It took 29 periods to double your money"
 */


public class InvestRuleOf72 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //The new scanner.
		
		System.out.print("Please type an initial value: ");
		
		double startVal = scan.nextDouble(); //Stores the initial value as double.
		scan.nextLine(); //Consume the new line token.
		
		System.out.print("Please type an interest rate: ");
		
		double interest = (scan.nextDouble() / 100); //Stores the interest as double.
		scan.nextLine(); //Consume the new line token.
		
		System.out.println("\n------------------------------------------------------------\n");
		
		int periods = 0; //Stores the year as the initial value.
		double newBal = startVal; //Stores the new balance as double.
		
		//Checks if the new balance is less then the doubled value of my start balance.
		while (newBal < (startVal * 2)){
			
			double previous = newBal; //This is your previous balance from last period.
			double addition = (newBal * interest); //The new interest adds this much to balance.
			
			newBal = previous + addition; //Adds the new interest amount to this.
			
			periods++; //Increases the period count by one.
			
			System.out.println("At the end of period " + periods + " the current balance is: $" + newBal);
		}
		
		//Stores the original number as a integer.
		final int ORIGINAL_RULE = 72;
		
		double rule72 = (ORIGINAL_RULE / (interest * 100)); //Stores the estimated rule value.
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Final Balance: " + newBal);
		System.out.println("It took " + periods + " period to double your money.");
		System.out.println("The rule of 72 predicted that it would take " + rule72 + " number of periods to double your money.");
	}

}
