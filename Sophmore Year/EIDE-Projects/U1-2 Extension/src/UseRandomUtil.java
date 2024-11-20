import java.util.Random;

public class UseRandomUtil {
    public static void main(String args[]) {
         Random random = new Random(); //Creates a new random object.
         
         int randomInteger = random.nextInt(5); //This is the next random integer generated. Limit is 5.
         
         System.out.println("The random number between 0 (inclusive) and 5 (exclusive) is: " + randomInteger);
         
         int randomInteger2 = random.nextInt(10) + 1; //This is the next random integer generated. Limit is 10.
         
         System.out.println("The random number between 1 (inclusive) and 10 (inclusive) is: " + randomInteger2);
    }
}