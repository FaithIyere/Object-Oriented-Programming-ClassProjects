//Faith Iyere
//February 20, 2022
//BINS 5312 Assignment 5
public class Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring variables
		double contributions = 6000;
		double rate = 0.0425;
		int numofYears = 1;
		double target = 1000000;
		double amount = 0;

		System.out.println("Year" + " " + "Amount Saved"); // Displaying columns

		while (amount < target)// introducing a while loop to execute task until target is met
		{
			amount = contributions * Math.pow(1 + rate, numofYears) + amount;// calculates amount saved

			System.out.println(numofYears + "    $" + String.format("%.2f", amount));// Displays amount calculated
			numofYears++;
		}

		System.out.println(
				"\nIn " + --numofYears + " years my co-worker will have " + "$" + String.format("%.2f", amount)); // displays
																													// final
																													// message
																													// containing
																													// calculated
																													// amount
	}

}
