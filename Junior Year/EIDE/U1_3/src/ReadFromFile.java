import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File ("input.txt");
		
		Scanner scan = new Scanner(inputFile);
		
		while (scan.hasNextInt()) {
			
			int num = scan.nextInt();
			
			System.out.println(num);
		}

		scan.close();
	}
}
