import java.util.Scanner;
//Faith Iyere
//February 13,2022

public class AcmePay {

	public static void main(String[] args) {

		//Declaring Variable
		double firstShiftRegularPay = 17; 
		double secondShiftRegularPay = 18.50;
		double thirdShiftRegularPay = 22; 
		double retirementPlanrate = 0.03; 
		double retirementDeduction = 0.00; 
		double hoursWorked;
		double firstShiftOvertimePay = 1.5 * firstShiftRegularPay; 
		double secondShiftOvertimePay = 1.5 * secondShiftRegularPay; 
		double thirdShiftOvertimePay = 1.5 * thirdShiftRegularPay; 
		double netPay = 0.00; 
		double grossPay = 0.00; 
		double overtimeHoursWorked = 0.00; 
		double regularPay = 0.00; 
		double overtimePay = 0.00; 
		double regularHoursWorked;
		int shiftNumber;
		double hourlyPayRate = 0.00;
		System.out.print("Please enter the number of hours worked:");
		Scanner userInput = new Scanner(System.in);// Introducing new scanner
		hoursWorked = userInput.nextDouble();// requesting for user input

		if (hoursWorked > 40) // Introducing the if statement in order to make decision

		{
			regularHoursWorked = 40; // Using the if statement to get input for regular hours worked
			overtimeHoursWorked = hoursWorked - 40; // Using the if statement to get input for overtime hours worked

		}

		else // Introducing the if else statement to specify condition

		{

			regularHoursWorked = hoursWorked;// Using the if statement to get input for regular hours worked
			overtimeHoursWorked = 0.00; // Using the if statement to get input for overtime hours worked
		}

		System.out.print("Please enter the shift worked  1 2 3:");// printing necessary information
		Scanner userInput2 = new Scanner(System.in);// introducing new scanner for input
		shiftNumber = userInput2.nextInt();//  requesting for user input

		if (shiftNumber == 1) // introducing the if statement to make decision for shift 1
		{
			regularPay = firstShiftRegularPay * regularHoursWorked; // Making decision in order to get input for Regular
																	// pay
			overtimePay = firstShiftOvertimePay * overtimeHoursWorked; // Making decision in order to get input for
																		// Overtime pay
			grossPay = regularPay + overtimePay; // Making decision in order to get input for Gross pay
			hourlyPayRate = firstShiftRegularPay; // Making decision in order to get input for Hourly pay rate
			netPay = grossPay; // Making decision in order to get input for Net pay
		}

		else if (shiftNumber == 2 || shiftNumber == 3) // Introducing the if else statement to specify condition for
														// shift 2 and 3
		{
			if (shiftNumber == 2) //
			{
				regularPay = secondShiftRegularPay * regularHoursWorked; // Getting input for regular pay
				overtimePay = secondShiftOvertimePay * overtimeHoursWorked;// Getting input for Overtime pay
				grossPay = regularPay + overtimePay; // Getting input for Gross pay
				hourlyPayRate = secondShiftRegularPay; // Getting input for Hourly pay rate
			}

			if (shiftNumber == 3)

			{
				regularPay = thirdShiftRegularPay * regularHoursWorked; // Getting input for regular pay
				overtimePay = thirdShiftOvertimePay * overtimeHoursWorked;// Getting input for Overtime pay
				grossPay = regularPay + overtimePay; // Getting input for Gross pay
				hourlyPayRate = secondShiftRegularPay; // Getting input for Hourly pay rate
			}

			System.out.println("Do you want to elect your retirement? 1 for Yes, 2 for No");
			int electRetirement = userInput2.nextInt();

			if (electRetirement == 1)

			{
				retirementDeduction = retirementPlanrate * grossPay;
				netPay = grossPay - retirementDeduction;
			}

			else if (electRetirement == 2)

			{
				netPay = grossPay;
			}
		}
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Shift: " + shiftNumber);
		System.out.println("Hourly pay rate: " + hourlyPayRate);
		System.out.println("Regular pay: " + regularPay);
		System.out.println("Overtime pay: " + overtimePay);
		System.out.println("Total of regular and overtime pay: " + grossPay);
		System.out.println("Retirement deduction: " + retirementDeduction);
		System.out.println("Net pay: " + netPay);
	}
}
