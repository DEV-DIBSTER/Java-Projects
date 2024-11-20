public class DTRefresh {

	public static void main(String[] args) {
		
		//Part 1:
		System.out.println(5 / 2); //#1
		System.out.println(5 / (double) 2); //#2
		System.out.println((double) 5 / 2); //#3
		System.out.println((double) (5 / 2)); //#4
		System.out.println(5 / 2.0); //#5
		
		
		//Part 2:
		
		//#6
		//int k = 6 + 3.2; //This one because it's not narrow casting with double plus int.
		//System.out.println(k);
		
		int a=9;
		int b=6;
		double c = a + b;
		System.out.println(c);
		
		//#7
		double x = 3.4;
		double y = 4.2;
		//int z = (int) x + y; This one is causing errors due to improper narrow casting.
		//System.out.println(z); This one because of variable comment out earlier.
		
		//#8
		double e= 2.7;
		int f = 5;
		int g = (int) (e+f);
		System.out.println(g);

		//Part 3:
		
		//#9
		System.out.println("APCS" + 8);
		System.out.println("APCS" + 4 + 8);
		System.out.println("APCS" + (4 + 8));
		System.out.println(4 + 8 + "APCS");
	}
	
}
