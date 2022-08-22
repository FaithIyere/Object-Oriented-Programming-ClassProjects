//Faith Iyere
//03/06/2022
//BINS 5312 ASSIGNMENT5

import java.util.Scanner; //Import Scanner
public class JobPricing {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Define variables
		String jobName;
		double costOfMaterials, hoursWorked, hoursTravelled;
		double jobEstimate, totalJoBEstimate, salesTax;

		Scanner input = new Scanner (System.in);

		//input data
		System.out.println("What is the name of the job(for example, Smith bathroom remodel)? >>>");
		jobName = input.nextLine();

		System.out.println("What is the cost of materials? >>>");
		costOfMaterials = input.nextDouble();

		System.out.println("How many hours are required for the work? >>>");
		hoursWorked = input.nextDouble();

		System.out.println("Travel Hour Time? >>>");
		hoursTravelled = input.nextDouble();
		
		//calling method
		jobEstimate = JobEstimate(costOfMaterials, hoursWorked, hoursTravelled);
		salesTax = 0.075 * jobEstimate;
		totalJoBEstimate = ComputeTax(jobEstimate, salesTax);

		//Displaying Output
		System.out.println("Job Name  :  " + jobName);
		System.out.println("Job Cost  :  $" + String.format("%,.2f", jobEstimate));
		System.out.println("Taxes     :  $" + String.format("%,.2f", salesTax));
		System.out.println("Total Cost:  $" + String.format("%,.2f", totalJoBEstimate));

	}
		public static double JobEstimate (double costOfMaterials, double hoursWorked, double hoursTravelled) //creating a method
		{
			double hourlyRate = 35;
			double travelRate = 12;
			double jobEstimate;
			double wage = hourlyRate * hoursWorked;
			
			if (hoursTravelled <= 0) // assigning a condition 
			{
			jobEstimate = (costOfMaterials + wage);
			}
			else
			{
			jobEstimate = (costOfMaterials + wage + (travelRate * hoursTravelled)); 
			}

			return jobEstimate;
		}
		
		public static double ComputeTax (double jobEstimate, double salesTax)
		{
			double totalJobEstimate = jobEstimate + salesTax;
			return totalJobEstimate;
		}
}
