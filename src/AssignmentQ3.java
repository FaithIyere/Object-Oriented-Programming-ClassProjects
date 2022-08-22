import java.util.Scanner;//Importing Scanner

public class AssignmentQ3 {
//Faith Iyere
// February 06, 2022
//BINS 5312 Assignment2	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		double hourlyRate = 25.50;// Declaring variables
		double overtimeRate = 38.25;// Declaring variables
		double incometaxpercent = 0.15;// Declaring variables
		double retirementBenefitPercent = 0.05;// Declaring variables
		double healthBenefitPercent = 0.05;// Declaring variables
		double grossPay;// Declaring variables
		double netPay;// Declaring variables
		double incomeTaxDeductions;// Declaring variables
		double retirementBenefitDeductions;// Declaring variables
		double healthBenefitDeductions;// Declaring variables

		System.out.print("Please enter your regular hours:");// Displaying information on regular hour

		Scanner userInput = new Scanner(System.in);// Requesting user information

		double regularHours = userInput.nextDouble();// Requesting user information

		System.out.print("Please enter your overtime hours: ");// Displaying overtime hours

		double overtimeHours = userInput.nextDouble();// Requesting user information

		System.out.println("****************************************************");

		grossPay = (regularHours * hourlyRate) + (overtimeHours * overtimeRate);// To compute gross pay

		System.out.println("Gross Pay is 				$" + String.format("%.2f", grossPay));// Displaying the gross
																								// pay

		healthBenefitDeductions = healthBenefitPercent * grossPay;// compute health benefit deductions

		System.out.println("Health benefit deductions is		$"
				+ String.format("%.2f", healthBenefitDeductions));/*
																	 * Displaying the health benefit deductions
																	 */

		retirementBenefitDeductions = retirementBenefitPercent * grossPay;// to compute retirement benefit deductions

		System.out.println("Retirement benefit deductions is        $"
				+ String.format("%.2f", retirementBenefitDeductions));/*
																		 * Displaying the retirement deductions
																		 */

		incomeTaxDeductions = incometaxpercent * grossPay;// to compute income tax deductions

		System.out.println("Income tax deductions is		$"
				+ String.format("%.2f", incomeTaxDeductions));/*
																 * Displaying the income tax deductions
																 */

		netPay = grossPay - incomeTaxDeductions - healthBenefitDeductions - retirementBenefitDeductions;// computing net
																										// pay

		System.out.println("Net Pay is				$" + String.format("%.2f", netPay));// Displaying the net pay

	}

}
