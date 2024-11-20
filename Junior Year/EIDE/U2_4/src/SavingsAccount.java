
public class SavingsAccount extends BankAccount {

	private double minBal; //The minimum value needed to add interest.
	private double interest; //The interest rate that is being applied.
	
	public SavingsAccount(String name, double rate, double minBal){
		
		super(name);
		this.minBal = minBal;
		this.interest = rate;
	}
	
	public boolean addInterest(double amount){
		
		if (super.getBal() < minBal){
			System.out.println("Sorry, the minimum balance was not met to add interest.");
			
			return false;
		} else {
			double interestToAdd = (super.getBal() * amount); //The amount of interest that is being added.
			
			super.deposit(interestToAdd);
			
			System.out.println("Successfully added interest to your account. Balance: " + super.getBal());
			
			return true;
		}
	}
	
	public String toString (){
		return "Minimum Balance: " +  minBal +
				"\nInterest: " + interest + 
				"\nBalance: " + super.getBal();
	}
}
