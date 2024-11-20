
public class U1_5Walk2 {

	public static void main(String[] args) {
		
		int sum1 = 50; //Storing initial value of 50 as int.
		int topValue = 10; //Storing initial value of 10 as int.
		int countValue = 0; //Storing counting value as 0 initially.
		
		while (countValue < topValue) {
			countValue++; //Increasing the count by one each time.
			sum1++; 	  //Increasing the sum by one each time.
		}
		
		System.out.println(sum1);
		
		int upperValue = 5; //Initial value of 5 stored as int.
		int sum2 = 0;       //Initial value of 0 stored as int.
		int j = 0; 			//Initial value of 0 stored as int.
		
		while (j <= upperValue){
			sum2 += j;
			j++;
		}
		
		System.out.println(sum2);
	}

}
