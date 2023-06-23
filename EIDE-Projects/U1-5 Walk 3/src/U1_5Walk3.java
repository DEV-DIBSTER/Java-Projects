
public class U1_5Walk3 {

	public static void main(String[] args) {
		
		final int DIV = 12; //The divsor.
		int limit = 100; //Limit for numbers.		
		int counter = 1; //Stores counter which increases.
		String output = ""; //Stores output.
		
		while (counter <= limit){
			if (counter % DIV == 0){
				System.out.println(counter);
			}
			
			counter++; //Upticks counter. Increases by one.
		}
		
		for (int i = 1; i <= limit; i++){
			if (i % DIV == 0) {
				output += i + " ";
			}
		};
		
		System.out.println(output);
	}

}
