
public class FlipTriple {

	public static void main(String[] args) {
		
		Coin myCoin = new Coin(); //My coin class object.
		
		int counter = 0; //The counter for the loop condition.
		int totalCounter = 0; //The counter for all of the loop.
		
		final int COUNTER_LIMIT = 200; //The condition to stop the loop.

		while (counter < COUNTER_LIMIT){
			
			totalCounter++;
			
			myCoin.flip(); //Flip coin.
			
			System.out.println(totalCounter + ") " + myCoin);
			
			if (myCoin.isHeads()){
				counter++;
			} else {
				counter = 0;
			}
		}
		
		System.out.println("\nIt took " + totalCounter  + " flips to get " + COUNTER_LIMIT + " heads in a row.");
	}

}
