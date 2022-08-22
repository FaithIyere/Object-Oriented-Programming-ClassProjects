//FAITH IYERE
//FEBRUARY 20,2022
// BINS 5312 Lab 5

public class Tesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring variables
		double yearlySavings = 2000; // Declaring yearly savings
		double interestRate = 0.025; // Initial Compound interest
		int numofYears = 1;
		double MSRP = 75000;// Initial MSRP rate
		double amount = 0;//

		System.out.println("Year" + " " + "Amount Saved");// Displaying necessary information

		while (amount < MSRP) {
			amount = yearlySavings * Math.pow(1 + interestRate, numofYears) + amount;// calculating total savings by
																						// adding needed variables

			System.out.println(numofYears + "    $" + String.format("%.2f", amount));
			numofYears++;
		}

		System.out.println("\nIn year " + --numofYears + " I will have " + "$" + String.format("%.2f", amount));
	}

}
