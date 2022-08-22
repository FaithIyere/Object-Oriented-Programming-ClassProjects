
//Faith Iyere
//April 10,2022
//BINS 5312

import java.util.*;
public class DiceGameee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring array and variables
		int[] computer = new int[5];
		int[] player = new int[5];
		Random roll = new Random();
		int computerNum, playerNum = 0;

		// Using the for loop to roll the dice
		for (int i = 0; i < 5; i++)
		{ 
			computer[i] = rollDice();
			player[i] = rollDice();
		}
		
		// calling the get method
		//getRolledDice(computer, "Computer");
		//getRolledDice(player, "Player");

		computerNum = countSameDieRoll(computer); // calling a method for same die count for computer
		playerNum = countSameDieRoll(player); // calling a method for same die count for player

		interpreteRollDice(computerNum, "Computer"); // calling a method for interpret roll dice (Computer)
		interpreteRollDice(playerNum, "Player"); // calling a method for interpret roll dice (player)

	/*	if (computerNum > playerNum)  // Using the if statement to set conditions for when computer wins
		{
		System.out.println("Computer wins"); // printing necessary information
		}
		
		else if (computerNum < playerNum)  // Using the else if to set condition for who won
			
		{
		System.out.println("You won"); // printing necessary information
		}*/
		
		if (computerNum == playerNum && computerNum != 1 && playerNum != 1) // Using the else if to
		// check for a tie
		{
		System.out.println("There is a tie"); // printing necessary information
		}
		}

		public static int rollDice()
		{
		return (int) (1 + (Math.random() * 6)); // Using the math random to generate numbers not more than six and
		}										// starting from one

		public static void getRolledDice(int[] arr, String playerType)  // Writing a method to display the array
		{
			System.out.print(playerType + " rolled: "); // printing necessary information
		
		for (int i = 0; i < arr.length; i++)  // using the for loop to execute condition for dice rolled
		{
			System.out.print(arr[i] + " "); // printing necessary information
		}
			System.out.println(); // printing necessary information
		}

		public static int countSameDieRoll(int[] arr)  // Writing a method to display the array
		{
		int sameDiceCount = 1; // Declaring variable for same dice count
		for (int i = 0; i < arr.length; i++) // Using the for loop to execute condition for same dice count
		{
		int sameDice = 1;
			for (int j = i + 1; j < arr.length; j++)  // Using the for loop to execute condition for same dice
			{
				if (arr[i] == arr[j]) { // Using the if statement to set condition for same dice
					sameDice++;
			}
		}

		if (sameDiceCount < sameDice) // Using the if statement to set condition
		{
		sameDiceCount = sameDice; // setting conditions
		}
		
		}
		return sameDiceCount; // returning value for same dice count
		}

		public static void interpreteRollDice(int count, String playerType) {
		switch (count) { // Using a switch statement to examine entry
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

		System.out.println(playerType + " " + verb + " " + count + " of a kind"); // printing necessary information
		break; // Using the break option to break the flow of codes
		default: // Default option for invalid entry
		break; // Using the break option to break the flow of codes
		} 

	}

}
