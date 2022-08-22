//Faith Iyere
//April 10,2022
//BINS 5312

import java.util.*;
public class FiveDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring array and variables
		int[] computer = new int[5];
		int[] player = new int[5];
		int computerNum, playerNum = 0;

		// Using the for loop to roll the dice
		for (int i = 0; i < 5; i++)
		{ 
			computer[i] = rollDice();
			player[i] = rollDice();
		}
		
		// calling the get method
		getRolledDice(computer, "Computer");
		getRolledDice(player, "Player");

		computerNum = countSameDieRoll(computer); // calling a method for same die count for the computer
		playerNum = countSameDieRoll(player); // calling a method for same die count for the player

		interpreteRollDice(computerNum, "Computer"); // calling a method for interpret roll dice for the Computer
		interpreteRollDice(playerNum, "Player"); // calling a method for interpret roll dice for the player

		if (computerNum > playerNum)  // Using if statement to set conditions when computer wins
		{
		System.out.println("Computer wins"); // displays information
		}
		
		else if (computerNum < playerNum)  // Using the else if to set condition for when player wins
			
		{
		System.out.println("You win"); // displays information
		}
		
		if (computerNum == playerNum && computerNum != 1 && playerNum != 1) // Using the else if to
																			// check for a tie
		{
		System.out.println("There is a tie"); // displays information
		}
		}

		public static int rollDice()
		{
		return (int) (1 + (Math.random() * 6)); // Using the math random to generate numbers between one and six
		}										

		public static void getRolledDice(int[] diceroll, String playerType)  // Writing a method to display the array
		{
			System.out.print(playerType + " rolled: "); // displays information
		
		for (int i = 0; i < diceroll.length; i++)  // using the for loop to execute condition for dice rolled
		{
			System.out.print(diceroll[i] + " "); //displays information
		}
			System.out.println(); // displays information
		}

		public static int countSameDieRoll(int[] diceroll)  // Writing a method to display the array
		{
		int sameDiceCount = 1; // Declaring variable for same dice count
		for (int i = 0; i < diceroll.length; i++) // Using the for loop to execute condition for same dice count
		{
		int sameDice = 1;
			for (int j = i + 1; j < diceroll.length; j++)  // Using the for loop to execute condition for same dice
			{
				if (diceroll[i] == diceroll[j]) { // Using the if statement to set condition for same dice
					sameDice++;
			}
		}

		if (sameDiceCount < sameDice) // Using the if statement to set condition
		{
		sameDiceCount = sameDice;
		}
		
		}
		return sameDiceCount; // returning value for same dice count
		}

		public static void interpreteRollDice(int count, String playerType) {
		switch (count) { // Using a switch statement to examine entry and run through loop
		case 2:
		case 3: 
		case 4: 
		case 5: 
		String verb = "";
		if (playerType.contains("Computer")) // Using the if statement to set condition for computer
		{
		verb = "has"; // setting condition
		}

		if (playerType.contains("Player")) // Using the if statement to set condition for player
		{
		verb = "have"; // setting condition
		}

		System.out.println(playerType + " " + verb + " " + count + " of a kind"); // Displays information
		break; // Using the break option to break the codes
		default: // Default option for invalid entry
		break; // Using the break option to break the codes
		} 

	}

}
