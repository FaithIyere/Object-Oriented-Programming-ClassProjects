//Faith Iyere
//February 20,2022
//BINS 5312 Assignment 5
public class IncreasedProduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring Variables
		int period = 1;
		int raiseLevelCount = 0;
		double growthRate = 0.06;
		double quantity = 4000;
		double raiseLevel = 7000;

		while (period < 25)// introducing the while loop to execute task for as long as condition is met
		{
			quantity = (quantity + (quantity * growthRate));// calculates quantity
			System.out.println("In month " + period + " quantity produced will be " + String.format("%.2f", quantity));// displays
																														// calculated
																														// quantity

			period++;

			if (quantity >= raiseLevel && raiseLevelCount < 1)// assigning a condition using the if statement
			{
				System.out.println();
				System.out.println("In month " + --period + " quantity produced will exceed 7000 parts.");
				System.out.println();
				raiseLevelCount++;
				period++;
			}

		}

	}
}
