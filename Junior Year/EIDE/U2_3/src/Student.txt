import java.util.ArrayList;

public class Student {
	private String name; //The name of student.
	private String grade; //The grade level of the students.
	private ArrayList < Integer > scores; //Student's test scores.
	
	public Student (String name, String grade) {
		this.name = name;
		this.grade = grade;
		this.scores = new ArrayList <Integer> ();
	}
	
	public void addTestScore (int testScore) {
		scores.add(testScore);
	}
	
	public double getAverageScores () {
		
		double totalScores = 0; //Stores total scores.
		
		for (int i = 0; i < scores.size(); i++) {
			totalScores = totalScores + scores.get(i);
		}
		
		double average = (totalScores / scores.size()); //The average scores.
		
		return average;
	}
	
	public String toString () {
		
		return "Name " + name + 
				"\nGrade Level: " + grade +
				"\nScores: " + scores.toString() +
				"\nAverage: " + getAverageScores();
	}
}
