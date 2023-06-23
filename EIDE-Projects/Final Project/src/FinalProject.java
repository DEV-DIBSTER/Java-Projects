import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author salam.1
 * Assignment: FinalProject - Dice Game
 * Version: 3
 * ClassName: FinalProject
 * 
 * Test Cases:
 * ---
 * TEST CASE #1
 *
 * This test case creates the exact same value of four a kind. Double tie.
 * 
 * Player 1 Dice Value: | 1 | 1 | 1 | 1 | 2 | 2 | 
 * Player 2 Dice Value: | 1 | 1 | 1 | 1 | 2 | 2 | 
 * 
 * Player Arrays: 
 * Player 1: [3, 1, -1]
 * Player 2: [3, 1, -1]
 * 
 * Both players had the same hand type of fourKind! Moving to tie breaker.
 * Neither player 1 or player 2 wins, as the tie breaker values are the same. Tie after tie breaker.
 * ---
 * TEST CASE #2
 * 
 * This test case creates two four a kind values. Player 1 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 3 | 3 | 3 | 3 | 2 | 2 | 
 * Player 2 Dice Value: | 1 | 1 | 1 | 1 | 2 | 2 | 
 * 
 * Player Arrays: 
 * Player 1: [3, 3, -1]
 * Player 2: [3, 1, -1]
 * 
 * Both players had the same hand type of fourKind! Moving to tie breaker.
 * Player 1 wins! Tie breaker is 3 which is greater than player 2's value of 1!
 * ---
 * TEST CASE #3
 * 
 * This test case creates two four a kind values. Player 2 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 1 | 1 | 1 | 1 | 2 | 2 | 
 * Player 2 Dice Value: | 3 | 3 | 3 | 3 | 2 | 2 | 

 * Player Arrays: 
 * Player 1: [3, 1, -1]
 * Player 2: [3, 3, -1]
 * 
 * Both players had the same hand type of fourKind! Moving to tie breaker.
 * Player 2 wins! Tie breaker is 3 which is greater than player 1's value of 1!
 * ---
 * TEST CASE #4
 * 
 * This test case creates two exact same fullHouse values. Double tie.
 * 
 * Player 1 Dice Value: | 3 | 3 | 3 | 2 | 2 | 1 |
 * Player 2 Dice Value: | 3 | 3 | 3 | 2 | 2 | 1 |
 * 
 * Player Arrays: 
 * Player 1: [2, 3, 2]
 * Player 2: [2, 3, 2]
 * 
 * Both players had the same hand type of fourKind! Moving to tie breaker.
 * Neither player 1 or player 2 wins, as the tie breaker values are the same. Tie after tie breaker.
 * ---
 * TEST CASE #5
 * 
 * This test case creates two fullHouse values. Player 1 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 5 | 5 | 5 | 2 | 2 | 1 |
 * Player 2 Dice Value: | 3 | 3 | 3 | 2 | 2 | 1 |

 * Player Arrays: 
 * Player 1: [2, 5, 2]
 * Player 2: [2, 3, 2]
 * 
 * Both players had the same hand type of fullHouse! Moving to tie breaker.
 * Player 1 wins! Tie breaker is 5 which is greater than player 2's value of 2!
 * ---
 * TEST CASE #6
 * 
 * This test case creates two fullHouse values. Player 2 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 3 | 3 | 3 | 2 | 2 | 1 | 
 * Player 2 Dice Value: | 5 | 5 | 5 | 2 | 2 | 1 | 
 * 
 * Player Arrays: 
 * Player 1: [2, 3, 2]
 * Player 2: [2, 5, 2]
 * 
 * Both players had the same hand type of fullHouse! Moving to tie breaker.
 * Player 2 wins! Tie breaker is 5 which is greater than player 1's value of 3!
 * ---
 * TEST CASE #7
 * 
 * This test case creates two exact same twoPairs values. Double tie.
 * 
 * Player 1 Dice Value: | 3 | 3 | 1 | 1 | 4 | 5 |
 * Player 2 Dice Value: | 3 | 3 | 1 | 1 | 4 | 5 | 
 * 
 * Player Arrays: 
 * Player 1: [1, 3, 1]
 * Player 2: [1, 3, 1]
 * 
 * Both players had the same hand type of fourKind! Moving to tie breaker.
 * Neither player 1 or player 2 wins, as the tie breaker values are the same. Tie after tie breaker.
 * ---
 * TEST CASE #8
 * 
 * This test case creates two twoPairs values. Player 1 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 4 | 4 | 1 | 1 | 2 | 5 | 
 * Player 2 Dice Value: | 3 | 3 | 1 | 1 | 4 | 5 | 

 * Player Arrays: 
 * Player 1: [2, 5, 2]
 * Player 2: [2, 3, 2]
 * 
 * Both players had the same hand type of fullHouse! Moving to tie breaker.
 * Player 1 wins! Tie breaker is 4 which is greater than player 2's value of 3!
 * ---
 * TEST CASE #9
 * 
 * This test case creates two twoPairs values. Player 2 has the higher one, resulting in their win.
 * 
 * Player 1 Dice Value: | 3 | 3 | 1 | 1 | 2 | 5 |
 * Player 2 Dice Value: | 4 | 4 | 1 | 1 | 3 | 5 |
 * 
 * Player Arrays: 
 * Player 1: [1, 3, 1]
 * Player 2: [1, 4, 1]
 * 
 * Both players had the same hand type of fullHouse! Moving to tie breaker.
 * Player 2 wins! Tie breaker is 4 which is greater than player 1's value of 3!
 * ---
 * TEST CASE #10
 * 
 * This test case creates two default hands. No winner is found.
 * 
 * Player 1 Dice Value: | 1 | 2 | 3 | 4 | 5 | 6 |
 * Player 2 Dice Value: | 1 | 2 | 3 | 4 | 5 | 6 |
 * 
 * Player 1: [0, 0, 0]
 * Player 2: [0, 0, 0]
 * 
 * Both players had the same hand type of none! Moving to tie breaker.
 * Neither player 1 or player 2 wins, as no hand type was found.
 * ---
 */

public class FinalProject {
	//==========================================================================
	//Global Variables:
	
	private static int[] diceSet; //Stores the diceSet as a variable.

	//==========================================================================

	private static int radNum() {
		Random random = new Random(); //Set up random object.

		int rand = random.nextInt(6) + 1; //Gets random number on dice roll.
		
		return rand;
	}

	//==========================================================================
	
	//Show the current dice and their positions.
	private static void showDice(int playerNum){
		System.out.println("==========================================");
		
		String output = "| ";
		
		for (int i = 0; i < diceSet.length; i++){
			output += diceSet[i] + " | ";
		}
		
		System.out.println("Player " + playerNum + ": HERE IS YOUR DICE VALUES!" + "\n\n");
		System.out.println("Your current dice set:");
		System.out.println("Position:   | 1 | 2 | 3 | 4 | 5 | 6 | ");
		System.out.println("Dice Value: " + output);
				
		System.out.println("==========================================");
	} 
		
	//==========================================================================
	
	//Sets the dice based on input.
	private static void setDice(String binary){
		for (int i = 0; i < binary.length(); i++){
			String isChange = binary.substring(i, i + 1);
			
			if (isChange.equals("0")){
				//Do nothing.
			} else if (isChange.equals("1")) {
				diceSet[i] = radNum();
			} else {
				//This should not happen, means number is not 0 or 1.
				//Do nothing.
			}
		}
	}
	
	//==========================================================================

	//Checks if there is any Two Pairs.
	private static int[] checkTwoPairs(int[] values){
		//======================================================================
		//Setting up variables:
		
		int[] counter = new int[6];				//Counter stores the number of duplicates.		
		int[] playerData = new int[3];			//The data you will return playerData.
		int highestPair = 0;					//Highest pair is stored as the number.
		int lowestPair = 0;						//Lowest pair is stored as the number.
		int pairCount = 0;						//The total number of pairs.
		
		//This loop sets all the values according to their array.
		for (int i = 0; i <= diceSet.length - 1; i++){
			counter[diceSet[i] - 1]++;
		}
		
		//This checks for the number of pairs.
		for  (int j = 0; j <= counter.length - 1; j++){
			//This finds the lowest pair.
			if(lowestPair == 0){
				if (counter[j] >= 2){
					lowestPair = j + 1;
				} else {
					//Do nothing, as there is no pair found.
				}
			} else {
				//Do nothing, as we already found the lowest pair.
			}
			
			//Finds the count and highest pair number.
			if (counter[j] >= 2){
				pairCount++;
				highestPair = j + 1;
			} else {
				//Do nothing, as there is no pair found.
			}
		}
		
		//Final return statements.
		if(pairCount >= 2){
			playerData[0] = 1;
			playerData[1] = highestPair;
			playerData[2] = lowestPair;
			
			return playerData;
		} else {
			//This means that 2 identical pairs were not found.
			//I'll be returning the default values.
			return values;
		}		
	}
	
	//==========================================================================

	private static int[] checkFullHouse(int[] values){
		//======================================================================
		//Setting up variables:
		
		int[] counter = new int[6];				//Counter stores the number of duplicates.		
		int[] playerData = new int[3];			//The data you will return playerData.
		int pairVal = 0;						//The pair value as int.
		int trioVal = 0;						//The trio value as int.s
		
		//This loop sets all the values according to their array.
		for (int i = 0; i <= diceSet.length - 1; i++){
			counter[diceSet[i] - 1]++;
		}
		
		//Checks for the trio and duo pair.
		for (int j = counter.length - 1; j >= 0; j--){
			
			if (counter[j] >= 3 && trioVal == 0){
				trioVal = j + 1;
			} else if(counter[j] >= 2 && pairVal == 0) {
				pairVal = j + 1;
			} else {
				//Do nothing, as all conditions have been met.
			}
		}
				
		//Checks if pair and trio was found, if not, return normal values.
		if (pairVal != 0 && trioVal != 0){
			playerData[0] = 2;
			playerData[1] = trioVal;
			playerData[2] = pairVal;
			
			return playerData;
		} else {
			//FullHouse conditions were not met, therefore we return default values.
			return values;
		}
	}
	
	//==========================================================================

	private static int[] checkFourKind(int[] values){
		//======================================================================
		//Setting up variables:
		
		int[] counter = new int[6]; 			//Counter stores the number of duplicates.
		int[] playerData = new int[3];			//The data you will return playerData.
		int number = 0;							//The number of the set of 4.	
		
		//This loop sets all the values according to their array.
		for (int i = 0; i <= diceSet.length - 1; i++){
			counter[diceSet[i] - 1]++;
		}
		
		//This checks for the number of 4 sets.
		for  (int j = 0; j <= counter.length -1; j++){
			if (counter[j] >= 4){
				number = j + 1;
			}
		}
				
		//This means we did find a set of 4.
		if (number != 0){
			playerData[0] = 3;
			playerData[1] = number;
			playerData[2] = -1;
			
			return playerData;
		} else {
			//We didn't find a set of 4.
			//We will just return the default values.
			
			return values;
		}
	}
	
	//==========================================================================
	
	//Determine the type of hand from the player.
	private static String handType(int handType){
		String type = ""; //Stores the type as string which is then returned.
		
		if(handType == 0) {
			type = "none";
		} else if (handType == 1) {
			type = "twoPair";
		} else if (handType == 2) {
			type = "fullHouse";
		} else if (handType == 3) {
			type = "fourKind";
		}
		
		return type;
	}
	
	//==========================================================================

	public static void main(String[] args) {
		//==========================================================================
		//Instructions:
		System.out.println("Welcome to Dice Roll! Created by Adib Salam.");
		System.out.println("\nEach player will start with 6 random dice. You can reroll up to 6 of your dice.");
		System.out.println("\nThe results of each dice roll is displayed. The player is shown at the very top of the dice roll.");
		System.out.println("\nAfter each player is done, the results of the dice are shown, and the winner will be displayed!");
		System.out.println("\n");

		//==========================================================================
		//Setting up variables:
		
		Scanner scan = new Scanner(System.in); //Setting up the scanner object.
	               
		diceSet = new int[6];
		
		//Stores user data. Save for later.
		int[] player1 = new int[3];
		int[] player2 = new int[3];
		
		//==========================================================================
		//Player 1 Plays:
		
		setDice("111111"); //Initial random values for the dice.
		
		//TO BE REMOVED. USED ONLY TO VERIFY TEST CASES.
//		diceSet[0] = 1;
//		diceSet[1] = 2;
//		diceSet[2] = 3;
//		diceSet[3] = 4;
//		diceSet[4] = 5;
//		diceSet[5] = 6;
		
		showDice(1);
		
		System.out.print("\nHow many dice do you want to reroll? ");
		
		int rerollCount = scan.nextInt(); //The number of dice I want to reroll.
		
		scan.nextLine(); //Consumes next line character.
		
		if(rerollCount > 6){
			System.out.println("\nPlease provide a number between 1 and 6.");
		} else {
			
			String[] reRollList = new String[6]; //The list of values that need to be rerolled.
			reRollList[0] = "0";
			reRollList[1] = "0";
			reRollList[2] = "0";
			reRollList[3] = "0";
			reRollList[4] = "0";
			reRollList[5] = "0";
			
			for (int i = 0; i <= rerollCount - 1; i++){
				System.out.print("Please type the position of the dice you want to reroll: ");
				
				reRollList[scan.nextInt() - 1] = "1";
				
				scan.nextLine(); //Consumes next line character.
			}
			
			setDice(String.join("", reRollList));
		}
				
		showDice(1);
		
		//If any of these conditions happened, they will overwrite the array, if not, returns default.
		player1 = checkTwoPairs(player1);
		player1 = checkFullHouse(player1);
		player1 = checkFourKind(player1);
				
		//==========================================================================
		//Player 2 Plays:
		
		setDice("111111"); //Initial random values for the dice.
		
		//TO BE REMOVED. USED ONLY TO VERIFY TEST CASES.
//		diceSet[0] = 1;
//		diceSet[1] = 2;
//		diceSet[2] = 3;
//		diceSet[3] = 4;
//		diceSet[4] = 5;
//		diceSet[5] = 6;
		
		showDice(2); //Displays the dice for player one.
		
		System.out.print("\nHow many dice do you want to reroll? ");
		
		int rerollCount2 = scan.nextInt(); //The number of dice I want to reroll.
			
		if(rerollCount2 > 6){
			System.out.println("\nPlease provide a number between 1 and 6.");
		} else {
			
			String[] reRollList2 = new String[6]; //The list of values that need to be rerolled.
			reRollList2[0] = "0";
			reRollList2[1] = "0";
			reRollList2[2] = "0";
			reRollList2[3] = "0";
			reRollList2[4] = "0";
			reRollList2[5] = "0";
			
			for (int i = 0; i <= rerollCount2 - 1; i++){
				System.out.print("Please type the position of the dice you want to reroll: ");
				
				reRollList2[scan.nextInt() - 1] = "1";
				
				scan.nextLine(); //Consumes next line character.
			}
			
			setDice(String.join("", reRollList2));
		}
				
		showDice(2);
		
		//If any of these conditions happened, they will overwrite the array, if not, returns default.
		player2 = checkTwoPairs(player2);
		player2 = checkFullHouse(player2);
		player2 = checkFourKind(player2);
				
		//==========================================================================
		//Final Stuff:
		
		//Printing out the two player arrays.
		System.out.println("Player Arrays:");
		System.out.println("Player 1: " + Arrays.toString(player1));
		System.out.println("Player 2: " + Arrays.toString(player2) + "\n\n");
				
		//Check if player 1 hand-type is greater than player 2.
		if(player1[0] > player2[0]) {
			System.out.println("Player 1 wins! They had a hand of: " + handType(player1[0]));
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("    ____  __                         ___   _       _______   _______ __\n"
					+ "   / __ \\/ /___ ___  _____  _____   <  /  | |     / /  _/ | / / ___// /\n"
					+ "  / /_/ / / __ `/ / / / _ \\/ ___/   / /   | | /| / // //  |/ /\\__ \\/ / \n"
					+ " / ____/ / /_/ / /_/ /  __/ /      / /    | |/ |/ // // /|  /___/ /_/  \n"
					+ "/_/   /_/\\__,_/\\__, /\\___/_/      /_/     |__/|__/___/_/ |_//____(_)   \n"
					+ "              /____/                                                   ");
			System.out.println("----------------------------------------------------------------------------");
			
		//Check if player 1 hand-type is greater than player 2.
		} else if (player2[0] > player1[0]) {
			System.out.println("Player 2 wins! They had a hand of: " + handType(player2[0]));
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("    ____  __                         ___      _       _______   _______ __\n"
					+ "   / __ \\/ /___ ___  _____  _____   |__ \\    | |     / /  _/ | / / ___// /\n"
					+ "  / /_/ / / __ `/ / / / _ \\/ ___/   __/ /    | | /| / // //  |/ /\\__ \\/ / \n"
					+ " / ____/ / /_/ / /_/ /  __/ /      / __/     | |/ |/ // // /|  /___/ /_/  \n"
					+ "/_/   /_/\\__,_/\\__, /\\___/_/      /____/     |__/|__/___/_/ |_//____(_)   \n"
					+ "              /____/                                                      ");
			System.out.println("----------------------------------------------------------------------------");
			
		//This means both player types are the same.
		} else {
			//This means both values are equal to each other. We go into tie breaker.
			System.out.println("Both players had the same hand type of " + handType(player1[0]) + "! Moving to tie breaker.");
			
			String tieBreakerValue = ""; //Stores tie breaker value.

			if(player1[0] == 0) {
				tieBreakerValue = ""; //Nothing changes.
			} else if (player1[0] == 1) {
				tieBreakerValue = "(highest pair)"; //Highest pair.
			} else if (player1[0] == 2) {
				tieBreakerValue = "(trio value)"; //Trio value.
			} else if (player1[0] == 3) {
				tieBreakerValue = "(four of a kind)"; //Four of a kind.
			} else {
				//Do nothing, as there is no other possible values.
				//This would mean the number isn't 0, 1, 2, or 3 which isn't possible.
			}
			
			//We now check the type of hand to determine how we settle this tie.
			if(player1[0] == 0) {
				System.out.println("Neither player 1 or player 2 wins, as no hand type was found.");
				
			//If both players have twoPairs, fullHouse or four of a kind.
			} else if (player1[0] == 1 || player1[0] == 2 || player2[0] == 3) {
				
				//If player 1 has higher tie breaker value then player 2.
				if(player1[1] > player2[1]) {
					System.out.println("Player 1 wins! Tie breaker " + tieBreakerValue + " is " + player1[1] + " which is greater than player 2's value of " + player2[1] + "!");
					
					System.out.println("----------------------------------------------------------------------------");
					System.out.println("    ____  __                         ___   _       _______   _______ __\n"
							+ "   / __ \\/ /___ ___  _____  _____   <  /  | |     / /  _/ | / / ___// /\n"
							+ "  / /_/ / / __ `/ / / / _ \\/ ___/   / /   | | /| / // //  |/ /\\__ \\/ / \n"
							+ " / ____/ / /_/ / /_/ /  __/ /      / /    | |/ |/ // // /|  /___/ /_/  \n"
							+ "/_/   /_/\\__,_/\\__, /\\___/_/      /_/     |__/|__/___/_/ |_//____(_)   \n"
							+ "              /____/                                                   ");
					System.out.println("----------------------------------------------------------------------------");
					
				//If player 2 has higher tie breaker then player 1.
				} else if (player2[1] > player1[1]){
					System.out.println("Player 2 wins! Tie breaker " + tieBreakerValue + " is " + player2[1] + " which is greater than player 1's value of " + player1[1] + "!");
				
					System.out.println("----------------------------------------------------------------------------");
					System.out.println("    ____  __                         ___      _       _______   _______ __\n"
							+ "   / __ \\/ /___ ___  _____  _____   |__ \\    | |     / /  _/ | / / ___// /\n"
							+ "  / /_/ / / __ `/ / / / _ \\/ ___/   __/ /    | | /| / // //  |/ /\\__ \\/ / \n"
							+ " / ____/ / /_/ / /_/ /  __/ /      / __/     | |/ |/ // // /|  /___/ /_/  \n"
							+ "/_/   /_/\\__,_/\\__, /\\___/_/      /____/     |__/|__/___/_/ |_//____(_)   \n"
							+ "              /____/                                                      ");
					System.out.println("----------------------------------------------------------------------------");

				//If player 1 and player 2 have the same tie breaker value.
				} else {
					System.out.println("Neither player 1 or player 2 wins, as the tie breaker values are the same. Tie after tie breaker.");
				}
				
			/*
			//If both players have twoPairs.
			} else if (player1[0] == 1) {
				
				//If player 1 has higher pair value then player 2.
				if(player1[1] > player2[1]) {
					System.out.println("Player 1 wins! Highest pair is " + player1[1] + " which is greater than player 2's value of " + player2[1] + "!");
					
				//If player 2 has higher pair then player 1.
				} else if (player2[1] > player1[1]){
					System.out.println("Player 2 wins! Highest pair is " + player2[1] + " which is greater than player 1's value of " + player1[1] + "!");
				
				//If player 1 and player 2 have the same tie breaker value.
				} else {
					System.out.println("Neither player 1 or player 2 wins. Tie after tie breaker.");
				}
			
			//If both players have fullHouse.
			} else if (player1[0] == 2) {
				
				//If player 1 has higher trio value then player 2.
				if(player1[1] > player2[1]) {
					System.out.println("Player 1 wins! Trio value is " + player1[1] + " which is greater than player 2's value of " + player2[1] + "!");
					
				//If player 2 has higher trio value then player 1.
				} else if (player2[1] > player1[1]){
					System.out.println("Player 2 wins! Trio value is " + player2[1] + " which is greater than player 1's value of " + player1[1] + "!");
				
				//If player 1 and player 2 have the same trio value.
				} else {
					System.out.println("Neither player 1 or player 2 wins. Tie after tie breaker.");
				}
				
			//If both players have four of a kind.
			} else if (player1[0] == 3) {
				
				//If player 1 has higher 4 of a kind value then player 2.
				if(player1[1] > player2[1]) {
					System.out.println("Player 1 wins! Four of a kind value is " + player1[1] + " which is greater than player 2's value of " + player2[1] + "!");
					
				//If player 2 has higher 4 of a kind value then player 1.
				} else if (player2[1] > player1[1]){
					System.out.println("Player 2 wins! Four of a kind value is " + player2[1] + " which is greater than player 1's value of " + player1[1] + "!");
				
				//If player 1 and player 2 have the same four of a kind value.
				} else {
					System.out.println("Neither player 1 or player 2 wins. Tie after tie breaker.");
				}
			*/
			
			} else {
				//This means the type isn't valid. Shouldn't occur.
				//Do nothing.
			}
		}
		
        scan.close(); //Closing scanner object.
	}
}