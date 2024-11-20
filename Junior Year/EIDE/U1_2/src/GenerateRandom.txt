// Random #s using Random class in java.util
// Base --> Util --> Random
// int rand = Random.nextInt(bound)
// instance method
// This returns a random value between 0 and the specified higher value which is provided as a parameter.
// The parameter that is provided will be the exclusive value it goes up to.
// So it'd be within the range of inclusive 0 to exclusive parameter value, so it can be a 0 value, and it can go all the way up to the provided parameter value, but it cannot be that value.



import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		
		Random rand = new Random(); //Declares the random object.
		
		//System.out.println("Your random: " + rand.nextInt(5));
		System.out.println("Random # (Random class) in range of 0 (inclusive) and 5 (exclusive):");
		
		for (int i = 0; i < 25; i++){
			
			int random = rand.nextInt(5);
			
			System.out.print(random + " ");
		};
		
		System.out.println("\n\n\n");
		
		// Random #s using Math class
		// Base --> Lang --> Math
		// double rand = Math.random();
		// Static method.
		// It has an inclusive value of 0 and an exclusive value of 1.0, so everything must be within that range, but it cannot be 1.0.
		
		//System.out.println("Your random: " + (int) (Math.random() * 5));
		System.out.println("Random # (Math class) in range of 0 (inclusive) and 5 (exclusive)");
		
		for (int i = 0; i < 25; i++){
			
			int mathRand = (int) (Math.random() * 5);			
			
			System.out.print(mathRand + " ");
		};
		
		System.out.println("\n\n\n");
		
		System.out.println("Random # (Math class) in range of 10 (inclusive) and 20 (exclusive)");
		
		for (int i = 0; i < 25; i++){
			
			int mathRand = (int) ((Math.random() * 10) + 10);			
			
			System.out.print(mathRand + " ");
		};
		
		System.out.println("\n\n\n");

		
		System.out.println("Random # (Math class) in range of 8 (inclusive) and 12 (inclusive)");
		
		for (int i = 0; i < 25; i++){
			
			int randRandom = (int) ((rand.nextInt(5)) + 8);			
			
			System.out.print(randRandom + " ");
		};
	}

}
