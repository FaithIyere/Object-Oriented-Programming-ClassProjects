
//Faith Iyere
//February 13,2022
import java.util.Scanner;

public class ShadyRestRoom2 {

	public static void main(String[] args) {

		int choice;// Declaring variable
		int roomPrice = 0; // Declaring variable
		String additionalRequest; // Declaring variable

		System.out.println("Welcome to Shady Rest Hotel");// Welcome message
		System.out.println("Please select any of the following"); // Requesting user input
		System.out.println("Choose 1 for a queen bed");// displaying options
		System.out.println("Choose 2 for a king bed");// displaying options
		System.out.println("Choose 3 for a king and a pull out couch");// displaying options
		System.out.println("Enter choice of bed");// Requesting user input
		Scanner userInput = new Scanner(System.in);// Adding a new scanner for input
		choice = userInput.nextInt();// requesting user input
		Scanner userInput2 = new Scanner(System.in);// Adding new scanner for input

		if (choice == 1) // Introduces the if statement to make decision

		{
			roomPrice = 125; // Adding room price option
			System.out.println("Press 1 for lake view or 2 for Park view");// displaying options

			additionalRequest = userInput2.nextLine();// requesting for user input
			switch (additionalRequest) // Using the switch statement to make Additional request
			{
			case "1": // Adding case one option
				roomPrice = roomPrice + 15;// Calculating room price plus view option value
				break; // Adding a break option

			case "2":// Adding case two option
				break;// Adding a break option

			default: // Adding default for invalid request
				System.out.println("Invalid option provided. Assuming a lake view option"); // Printing necessary
																							// information
				roomPrice = roomPrice + 15; // Calculating room price plus view option value
				break;// Adding a break option

			}

			System.out.println("You have selected the queen bed");// Displaying user preference
			System.out.println("price of queen bed is $" + roomPrice); // prompting user with price of selection"

		}

		else if (choice == 2)// Introducing the else if statement to make decision

		{
			roomPrice = 139;// Adding room price option
			System.out.println("Press 1 for lake view or 2 for Park view"); // Prompting user for input
			additionalRequest = userInput2.nextLine(); // Prompting user for input
			switch (additionalRequest)// Using the switch statement to make a case for Additional option
			{

			case "1": // Adding case one option
				roomPrice = roomPrice + 15; // Calculating room price plus view option value
				break; // Adding a break option

			case "2": // Adding case two option
				break; // Adding a break option

			default: // Adding default for invalid request
				System.out.println("Invalid option provided. Assuming a lake view option"); // Printing necessary
																							// information
				roomPrice = roomPrice + 15;// Calculating room price plus view option value
				break; // Adding a break option

			}

			System.out.println("You have selected a king bed");// Displaying user preference
			System.out.println("price of king bed is $" + roomPrice);// Displaying cost

		}

		else if (choice == 3) // Introducing the else if statement

		{

			roomPrice = 165;// Adding room price option
			System.out.println("Press 1 for lake view or 2 for Park view");// Printing necessary information
			additionalRequest = userInput2.nextLine(); // prompting user for input
			switch (additionalRequest) // Introducing the switch statement to make decision

			{

			case "1": // Adding case one option
				roomPrice = roomPrice + 15;// Calculating room price plus view option value
				break; // Inserting a break

			case "2": // Adding case two option
				break; // Inserting a break

			default: // Adding default for invalid request
				System.out.println("Invalid option provided. Assuming a lake view option"); // Printing necessary
																							// information
				roomPrice = roomPrice + 15;// Calculating room price plus view option value
				break; // Inserting a break

			}

			System.out.println("You have selected a king bed and Pull out couch");// Displaying user preference
			System.out.println("price of a king bed and Pull out couch is $" + roomPrice);// Displaying cost

		}

		else // Introducing the else statement

		{
			roomPrice = 0; // Calculating room price with an invalid request
			System.out.println("Invalid Request");// prompting user with a response if selection is neither 1, 2, or 3
			System.out.println("Price: " + roomPrice);// display invalid request

		}
	}
}
