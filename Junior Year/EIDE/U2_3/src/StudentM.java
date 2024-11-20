import java.util.ArrayList;

public class StudentM {
	private ArrayList < Integer > scores; //Student's test scores.
	private StudentMBase studentBase; //Student base part.
	
	/*
	 * Purpose: Instantiating the User.
	 * Takes in a name string and grade string.
	 */
	public StudentM (String name, String grade) {
		this.studentBase = new StudentMBase(name, grade);
		this.scores = new ArrayList <Integer> ();
	}
	
	/*
	 * Purpose: Adds a new test score.
	 * Takes in a integer test score.
	 * Returns nothing.
	 */
	public void addTestScore (int testScore) {
		scores.add(testScore);
	}
	
	/*
	 * Purpose: Gets the averages of the test scores.
	 * Takes nothing in.
	 * Returns a double with the average.
	 */
	public double getAverageScores () {
		
		double totalScores = 0; //Stores total scores.
		
		for (int i = 0; i < scores.size(); i++) {
			totalScores = totalScores + scores.get(i);
		}
		
		double average = (totalScores / scores.size()); //The average scores.
		
		return average;
	}
	
	/*
	 * Returns the student's name as string.
	 */
	public String getName() {
		return studentBase.getName();
	}
	
	/*
	 * Returns the student's grade as string.
	 */
	public String getGrade() {
		return studentBase.getGrade();
	}
	
	/*
	 * Purpose:
	 * Returns the console output.
	 */
	public String toString () {
		
		return "Name: " + getName() + 
				"\nGrade Level: " + getGrade() +
				"\nScores: " + scores.toString() +
				"\nAverage: " + getAverageScores();
	}
}
