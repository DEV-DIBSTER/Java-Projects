/**
 * Assignment: U1-5 Part 2
 * Class: ConvertCtoF
 * Purpose: Using loops.
 * @Author: salam.1
 * Testcases:
 * 
 * No test cases were used for this.
 */

public class ConvertCtoF {

	public static void main(String[] args) {
		
		System.out.println("C                      F     ");
		System.out.println("-----------------------------");
		
		for (int i = 0; i <= 100; i++){ 
			int f = i * 9/5 + 32; //Stores the F value as integer.
			
			if(i % 10 == 0){
				System.out.println(i + "                      " + f);
			}			
		}
	}

}
