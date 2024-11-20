
public class U1_2LoopTracing {

	public static void main(String[] args) {
		
		//Problem #1
		System.out.println("----------------------------------------");
		
		int k = 1729;
		int sum = 0;
		
		while (k > 0){
			int digit = k % 10;
			
			k /= 10;
			
			sum = sum + digit;
			
			//System.out.println("Looped");
		}
		
		System.out.println("Total Sum: " + sum);
		
		//Problem #2
		System.out.println("----------------------------------------");
		
		int a1 = 2;
		int m1 = 4;
		int r1 = 1;
		int i1 = 1;
		
		int loopCounter = 0;
		
		while (i1 <= m1) {
			r1 *= a1;
			
			i1++;
			loopCounter++;
			
			System.out.println("----");
			System.out.println("[LOOP COUNTER: " + loopCounter + " ] a1: " + a1 + " m1: " + m1 + " r1: " + r1 + " i1: " + i1);
		}
		
		//Problem #2 Part 2
		System.out.println("----------------------------------------");
		
		int a2 = 3;
		int m2 = 3;
		int r2 = 1;
		int i2 = 1;
		
		int loopCounter1 = 0;
		
		while (i2 <= m2) {
			r2 *= a2;
			
			i2++;
			loopCounter1++;
			
			System.out.println("----");
			System.out.println("[LOOP COUNTER: " + loopCounter1 + " ] a2: " + a2 + " m2: " + m2 + " r2: " + r2 + " i2: " + i2);
		}
		
		//Problem #3
		System.out.println("----------------------------------------");
		
		int h = 1;
		
//		while (h != 50){
//			System.out.println(h);
//			h += 10;
//		}
		
		//Problem #4
		System.out.println("----------------------------------------");
		
		int num1 = 123;
		
		int count1 = 1;
		int temp1 = num1;
		while (temp1 > 10){
			count1++;
			temp1 /= 10;
		}
		
		System.out.println("The number of digits is: " + count1);
		
		//Problem #5
		System.out.println("----------------------------------------");
		 
		int num2 = 100;
		int count2 = 1;
		int temp2 = num2;
		
		while (temp2 > 10){
			count2++;
			temp2 /= 10;
		}
		
		System.out.println("The number of digits is: " + count2);
	}

}
