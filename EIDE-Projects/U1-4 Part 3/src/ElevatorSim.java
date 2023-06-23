import java.util.Scanner;

public class ElevatorSim {
	/**
	 * Assignment: U1-4 Part 3
	 * Class: ElevatorSim
	 * Purpose: To practice basic conditional use.
	 * @Author: salam.1
	 * Testcases:
	 * 
	 * Tried 1, it responded with your actual floor number is: 1, which is expected.
	 * Tried -1, it responded with this floor does not exist, which is expected.
	 * Tried 23, it responded with this floor does not exist, which is expected.
	 * Tried 13, it responded with Floor 13 does not exist, which is expected.
	 * Tried 15, it responded with your actual floor number is: 14, which is expected.
	 * Tried 0, it responded with this floor does not exist, which is expected.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.print("What floor do you want to travel through: ");
		
		int floorNum = scanner.nextInt(); //Stores floor input as integer.
		scanner.nextLine(); //Consumes next line character.
		
		final int MAX_FLOOR = 21; //The max floor.
		final int UNLUCKY_FLOOR = 13; //The unlucky floor.
		
		if(floorNum == UNLUCKY_FLOOR) {
			System.out.println("Floor " + UNLUCKY_FLOOR + " does not exist.");
		} else if (floorNum <= 0 || floorNum >= MAX_FLOOR) {
			System.out.println("This floor does not exist.");
		} else {
			if(floorNum > UNLUCKY_FLOOR) {
				floorNum--;
			}
			
			System.out.println("Your actual floor number is: " + (floorNum));
		}
	}
}
