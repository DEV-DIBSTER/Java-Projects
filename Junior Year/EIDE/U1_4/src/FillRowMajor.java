import java.util.Arrays;

/**
 * @author salam.1
 * Class: FillRowMajor
 * Assignment: U1-4 Part 4
 * Purpose: The purpose of this part is to fill a 2D array in row-major order from a string (breaking down each character of the string to each element of the array).
 *
 * Test Cases:
 * 
 * String: 123
 * 
 * [[1, 2, 3, null, null, null, null, null], [null, null, null, null, null, null, null, null], [null, null, null, null, null, null, null, null], [null, null, null, null, null, null, null, null]]
 * 
 * String: dibbyfreshiscool
 * 
 * [[d, i, b, b, y, f, r, e], [s, h, i, s, c, o, o, l], [null, null, null, null, null, null, null, null], [null, null, null, null, null, null, null, null]]
 * 
 * String: dibdub
 * 
 * [[d, i, b, d, u, b, null, null], [null, null, null, null, null, null, null, null], [null, null, null, null, null, null, null, null], [null, null, null, null, null, null, null, null]]
 */
public class FillRowMajor {

	public static void main(String[] args) {
		
		String[][] array = new String[4][8];
		String string = "dibbyfreshiscool";
		
		int stringIndex = 0;
		
		for (int row = 0; row < array.length; row++){
			
			for (int col = 0; col < array[0].length; col++){
				
				if (stringIndex < string.length()){					
					array[row][col] = string.substring(stringIndex, stringIndex + 1);
				}
				
				stringIndex++;				
			}
		}
		
		System.out.println("Your initial String: " + string);
		System.out.println(Arrays.deepToString(array));
	}

}
