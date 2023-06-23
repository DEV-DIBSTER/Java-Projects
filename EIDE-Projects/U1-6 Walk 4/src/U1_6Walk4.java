import java.util.Random;

public class U1_6Walk4 {

	public static void main(String[] args) {		
		System.out.println("-------------------------------");
		
		Random rand = new Random(); //Instantiates my random object.
		
		for (int i = 0; i < 8; i++){
			System.out.println(rand.nextInt(11));
		}
		
		System.out.println("-------------------------------");
	}

}
