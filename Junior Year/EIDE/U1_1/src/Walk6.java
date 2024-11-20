import java.util.Scanner;

public class Walk6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type Number: ");
		
		//Part 3:
		/*
		int n = scan.nextInt();
		
		if (n > 0)
		     if (n % 2 == 0)
		  	   System.out.println("Output1: " + n);
		else
			System.out.println(n + " is not positive");
			System.out.println("Output2: " + n);
		*/
		
		int i = scan.nextInt();
		{

		if (i < 5)
		     if (i < 2)
		   	  i = i + 1;
		else
		     i = i - 1;

		}

		System.out.println(i);
	}

}
