public class StudentMBase {
	private String name; //The name of student.
	private String grade; //The grade level of the students.
	
	/*
	 * Purpose: Creates and instantiates the object.
	 * Takes in string name and string grade.
	 */
	public StudentMBase (String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	/*
	 * Purpose:
	 * Return the name as a string.
	 */
	public String getName() {
		return this.name;
	};
	
	/*
	 * Purpose:
	 * Return the grade as a string.
	 */
	public String getGrade() {
		return this.grade;
	}
	
	/*
	 * Purpose:
	 * Returns the console output.
	 */
	public String toString () {
		
		return ("Name " + name +  "\nGrade Level: " + grade);
	}
}
