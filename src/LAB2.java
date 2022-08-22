import java.util.Scanner;// importing scanner

public class LAB2 {
	// Faith Iyere
	// February 06, 2022
	// BINS 5312 - LAB2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);// Adding an Input Device

		// Declare variables
		double purchaseAmount = 0;
		double paymentAmount = 0;
		double taxRate = 8.5;
		double totalAmount = 0;

		// Printing necessary information for purchase amount
		System.out.println("Enter purchase amount >>>>>>>>>");
		purchaseAmount = userInput.nextDouble(); // Using the next double to get user input

//Printing necessary information for payment amount
		System.out.println("Enter payment amount >>>>>>>>>");
		paymentAmount = userInput.nextDouble(); // Using the next double to get user input

		// display output and printing necessary information
		System.out.println("Cost       = " + "$" + purchaseAmount);
		System.out.println("Taxes      = " + "$" + (purchaseAmount * (taxRate / 100)));
		System.out.println("Total Cost = " + "$" + (purchaseAmount + purchaseAmount * (taxRate / 100)));
		totalAmount = purchaseAmount + (purchaseAmount * (taxRate / 100));

		System.out.println("Payment    = " + "$" + paymentAmount);
		System.out.println("Change Amount = " + "$" + (paymentAmount - totalAmount));

	}

}
