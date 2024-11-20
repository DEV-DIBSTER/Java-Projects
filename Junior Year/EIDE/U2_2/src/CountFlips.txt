
public class CountFlips {

	public static void main (String[] args) {
		
		Coin myCoin = new Coin(); //My coin class object.
		
		int numHeads = 0; //Number of heads.
		int numTails = 0; //Number of tails.
		
		for (int i = 0; i < 100; i++){
			
			myCoin.flip(); //Flip coin.
			
			if (myCoin.isHeads()){
				numHeads++;
			} else {
				numTails++;
			}
		}
		
		System.out.println("Number of heads: " + numHeads + "\nNumber of tails: " + numTails);
	}
}
