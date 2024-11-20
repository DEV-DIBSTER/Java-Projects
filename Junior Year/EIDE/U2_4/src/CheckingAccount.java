
public class CheckingAccount extends BankAccount {

	private int minBalCharge;
	
	public CheckingAccount(String name){
		super(name);
		
		minBalCharge = 1000;
	}

	public int fees (double fees) {
		
		//Only if the balance is below, we charge service fee.
		if (super.getBal() < minBalCharge){
			
			if(super.withdrawal(fees)){
				System.out.println("Service fee charged to balance.");
				
				return 1;
			} else {
				
				System.out.println("Balance insufficient to charge service fee.");
				
				return -1;
			}
		} else {
			return 0;
		}
		
		
	}
	
	public String toString (){
		return "Minimum Balance Needed to Charge: " +  minBalCharge;
	}
}
