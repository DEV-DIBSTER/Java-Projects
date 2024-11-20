import java.util.Scanner;

public class U1_2_Walk1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Set the new scanner class to varible.
		
		System.out.print("Please type a number to go to: ");
		
		int lastNum = scanner.nextInt(); //Get's the number and stores it as int.
		
		scanner.close();
		
		int i = 1; //Variable for loop.
		int finalVal = 0; //Variable to store value.
		
		while (i <= lastNum){
			finalVal = finalVal + i;
			i++;
		}
		
		System.out.println("Your final value using WHILE loop: " + finalVal);
		
		int finalValue = 0; //Variable to store value.
		
		for (int j = 1; j <= lastNum; j++){
			finalValue = finalValue + j;
		};
		
		System.out.println("Your final value using FOR loop: " + finalValue);
	}
}
