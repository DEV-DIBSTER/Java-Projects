 
public class ConvertDay1 {
	private static String convertNumtoDay (int numDay) {
		if (numDay == 1) {
			return "Monday";
		} else if (numDay == 2) {
			return "Tuesday";
		} else {
			return "Wednesday";
		}
	}
	public static void main(String[] args) {
		String finalDay = convertNumtoDay(2);
		
		System.out.println("Final Day is "+ finalDay);
	}

}
