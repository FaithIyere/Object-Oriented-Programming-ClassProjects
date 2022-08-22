//Faith Iyere
//February 24,2022
//BINS 5312

import javax.swing.JOptionPane; //Importing JOptionPane

public class GPACalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring and initiating variables
		String userResponse = "";
		double GPA = 0;
		double A = 4.0;
		double B = 3.0;
		double C = 2.0;
		double D = 1.0;
		double cumGPA = 0.0;

		userResponse = JOptionPane.showInputDialog(null, "Enter Spring 2021 semester" + "\n" + "number of courses you took and passed");
		int numberOfCourses = Integer.parseInt(userResponse);//Converting inputed integer to string
		
		for (int x = 1; x <= numberOfCourses; ++x) //Introducing a for loop for repeated execution
		{ 
			String grade = JOptionPane.showInputDialog("Enter Letter Grade for Course Number" + " " + x);//Requesting for user input
			
			switch(grade) { //Introducing the switch statement
			case "A": //Adding case A option
				GPA = GPA + A; // Getting input for GPA
				break; // introducing break to end the request
			case "B": // Adding case B option
				GPA = GPA + B;// Getting input for GPA
				break;	// introducing break to end the request
			case "C"://Adding case C option
				GPA = GPA + C;// Getting input for GPA
				break;// introducing break to end the request
			case "D"://Adding case D option
				GPA = GPA + D;// Getting input for GPA
				break;// introducing break to end the request
			default:
				break;// introducing break to end the request
				
			}
		}
		cumGPA = GPA / numberOfCourses; //Cummulative GPA Calculation
		JOptionPane.showMessageDialog(null, "Your Spring 2021 semester GPA is " + String.format("%.2f", cumGPA), "Message", 1);// Adding literal string to get information
		
	}
	
}
	
