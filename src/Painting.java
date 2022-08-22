//Faith Iyere
//03/05/2022
//BINS 5312 ASSIGNMENT5

import java.util.Scanner; //importing scanner
public class Painting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Defining variable
		double roomLength = 0;
		double roomWidth = 0;
		double gallon = 350;
		double numberOfGallons = 0;
		double laborCost = 0 ;
		double squareFootage = 0;
		double paintCost = 0;
		Scanner userInput = new Scanner(System.in);//introducing new scanner
		
		System.out.println("Enter Length of Room >>>>>");//prompting user for information
		roomLength = userInput.nextDouble();
		
		System.out.print("Enter Width of Room >>>>>");//prompting user for information
		roomWidth = userInput.nextDouble();
		
		squareFootage = calculateFootage(roomLength, roomWidth);//calling the method 
		
		numberOfGallons = calculateGallons(squareFootage, gallon); // calling the method
		
		paintCost = CalculatedPaintCost(numberOfGallons); //calling the method
		
		laborCost= CalculatedLaborCost(numberOfGallons); //calling the method
		
		double totalCost = (paintCost+ laborCost); // calling the method
		
		//display invoice
		System.out.println("Cost of Paint Job");
		System.out.println("Square Footage: " + String.format("%,.2f",squareFootage));
		System.out.println("Paint         : " + String.format("%,.2f", numberOfGallons)+ " gallons of paint");  
		System.out.println("Paint Cost    : " + "$" + String.format("%,.2f", paintCost));					
		System.out.println("Labor Cost    : " + "$" + String.format("%,.2f", laborCost));
		System.out.println("Total Cost    : " + "$" + String.format("%,.2f", totalCost));
				
	}	
	
	public static double calculateFootage(double rLength, double rWidth) // creating a method
	{
		double squareFootage = rLength * rWidth;	//calculating square footage
		return squareFootage;
	}
	
	public static double calculateGallons(double sFootage, double gallon)	//creating a method
	{
		double numberOfGallons = (sFootage/gallon); // calculating Number of gallonns
		return numberOfGallons;
	}
		
	public static double CalculatedPaintCost(double numGallons)	// creating a method
	{
		double paintPrice = 32;
		double paintCost = (numGallons * paintPrice); //calculating paint cost
		return paintCost;
	}

	public static double CalculatedLaborCost(double nGallons) // creating a method
	{
		double labCost = 120;
		double hoursPerGallon=6;
		double LaborCost = (nGallons* (labCost * hoursPerGallon)); //calculating Labor cost
		return LaborCost;
	}
			
	
}