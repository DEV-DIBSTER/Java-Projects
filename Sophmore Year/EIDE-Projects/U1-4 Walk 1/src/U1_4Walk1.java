
public class U1_4Walk1 {

	public static void main(String[] args) {
		
		double totalCost = 0; 		//Total cost of the items as double.
		int totalItems = 0;   		//Total items that you got.
		
		double sodaCost = 2.25;		//The cost of soda as double.
		double pizzaCost = 4.50;	//The cost of pizza as double.
		
		//Assuming the user brought a soda.
		System.out.println("Thank your soda purchase!");
		
		totalCost += sodaCost; //Updating the total cost.
		totalItems++;		   //Updating the count by one.
		
		System.out.println("Your total cost is " + totalCost + " and you've purchased " + totalItems + " items.\n\n");
		
		//Assuming the user brought a pizza.
		System.out.println("Thank your pizza slice purchase!");
		
		totalCost += pizzaCost; //Updating the total cost.
		totalItems++;		   //Updating the count by one.
		
		System.out.println("Your total cost is " + totalCost + " and you've purchased " + totalItems + " items.\n\n");
	}

}
