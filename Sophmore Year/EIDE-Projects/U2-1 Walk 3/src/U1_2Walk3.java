import java.util.Arrays;

public class U1_2Walk3 {
	
	private static double [] findCube(){
		double[] cubed = new double[10]; //Stores data as integer.
		
		for (int i = 0; i < cubed.length; i++){
			cubed[i] = Math.pow(i, 3);
		}
		
		return cubed;
	}
	
	public static void main(String[] args) {
		
		String result = Arrays.toString(findCube()); //Stores result as string.
		
		System.out.println(result);
	}
}
