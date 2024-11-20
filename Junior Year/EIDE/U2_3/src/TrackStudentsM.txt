import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author salam.1
 * Class: TrackStudentsM
 * Assignment: U2-3 Walk4
 * Purpose: Expanding on the classes.
 * 
 * Test Cases:
 * 
 * Adib Salam
 * Junior
 * 80
 * 70
 * 20
 * 
 * 56.67
 * 
 * Jack Goodman
 * Sophmore
 * 100
 * 98
 * 100
 * 
 * 99.33
 * 
 * Henry Li
 * Sophmore
 * 85
 * 90
 * 2
 * 
 * 59
 */
public class TrackStudentsM {

	public static void main(String[] args) {

		ArrayList <StudentM> students = new ArrayList <StudentM> (); //Stores the students in an arraylist.
		
		Scanner scan = new Scanner(System.in); //Declares scanner object.
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("\nPlease type a name of a student: ");
			
			String name = scan.nextLine(); //Stores student name.
			
			System.out.print("Please type a grade of a student: ");
			
			String grade = scan.nextLine(); //Stores student grade.
			
			StudentM student = new StudentM(name, grade); //Declare the new student object.
			
			//For loop for test scores.
			for (int j = 0; j < 4; j++) {
				
				System.out.print("Type a test score: ");
				
				student.addTestScore(scan.nextInt());
			}
			
			scan.nextLine();
			
			students.add(student);
		}
		
		System.out.println();
				 		
		for (int i = 0; i < 3; i++){
			System.out.println(students.get(i).toString());
			
			System.out.println();
		}
		
		//Extension.
		
		System.out.print("Would you like to work with one (s)tudent or do a (w)hole‐class roster activity or (q)uit? (specify s, w, or q): ");
		
		String response = scan.nextLine(); //Stores the response as a string.
		
		if(response.equals("s")) {
			
			StudentM tempStudent = null; //The object of the student.
			
			boolean isFound = false; //Will set to true when done.
			
			while (!isFound){
				System.out.print("\nWhich student would you like to find: ");
				
				String inputName = scan.nextLine(); //The name of the student to find.
							
				for (int i = 0; i < students.size(); i++){
					if (students.get(i).getName().equals(inputName)){
						tempStudent = students.get(i);
						isFound = true;
					}
				}
				
				if (isFound == false){
					System.out.println("Student was not found. Please retype student's name accurately.");
				}
			}
			
			System.out.print("Would you like to list student (i)nformation or get their (a)verage? (specify i or a): ");
			
			String inputAction = scan.nextLine(); //Getting the action that you need to do.
						
			if (inputAction.equals("i")){
				System.out.println(tempStudent);
			} else {
				System.out.println(tempStudent.getName() + " average is: " + tempStudent.getAverageScores());
			}
			
		} else if (response.equals("w")){
			System.out.print("Would you like to compute the (a)verage of the class or determine which students have an average above a certain (t)hreshold (specify a or t): ");
			
			String inputClassAction = scan.nextLine(); //Getting the action that you need to do.
			
			if (inputClassAction.equals("a")){
				double totalAverages = 0; //Stores the total averages for all the students.
				
				for (int i = 0; i < students.size(); i++){
					totalAverages = totalAverages + students.get(i).getAverageScores();
				}
				
				double classAverage = (totalAverages / students.size()); //Stores the class average.
				
				System.out.println("\nThe class average test score is: " + classAverage);
			} else {
		
				System.out.print("Specify the minimum average threshold: ");
				
				double threshold = scan.nextDouble(); //Stores the threshold for later.
		
				System.out.println("Students that are above the threshold: ");
				
				int aboveThreshold = 0; //Students above threshold.
				
				for (int i = 0; i < students.size(); i++){
					
					if (students.get(i).getAverageScores() >= threshold){
						System.out.println(students.get(i).getName() + " (" + students.get(i).getGrade() + ")");
						aboveThreshold++;
					}
				}
				
				if (aboveThreshold == 0){
					System.out.println("Nobody is above threshold!");
				}
			}
		} else {
			System.out.println("\n\nGoodbye!");
		};
	}

}