//Faith Iyere
//April 07,2022
//BINS 5312

import javax.swing.JOptionPane;
public class CarCareChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		String [] services = {"Oil Change","Tire Rotation","Battery Check","Brake Inspection"};
		double[] prices = {25,22,15,5};
		
		//prompt user to select option
		String msg = "Select a service by entering the first 3 characters of the service \n" +
				"1. Oil Service\n" +
				"2. Tire Rotation\n"+
				"3. Battery Check\n" +
				"4. Brake Inspection";
						
		String result = JOptionPane.showInputDialog(msg);
		
		//using the if statement to ignore character case
		if(result.equalsIgnoreCase("oil") || result.equalsIgnoreCase("bat")||
				result.equalsIgnoreCase("tir")|| result.equalsIgnoreCase("bra"))
				{
			for(int i = 0; i < services.length; i++)//using a for loop to run through services offered
			{
				if(result.equalsIgnoreCase(services[i].substring(0, 3))) //using a substring to accept the first 3 characters of the string
				{
					String msg1 = "You selected " + services[i] + " \n" +
							"The cost of the services is " + "$" + String.format("%.2f", prices[i]);
				JOptionPane.showMessageDialog(null, msg1);// displaying the service selected and the price of service
				}
				}
			}

	else
	{
		JOptionPane.showMessageDialog(null, "Your entry is invalid"); // displaying a message for an incorrect entry
	}
}
}