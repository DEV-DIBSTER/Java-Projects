public class U1_6Walk3 {

	public static void main(String[] args) {
		int[] myInts = new int[10]; //Stores the items of array.
		
		System.out.println("-------------------------------");
		
		for (int i = 0; i < myInts.length; i++){
			myInts[i] = i * i;
		}
		
		for (int j = 0; j < myInts.length; j++) {
			System.out.println(myInts[j]);
		}
		
		System.out.println("-------------------------------");
	}

}
