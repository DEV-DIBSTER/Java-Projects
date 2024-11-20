


public class Area {
	/**
	 * U2-1 
	 * Class: Area
	 * @author: salam.1
	 * Test Cases:
	 * 
	 * 4 5
	 */
	
	//Calculate the area of a rectangle.
	private static int findArea (int width, int height) {
		int area = width * height; //Calculate the area given the two parameters.
		
		return area;
	}
	
	public static void main(String[] args) {
		int myWidth = 4; //User width.
		int myHeight = 3; //User Height.
		
		int finalArea = findArea(myWidth, myHeight); //Gets results from method.
		
		System.out.println("The area is: " + finalArea);
	}

}
