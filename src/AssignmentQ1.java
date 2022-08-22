import java.util.Scanner; // Importing scanner
//Faith Iyere
// February 06, 2022
//BINS 5312 Assignment 2

public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);// Adding an Input device
		String lastName; //Declaring variable
		String emailAddress; // Declaring Variable
		int yourSelection;// Declaring Variable

		System.out.println("Welcome to the Trojan Cafe Meal Plan Options: Select One Option");
		System.out.println("");
		System.out.println("1. CARTE UNLIMITED PLUS + $75 EXPRESS DOLLARS - $1925 per semester");
		System.out.println("2. 244 BLOCK + $500 EXPRESS DOLLARS - $1730 per semester");
		System.out.println("3. 128 BLOCK + $500 TROJAN EXPRESS DOLLARS - $1445 per semester");

		System.out.println("Enter your selection (1,2,3) >>>>>>>>>"); System.out.print("\n");// collecting user input
		yourSelection = userInput.nextInt();// Adding relevant information for selection
		Scanner userInput2 = new Scanner(System.in);// Adding an Input device

		System.out.println("Enter your Last Name >>>>>>>>>");// Collecting user input
		lastName = userInput2.nextLine();

		System.out.println("Enter your email address >>>>>>>>>");
		emailAddress = userInput2.nextLine();

		System.out.println("\n");

		// display output
		System.out.println("Meal Plan Option : " + yourSelection);
		System.out.println("Last Name :" + lastName);
		System.out.println("EmailAddress : " + emailAddress);

	}

}
