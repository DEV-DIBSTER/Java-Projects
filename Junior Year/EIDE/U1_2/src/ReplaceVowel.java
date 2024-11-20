import java.util.Scanner;

/**
 * @author salam.1
 * Class: ReplaceVowel
 * Assignment: U1-2 Part 3
 * Purpose: The purpose of this program is to replace all lower case vowels of an inputed string with underscores.
 * 
 * Test Cases:
 * 
 * methods do manually
 * m_th_ds d_ m_n__lly
 * 
 * Jack is a nice person
 * J_ck _s _ n_c_ p_rs_n
 * 
 * yuvraj is mean
 * y_vr_j _s m__n
 * 
 * apples and oranges
 * _ppl_s _nd _r_ng_s
 * 
 * hello tornado
 * 
 * h_ll_ t_rn_d_
 */
public class ReplaceVowel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Declares new scanner class.
		
		System.out.print("Enter a string to be manipulated: ");
		
		final String INPUT = scan.nextLine(); //Stores the user's input as String.
		
		System.out.println("You entered: " + INPUT);
		
		String charString = ""; //Stores the new string for char manipulation.
		String strString = ""; //Stores the new string for string manipulation.
		
		final String VOWELS = "aeiou"; //Store vowels as string.
		
		for (int i = 0; i < INPUT.length(); i++){
			
			int vowelIndex = VOWELS.indexOf(INPUT.charAt(i)); //Stores the vowel index as int.
						
			if (vowelIndex >= 0){
				charString += "_";
			} else {
				charString += INPUT.charAt(i);
			};			
		}
		
		System.out.println("Your new string (using character manipulation) is: " + charString);
		
		for (int i = 0; i < INPUT.length(); i++){
			
			int stringVowelIndex = VOWELS.indexOf(INPUT.substring(i, i + 1));
			
			if (stringVowelIndex >= 0){
				strString += "_";
			} else {
				strString += INPUT.substring(i, i + 1);
			};
		}
		
		scan.close();
		
		System.out.println("Your new string (using string manipulation) is: " + strString);
	}

}
