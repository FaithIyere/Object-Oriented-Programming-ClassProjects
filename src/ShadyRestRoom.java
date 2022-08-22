//Author:Faith Iyere
//February 13,2022

import java.util.Scanner;

public class ShadyRestRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice; // Declaring variable
		int roomPrice = 0; // Declaring variable

		System.out.println("Welcome to Shady Rest Hotel");// Welcome message
		System.out.println("Please select any of the following"); // // Requesting user input
		System.out.println("Choose 1 for a queen bed");// displaying options
		System.out.println("Choose 2 for a king bed");// displaying options
		System.out.println("Choose 3 for a king and a pull out couch");// displaying options
		System.out.println("Enter choice of bed");// Requesting user input
		Scanner userInput = new Scanner(System.in);// Adding a new scanner for input
		choice = userInput.nextInt();// Requesting user input

		if (choice == 1) // Introduces the if statement

		{
			roomPrice = 125; // Adding room price option
			System.out.println("You have selected the queen bed");// Displaying user preference
			System.out.println("price of queen bed is $" + roomPrice); // Displaying cost
		}

		else if (choice == 2) // Introduces the else if statement

		{
			roomPrice = 139;// Adding room price option
			System.out.println("You have selected a king bed");// Displaying user preference
			System.out.println("price of king bed is $" + roomPrice);// Displaying cost
		}

		else if (choice == 3) // Introduces the if else statement

		{
			roomPrice = 165; // Adding room price option
			System.out.println("You have selected a king bed and Pull out couch");// Displaying user preference
			System.out.println("price of a king bed and Pull out couch is $" + roomPrice);// Displaying cost
		}

		else // Introduces the else statement

		{
			roomPrice = 0; // Calculating room price of an invalid request
			System.out.println("Invalid request");// prompting user with a response if selection is neither 1, 2, or 3
			System.out.println("Price: " + roomPrice);// prompting user with price of an invalid request
		}

	}

}
