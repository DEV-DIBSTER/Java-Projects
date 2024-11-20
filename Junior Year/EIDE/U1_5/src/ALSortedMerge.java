import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
 * @author salam.1
 * Class: ALSortedMerge
 * Purpose: The purpose of this exercise to remove duplicates from a sorted ArrayList of integers (so that just one copy of each integer remains).
 *
 * Test Cases:
 * 5 - 1 3 5 7 9
 * 4 - 2 4 6 8
 *
 * Content of first arraylist: [1, 3, 5, 7, 9]
 * Content of second arraylist: [2, 4, 6, 8]
 * Contents of merged arraylist: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * 3 - 1 4 7
 * 6 - 1 2 3 5 8 9
 *
 * Content of first arraylist: [1, 4, 7]
 * Content of second arraylist: [1, 2, 3, 5, 8, 9]
 * Contents of merged arraylist: [1, 1, 2, 3, 4, 5, 7, 8, 9]
 *
 * 0 -
 * 3 - 6 4 7
 *
 * Content of first arraylist: []
 * Content of second arraylist: [6, 4, 7]
 * Content of merged arraylist: [4, 6, 7]
 */
public class ALSortedMerge {

    public static void main(String[] args) {

        ArrayList < Integer > al3 = new ArrayList <Integer> (); //Declares the array list as a variable

        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers are on your first list? ");

        int al1count = scan.nextInt(); //Stores the count of integers in the arraylist.

        scan.nextLine();

        System.out.print("Enter your first set of " + al1count + " sorted integers (separated by a space): ");
        ArrayList <Integer> al1 = new ArrayList <Integer> (); //Declares the array list as a variable.

        for (int i = 0; i < al1count; i++) {

            int num = scan.nextInt(); //The number within the scanner.


            al1.add(num);
            al3.add(num);
        }

        scan.nextLine();

        System.out.println();

        System.out.print("How many integers are on your second list? ");

        int al2count = scan.nextInt(); //Stores the count of integers in the arraylist.

        scan.nextLine();

        System.out.print("Enter your second set of " + al2count + " sorted integers (separated by a space): ");


        ArrayList < Integer > al2 = new ArrayList < Integer > (); //Declares the array list as a variable.

        for (int i = 0; i < al2count; i++) {
            int num = scan.nextInt(); //The number within the scanner.

            al2.add(num);
            al3.add(num);
        }

        scan.nextLine();

        System.out.println("\n\nContent of first arraylist: " + al1);
        System.out.println("Content of second arraylist: " + al2);

        int al1counter = 0; //Array 1 counter.
        int al2counter = 0; //Array 2 counter.

        while (al1counter < al1.size() && al2counter < al2.size()){
           
                if (al1.get(al1counter) < al2.get(al2counter)){
                    al3.add(al1.get(al1counter));
                   
                    al1counter++;
                } else if (al2.get(al2counter) < al1.get(al1counter)) {
                    al3.add(al2.get(al2counter));
                   
                    al2counter++;
                } else {
                	//Do Nothing.
                }
        }
       
        System.out.println("Contents of merged arraylist: " + al3);
    }
}
