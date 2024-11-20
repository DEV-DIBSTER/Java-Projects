import java.util.Scanner;

/**
 * Assignment: U1-5 Extension 2
 * Class: InvestRuleOf72Ench
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 *  
 */


public class InvestRuleOf72Enh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //The new scanner.
		
		System.out.print("Please type an initial value: ");
		
		double startVal = scan.nextDouble(); //Stores the initial value as double.
		scan.nextLine(); //Consume the new line token.
		
		System.out.print("Please type an interest rate: ");
		
		double interest = scan.nextDouble(); //Stores the interest as double.
		scan.nextLine(); //Consume the new line token.
		
		System.out.println("\n------------------------------------------------------------\n");
		
		int periods = 0; //Stores the year as the initial value.
		double newBal = startVal; //Stores the new balance as double.
		
		//Checks if the new balance is less then the doubled value of my start balance.
		while (newBal < (startVal * 2)){
			
			double previous = newBal; //This is your previous balance from last period.
			double addition = newBal * (interest / 100); //The new interest adds this much to balance.
						
			newBal = previous + addition; //Adds the new interest amount to this.
			
			periods++; //Increases the period count by one.
			
			System.out.println("At the end of period " + periods + " the current balance is: $" + newBal);
		}
		
		//The value we will use for our rule.
		int ruleNum = 72;
		
		//Checks if interest is greater than 8.
		
		if((interest) > 8){
			//The interest value we are using to check how much.
			double tempPercentage = (interest);
					
			while (tempPercentage > 8) {
				tempPercentage = tempPercentage - 3;
								
				ruleNum++;
			}
				
		} else if (interest < 8) {
			//The interest value we are using to check how much.
			double tempPercentage = interest;
					
			while (tempPercentage < 8) {
				tempPercentage = tempPercentage + 3;
								
				ruleNum--;
			}
		}	else {
			//This is triggered when the interest is exactly 8 percent.
			//Nothing is changed as the rule is kept the same.
		}
				
		double ruleResult = (ruleNum / interest); //Stores the estimated rule value.
	
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Final Balance: " + newBal);
		System.out.println("It took " + periods + " period to double your money.");
		System.out.println("The rule of " + ruleNum + " predicted that it would take " + ruleResult + " number of periods to double your money.");
	}

}
