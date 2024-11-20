
public class ClassExercise3 {

	public static void main(String[] args) {
		String period2 = "art";  // period 2’s subject
		String period3 = "art"; // period 3’s subject
		String period4 = new String("art");  // period 4’s subject
		String period5 = new String ("art"); // period 5’s subject
		
		
		//Question 1:
		boolean resultA = false;        // question 1 result
		
		if (period2 == period3) {
			resultA = true;
		}
		
		System.out.println("resultA (==): " +  resultA);
		
		
		//Question 2:
		boolean resultB = false;        // question 2 result
		if (period2 == period4) {
			resultB = true;
		}
		System.out.println("resultB (==): "  +  resultB);
		
		//Question 3:
		boolean resultC = false;       	// question 3 result
		if  (period4 == period5) {
			 resultC = true;  
		}
		System.out.println("resultC, (==): "  +   resultC);
		
		//Question 4:
		boolean resultD = false;      	// question 4 result
		if (period4.equals(period5)) {
			resultD = true;  
		}
		System.out.println("resultD (equals method): " +  resultD);
		
		//Question 5:
		boolean resultE = false;       	// question 5 result
		if (period2.equals(period5)) {
			resultE = true;
		}
		System.out.println("resultE (equals method): "  +  resultE);
		
		//Question 6:
		period5 = period4;        	 	// note the assignment here!
		boolean resultF = false;       	//question 6 result
		if (period4 == period5) {
			resultF = true;
		}
		System.out.println("resultF (assignment and ==): "   +   resultF);
	}

}
