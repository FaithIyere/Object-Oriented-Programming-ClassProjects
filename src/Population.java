//Faith Iyere
//February 20,2022
//BINS 5312 Assignment 5

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring variables
		int numofYears = 1;
		double mexicoPopulation = 128000000, usaPopulation = 323000000;
		double mexRate = 0.0101, usaRate = 0.0015;

		// introducing a while loop to determine when Mexico population exceed US population
		while (usaPopulation > mexicoPopulation) {
			mexicoPopulation = mexicoPopulation + (mexRate * mexicoPopulation); // calculates Mexico's population yearly
			usaPopulation = usaPopulation + (usaRate * usaPopulation); // calculates USA's population yearly

			// Displays yearly Mexico and USA population
			System.out.println(
					"In year " + numofYears + " Mexico population will be " + String.format("%.2f", mexicoPopulation)
							+ " and US population will be " + String.format("%.2f", mexicoPopulation));
			
			System.out.println();
			numofYears++;
		}
		double populationDifference = mexicoPopulation - usaPopulation; // assigns the difference in both populations to
																		// populationDifference
		System.out.println(
				"It took " + --numofYears + " years for the population of Mexico to exceed that of the US with "
						+ String.format("%.2f", populationDifference)); // displays the year Mexico's population exceeds
																		// that of USA
	}

}
