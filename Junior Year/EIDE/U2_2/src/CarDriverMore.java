import java.util.Scanner;

/**
 * Class: CarDriverMore
 * @author salam.1
 * Purpose: Handling inputs with errors.
 * Assignment: U2-2 Part 2
 * Test Cases:
 * 
 * 
 * Checking if works without price.
 * Dodge HellCat 2023
 * 
 * a a a a a a a a a a a a a a a a a a a
 * g
 * 
 * Making sure speed is not going above 100.
 * 
 * b b b b b b b b  b    b b b b b b  b b  b 
 * 
 * Making sure speed is not going below 0.
 * 
 * a a a a a g
 * 50
 * 
 * a a a b b b
 * 0
 * 
 * a a a a a a a a s
 * 0
 * 
 * Making sure speed goes down to 0.
 * 
 * a a a q
 * 30 speed 0 brake
 * 
 * a a a b b q
 * 10 speed 2 brake
 * 
 * a a a s q
 * 0 speed 3 brake
 */
public class CarDriverMore {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); //Declare the scanner class.
		
		System.out.print("What kind of car (make/mfr) woul you like to drive? ");
		
		String mfr = scan.nextLine(); //The mfr of the car.
		
		System.out.print("Indicate the model: ");
		
		String model = scan.nextLine(); //The model of the car.
		
		System.out.print("Indicate the year: ");
		
		int year = Integer.parseInt(scan.nextLine()); //The year of the car.
						
		System.out.print("Indicate the price (or type return to skip): ");
				
		CarMore myCar; //The car's object.
		
		int priceInt; //The price taken from string.		
				
		try {
			priceInt = Integer.parseInt(scan.nextLine());
			
			myCar = new CarMore(year, mfr, model, priceInt);
		} catch (NumberFormatException error) {
			myCar = new CarMore(year, mfr, model);
		}
				
		System.out.println("=============================");		
		System.out.println(myCar);
		System.out.println("=============================");
		
		boolean contLoop = true; //While loop condition.
		int brakeCount = 0; //Counter for brakes.
		
		while (contLoop){
			System.out.print("What would you like to do with the car (a = acc, b = brake, g = get speed, s = stop, q = quit): ");
			
			String input = scan.nextLine(); //The input from the user.
						
			if (input.equals("a")){
				myCar.accelerate();
				
			} else if (input.equals("b")) {
				myCar.brake();
				brakeCount++;
				
			} else if (input.equals("g")) {
				System.out.println("Car speed is now: " + myCar.getSpeed());
				
			} else if (input.equals("s")) {
				while (myCar.getSpeed() > 0){
					myCar.brake();
					brakeCount++;
				}
				
			} else {
				contLoop = false;
				
			};
		}
		
		System.out.println("The final speed of the car was " + myCar.getSpeed() + ". Brakes were applied " + brakeCount + " times.");
	}

}
