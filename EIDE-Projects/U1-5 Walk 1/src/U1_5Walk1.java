
public class U1_5Walk1 {
	
	public static void main(String args[]){
		
		int sum1 = 50; //Int value for initial value.
		int topValue = 10; //Int variable the value of 10.
		
		for (int i = 0; i < topValue; i++) {
			sum1++;
			
			//sum1 = sum1 + 1;
		}
		
		System.out.println(sum1);
		
		int upperValue = 5; //Initial value of 5 stored as int.
		int sum2 = 0; //Initial value of sum2.
		
		for (int i = 0; i <= upperValue; i++){
			sum2 += i;
			
			//sum2 = sum2 + i;
		}
		
		System.out.println(sum2);
	}
}
