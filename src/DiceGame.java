//Faith Iyere
//February 27,2022
//BINS 5312

import javax.swing.JOptionPane;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring variables
		String userInput;
		String msg;
		int dicePlayOption;
		int numRolled;
		double betAmount;
		double betWon;
		int firstDie, secondDie, sumOfDice;

		//using JOptionPane to request for user input
		userInput = JOptionPane.showInputDialog("Enter 1 to Play with 1 Die \nEnter 2 to Play with 2 Dice");
		dicePlayOption = Integer.parseInt(userInput);//Converts inputed integer to string

		if (dicePlayOption == 2)//introduces the if statement
		{
			userInput = JOptionPane.showInputDialog("Welcome to the 2 Die Game! \n"
					+ "How much money do you want to play");//Displays message and collects user input
			betAmount = Double.parseDouble(userInput);//Converts inputed integer to string

			firstDie = (int) (Math.random()*6 + 1);//using the math random to generate numbers from one to six
			secondDie = (int) (Math.random()*6 + 1);//using the math random to generate numbers from 1 to 6
			sumOfDice = firstDie + secondDie;//calculating sumOfDice

			if (sumOfDice == 2 || sumOfDice == 4 || sumOfDice == 10 || sumOfDice == 12)//introduces an if statement  to assign conditions
			{
				betWon = (betAmount * 2);//
				msg = ("You rolled " + firstDie + " and " + secondDie + "\n" +
						"You bet is doubled. You won $" + betWon);
				JOptionPane.showMessageDialog(null, msg); // Displays message to user
			}

			else if (sumOfDice == 6)
			{
				betWon = (betAmount * 3);
				msg = ("You rolled " + firstDie + " and " + secondDie + "\n" +
						"You bet is tripled. You won $" + betWon);
				JOptionPane.showMessageDialog(null, msg);
			}

			else if (sumOfDice == 3 || sumOfDice == 5 || sumOfDice == 7 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 11)//Assigning conditions
			{
				msg = ("You rolled " + firstDie + " and " + secondDie + "\n" +
						"Sorry! You lost all your $" + betAmount + " bet");
				JOptionPane.showMessageDialog(null, msg);
			}
		}

		else if (dicePlayOption == 1)
		{
			userInput = JOptionPane.showInputDialog("Welcome to the 1 Die Game! \n"
					+ "How much money do you want to play");

			betAmount = Double.parseDouble(userInput);//Converts inputted integer to string

			numRolled = (int) (Math.random()*6 + 1);//Using the math random to generate numbers from one to six

			if (numRolled == 1 || numRolled == 2 || numRolled == 3)
			{
				msg = ("You rolled " + numRolled + "\n" +
						"You forfeit your bet of $" + betAmount);
				JOptionPane.showMessageDialog(null, msg);//Displaying message
			}

			else if (numRolled == 4)
			{
				msg = ("You rolled " + numRolled + "\n" +
						"You get back your bet of $" + betAmount);
				JOptionPane.showMessageDialog(null, msg);//Displaying message
			}

			else if (numRolled == 5)
			{
				msg = "You rolled " + numRolled + "\n" +
						"You get half your bet back which is $" + (betAmount/2);
				JOptionPane.showMessageDialog(null, msg);//Displaying message
			}

			else
			{
				msg = "You rolled " + numRolled + "\n" +
						"You bet is doubled! You won $" + (betAmount * 2);
				JOptionPane.showMessageDialog(null, msg); //Displaying message
			}
			}

		else
		JOptionPane.showMessageDialog(null, "Wrong Option! \nSelect 1 or 2.");//Displaying error message

	}

}
