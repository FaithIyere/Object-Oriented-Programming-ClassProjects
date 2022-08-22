import javax.swing.JOptionPane;//importing JOptionPane

public class Lab3b {
//Faith Iyere
//February 13,2022	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result;// Declaring Variabe
		double betAmount;// Declaring Variable
		result = JOptionPane.showInputDialog("Enter the amount you want to bet");// Requesting user input
		betAmount = Double.parseDouble(result);

		int roll;// introduces an integer
		int output = JOptionPane.showConfirmDialog(null, "Do you want to roll the die");// Requesting user input
		if (output == 0) // introduces if statement
		{
			roll = (int) (Math.random() * 6) + 1;// Using the math random to set-up numbers from one to six

		} else // introduces else statement
		{
			return;
		}
		System.out.println(roll);// Displays dice selected
		switch (roll) // introducing the switch statement
		{
		case 1:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "You forfeit bet of " + betAmount);// displaying
																													// message
																													// to
																													// user
			break;// inserts a break

		case 2:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "You forfeit bet of " + betAmount);// displaying
																													// message
																													// to
																													// user
			break;// inserts a break
		case 3:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "You forfeit bet of " + betAmount);// displaying
																													// message
																													// to
																													// user
			break;// inserts a break
		case 4:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "You get your bet back of " + betAmount);// displaying
																														// message
																														// to
																														// user
		case 5:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "You get half of bet back " + betAmount);// displaying
																														// message
																														// to
																														// user
			break;// inserts a break
		case 6:
			JOptionPane.showMessageDialog(null, "You rolled " + roll + "\n" + "Your bet is doubled " + betAmount);// displaying
																													// message
																													// to
																													// user
			break;// inserts a break
		default:
			JOptionPane.showMessageDialog(null, "Error originated");// Displaying error message to terminate java
			break;// inserts a break
		}
	}

}
