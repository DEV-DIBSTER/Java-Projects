import java.util.Scanner;

public class U2_1Walk2 {

	private static int sortNum(int int1, int int2) {
		if(int1 > int2){
			return int1;
		} else {
			return int2;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Instantiate string object.
		
		System.out.print("Please type your first integer: ");
		
		int int1 = scan.nextInt(); //Stores the integer as integer.
		scan.nextLine(); //Consumes the next line token.
		
		System.out.print("Please type your second integer: ");
		
		int int2 = scan.nextInt(); //Stores the integer as integer.
		scan.nextLine(); //Consumes the next line token.		
		
		int greaterNum = sortNum(int1, int2); //Stores greatest sorted num as integer.
		
		System.out.println("Your larger number is: " + greaterNum);
		
		scan.close(); //Close the scanner object.
	}

}