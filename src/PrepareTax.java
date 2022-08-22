
//Faith Iyere
//April 03,2022
//BINS 5312
import java.util.Scanner;

public class PrepareTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// define scanner and request input

		Scanner input = new Scanner(System.in);
		String sSN = getValidSSN(input);
		System.out.print("Enter your last name: \n");
		String lName = input.nextLine();
		System.out.print("Enter your first name: \n");
		String fName = input.nextLine();
		System.out.print("Enter your address: \n");
		String streetAdd = input.nextLine();
		System.out.print("Enter your city: \n");
		String city = input.nextLine();
		System.out.print("Enter your state: \n");
		String state = input.nextLine();
		String zipCode = getValidZip(input);
		double annualIncome = getValidAnnualIncome(input);
		String mStatus = getValidMaritalStatus(input);

		// creating a TaxReturn object and displaying report
		TaxReturn taxReturn = new TaxReturn(sSN, lName, fName, streetAdd, city, state, zipCode, annualIncome, mStatus);
		taxReturn.display();

	}

	private static String getValidZip(Scanner input) {
		// TODO Auto-generated method stub
		System.out.print("Enter your zip code: \n"); // Printing necessary information
		String zip = input.nextLine(); // Adding a scanner for input
		boolean valid = true; // setting valid to true
		// checking that zip contains 5 digits
		if (zip.length() == 5) { // Using the if statement to set condition for zip length
		for (int i = 0; i < zip.length(); i++) { // Using the for loop to loop through the zip code length
		if (!Character.isDigit(zip.charAt(i))) { // Using the if statement to check condition for zip code
		valid = false; // setting valid to false
		break; // using the break option to break the flow of codes
		}
		}
		} else { // Introducing the else statement
		// set valid to false
		valid = false;
		}

		// check if it is valid
		if (valid) {
		// return the zipcode
		return zip;
		} else {
		// if invalid run the method again recursively
		System.out.println("Invalid zip, try again!");
		return getValidZip(input);
		}
	
	}

	private static String getValidSSN(Scanner input) {
		// TODO Auto-generated method stub
		// initialized valid flag to true
		boolean valid = true;

		// instruction to prompt user for input
		System.out.print("Enter your social security number: \n");
		// prompt user for input
		Scanner userInput = input;
		// assign ssn to a string variable
		String ssn = input.nextLine();
		if (ssn.length() == 11) { // length is valid, now checking for numbers and dashes
		for (int i = 0; i < ssn.length(); i++) {
		// check if dash are present in the right location in the ssn
		if (i == 3 || i == 6) { // should be '-' at these locations
		if (ssn.charAt(i) != '-') { // nope! mismatch found
		// set valid to false if mismatch is found
		valid = false;
		break; // using the break option to break the flow of codes
		}
		} else if (!Character.isDigit(ssn.charAt(i))) { // other characters should be digits
		// set valid to false if no digit is found
		valid = false;
		break;// using the break option to break the flow of codes
		}
		}
		} else {
		valid = false; // not a valid length
		}

		if (valid) {
		return ssn; // if valid, returning ssn
		} else {
		System.out.println("Invalid SSN, try again!"); // otherwise printing error and asking again
		return getValidSSN(input); // simple recursion
		}
	}

	private static double getValidAnnualIncome(Scanner scanner) {
		System.out.print("Enter your annual income: \n");
		double income = Double.parseDouble(scanner.nextLine());
		if (income >= 0) {
			return income;
		} else {
			System.out.println("Invalid income, try again!");
			return getValidAnnualIncome(scanner);

		}
	}

	private static String getValidMaritalStatus(Scanner scanner) {
		System.out.print("Enter your marital status: \n");

		String status = scanner.nextLine();

		if (status.length() > 0 && (status.charAt(0) == 'S' || status.charAt(0) == 'M' || status.charAt(0) == 's'
				|| status.charAt(0) == 'm')) {
			return status;
		} else {
			System.out.println("Invalid marital status, try again!");
			return getValidMaritalStatus(scanner);
		}

	}

	public void display() {
		// TODO Auto-generated method stub

	}
}
