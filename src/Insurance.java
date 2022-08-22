//Faith Iyere
//03/05/2022
//BINS 5312

import javax.swing.JOptionPane; //Importing JOptionPane
public class Insurance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Define Variables
		int birthYear = 0;
		int currentYear = 0;
		double premium = 0;
		int date = 0;
		String userInput ="";
		double returnedAmount = 0;
		double computeInsurance = 0;
				
		userInput = JOptionPane.showInputDialog("Enter the current year");//Requesting user information
		currentYear = Integer.parseInt(userInput);// converting string to integer

		userInput = JOptionPane.showInputDialog("Enter your birth year");//Requesting user information
		birthYear = Integer.parseInt(userInput);// converting string to integer
		
		premium =computeInsurance(currentYear,birthYear); //calling the method
	
		JOptionPane.showMessageDialog(null,"Your Insurance Premium is " + " " + "$" + String.format("%,.2f" , premium)); //Displaying message
	}
		public static double computeInsurance(int cYear,int bYear) // defining the method to compute insurance
		{
		int age;
		double premium;
		age = cYear - bYear;
		premium =((age/10) + 15)* 20;
		
				return premium;
				
			
		
		
		
	}
}
