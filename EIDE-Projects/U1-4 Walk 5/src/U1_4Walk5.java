import java.util.Scanner;

public class U1_4Walk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaring new scanner class to read user input.

		System.out.print("Please type your grade level: ");
		int gradeLevel = scanner.nextInt(); //Student input grade level.
		
		System.out.print("Please type your absences: ");
		int absences = scanner.nextInt(); //Student input absences.

		System.out.print("Please type your participation points: ");
		int participationPoints = scanner.nextInt(); //Student input participation points. Stores this count as well.
		
		if (gradeLevel >= 90 && absences <= 2) {
			System.out.println("Exempt from final exam.");
		} else {
			System.out.println("You have to take the exam.");
		}
		
		if (gradeLevel >= 85 || absences == 0) {
			participationPoints += 10;
		}
		
		System.out.println("You have " + participationPoints + " participation points!");
	}

}
