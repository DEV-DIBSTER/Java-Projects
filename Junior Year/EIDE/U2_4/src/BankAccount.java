
public class BankAccount {

	private String name; //The name of the account.
	private int accNum;  //The accNum of the account.
	private double bal;  //The balance of the account.
	
	private int nextAvailableAcc = 1000; //The next available account number.
	
	
	public BankAccount (String name){
		this.name = name;
		this.bal = 0;
		
		this.updateAvailableAcc();
	}

	private void updateAvailableAcc (){
		this.accNum = this.nextAvailableAcc;
		
		nextAvailableAcc++;
	}
	
	public void deposit (double amount){
		bal = bal + amount;
	}
	
	public Boolean withdrawal (double amount){
		if ((bal - amount) < 0){
			//return "The withdrawal was not successful: Balance too low.";
			
			return false;
		} else {
			bal = bal - amount;
			
			//return "The withdrawal was successful. Remaining Balance: " + bal;
			return true;
		}
	}
	
	public double getBal(){
		return bal;
	}
	
	public String toString() {
		return "Owner: " +  name +
				"\nAccount Number: " + accNum + 
				"\nBalance: " + bal;
	}
}
