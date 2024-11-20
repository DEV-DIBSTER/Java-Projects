import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
 * @author salam.1
 * Class: AL3Char
 * Purpose: The purpose of this exercise to work with an ArrayList of Strings such that for every string found that has three characters, it inserts a new element containing a string of three astericks prior to that element.
 * 
 * Test Cases:
 * 
 * Origin: jack, yuvraj, patrick, abdi, henry, dib, robot, trio, car
 * New: jack, yuvraj, patrick, abdi, henry, ***, dib, robot, trio, ***, car
 * 
 * Testing if the last element could properly be handled as well as the first.
 * 
 * Origin: four, letter, words, no, three, letter, words
 * New: four, letter, words, no, three, letter, words
 * 
 * Testing if there are no 3 letter words in the array list.
 * 
 * Original: bed, yuvraj, patrick, abdi, henry, dib, robot, trio, car
 * New: bed, ***, bed, yuvraj, patrick, abdi, henry, ***, dib, robot, trio, ***, car
 * 
 * Testing if there is one at the very beginning of the array list.
 */
public class AL3Char {

	public static void main(String[] args) throws FileNotFoundException {

		
		File file = new File("Char.txt");
		
		Scanner scan = new Scanner(file);
		
		ArrayList <String> origin = new ArrayList <String> (); //Declares the array list as a variable.
		
		while(scan.hasNext()){
			origin.add(scan.next());
		};
		
		System.out.println("Original Arraylist: " + origin);
		
		int index = 0; //The index of the array list.
		
		while (index < origin.size()){
			
			if(origin.get(index).length() == 3){
				origin.add(index, "***");
				index++;
			}			
			
			index++;
		}
		
		System.out.println("New Arraylist: " + origin);
	}

}
