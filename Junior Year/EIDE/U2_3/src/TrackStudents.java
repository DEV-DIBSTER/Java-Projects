import java.util.ArrayList;

/**
 * @author salam.1
 * Class: TrackStudents
 * Assignment: U2-3 Walk3
 * Purpose: Now that you’ve created your Student class and sketched out what that looks like, the purpose of this part is to create your driver program.
 */
public class TrackStudents {

	public static void main(String[] args) {

		ArrayList <Student> students = new ArrayList <Student> (); //Stores the students in an arraylist.
		
		Student student1 = new Student("Donald Duck", "Freshman"); //Creates the new student object.
		
		student1.addTestScore(70); //First test score.
		
		student1.addTestScore(99); //He did pretty well.
		
		student1.addTestScore(85); //He's not doing as well.
		
		students.add(student1); //Adding student to the total students arraylist.
				
		Student student2 = new Student("Mickey Mouse", "Junior"); //Creates the new student object.
		
		student2.addTestScore(85); //First score.
		
		student2.addTestScore(100); //Second test score.
		
		student2.addTestScore(99); //Third test score.
		
		students.add(student2); //Adding student to the total student arraylist.
				
		Student student3 = new Student("Adib Salam", "Junior"); //Creates the new student object.
		
		students.add(student3); //Adding an additional student.
		
		Student myself = students.get(2);
		
		myself.addTestScore(100);
		
		myself.addTestScore(95);
		
		System.out.println(students);
	}

}
