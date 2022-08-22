import javax.swing.JOptionPane;// Importing JOptionPane

public class AssignmentQ2 {
//Faith Iyere
// February 06, 2022
//BINS 5312 Assignment 2	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String yourSelection; // Declaring variable
		String lastName; // Declaring Variable
		String emailAddress; // Declaring Variable
		yourSelection = JOptionPane.showInputDialog(null,
				"Welcome to the Trojan Cafe Meal Plan Options: Select One Option" + "\n" + "\n" + "\n"
						+ "1. CARTE UNLIMITED PLUS + $75 EXPRESS DOLLARS - $1925 per semester" + "\n"
						+ "2. 244 BLOCK + $500 EXPRESS DOLLARS - $1730 per semester" + "\n"
						+ "3. 128 BLOCK + $500 TROJAN EXPRESS DOLLARS - $1445 per semester");

		JOptionPane.showMessageDialog(null, "My selection is " + yourSelection);// Using the JOptionPane to show message

		lastName = JOptionPane.showInputDialog(null, "Enter Last Name >>>");// Requesting user information
		JOptionPane.showMessageDialog(null, "My last name is " + lastName);// Using the JOptionPane to show message

		emailAddress = JOptionPane.showInputDialog(null, "Enter Email Address >>>");// Requesting user information
		JOptionPane.showMessageDialog(null, "My Email Address is " + emailAddress);// Using the JOptionPane to show
																					// message

		JOptionPane.showMessageDialog(null, "Meal Plan Option: " + yourSelection + "\n" + "Last Name: " + lastName
				+ "\n" + "Email Address: " + emailAddress); // Displaying User Inputs

	}

}
