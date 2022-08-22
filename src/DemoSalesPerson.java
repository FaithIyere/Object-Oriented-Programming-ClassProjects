//Faith Iyere
//April 10,2022
//BINS 5312

public class DemoSalesPerson {

	static int numPerson = 6; 
	static Salesperson[] salespersons = new Salesperson[numPerson];// Declaring arrays

	public static void main(String[] args) {
	// Declaring and Initializing variables
	double salesValue = 10000;
	int ID = 1001;
	double salesAmount = 0; 

	// Using a for loop to execute and calculate sales amount
	for (int i = 0; i < numPerson; i++) {
	salesAmount = salesAmount + salesValue; 
	salespersons[i] = new Salesperson(ID, salesAmount);
	ID++;
	}

	printSalesPerson();// calling the method for printing sales person

	}
	

	public static void printSalesPerson() { // Using a public static void to display information
	System.out.println("Sales Persons Information"); // Displaying necessary information
	for (int i = 0; i < numPerson; i++) { // Using the for loop to execute statement
	System.out.println("Salesperson ID: " + salespersons[i].getid() + " Sales Amount: "
	+ salespersons[i].getannualSalesAmount()); // Displaying necessary information
	}
	}

}
