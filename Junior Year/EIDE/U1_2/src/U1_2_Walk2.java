
public class U1_2_Walk2 {

	public static void main(String[] args) {
					
		final int LINES = 4; //Stores the number of lines as a int.
		final int TOTAL_VALUES = 4; //Stores the total values.

		for (int i = 0; i < LINES; i++){
			for (int j = 0; j < TOTAL_VALUES; j++){
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println(" ");
				
		for (int i = 0; i < LINES; i++){
			
			for (int j = 0; j <= i; j++){
				System.out.print("*");
			}			
			
			System.out.println(" ");
		}
		
		System.out.println(" ");
						
		for (int i = LINES; i > 0; i--){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}			
						
			System.out.println(" ");
		}
	}

}
