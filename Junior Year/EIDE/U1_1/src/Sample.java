import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter age:");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ender Address:");
		String address = scanner.nextLine();
		
		System.out.println("--------");
		System.out.println("Your name = " + name);
		System.out.println("Your age = " + age);
		System.out.println("Your address = " + address); 
	}
}
