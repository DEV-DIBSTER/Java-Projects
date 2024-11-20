import java.util.Scanner;

public class U1_2Walk1 {

	private static void printGreeting(String name, String grade) {
		System.out.println("Hello " + name + ", goodluck in your " + grade + " year.");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Instantiate string object.
		
		System.out.print("Please type your name: ");
		
		String userName = scan.nextLine(); //Stores the username.
		
		System.out.print("What grade are you in: ");
		
		String userGrade = scan.nextLine(); //Holds user's grade.
		
		printGreeting(userName, userGrade);
	}

}
