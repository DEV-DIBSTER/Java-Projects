public class UseRandomMath {
	
    public static void main(String args[]) {
       double randomDouble = Math.random(); //My new random double variable.
       
       System.out.println("The double random number between 0 (inclusive) and 1 (exclusive) is: " + randomDouble);
       
       int randomInt = (int) Math.round((Math.random() * 5)); //Generating my number between 0 and 1. Then multiplying that by 5 to "technically" be between 0 and 5. Then rounding it.
       
       System.out.println("The integer random number between 0 (inclusive) and 5 (exclusive) is: " + randomInt);
    }
}