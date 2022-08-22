//Faith Iyere
//April 04,2022
//BINS 5312
import javax.swing.JOptionPane;
public class PhoneNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String phoneNum= JOptionPane.showInputDialog(null, "Enter 10 Digit Phone Number"); // prompting user for Input
		while(phoneNum.length() !=10 || phoneNum.contains("999"))//using the while statement to set a condition
			
			if(phoneNum.contains("999")) // using the if statement to set a condition
			{
				System.exit(0); //exits program
			}
		
			else
			{
				JOptionPane.showMessageDialog(null, "Incomplete Phone Number");// displays message
				phoneNum= JOptionPane.showInputDialog("Enter 10 Digit Phone Number");// Requests user input
			
			}
		
			if(phoneNum.length() == 10 )
			{
						String msg = "(" + phoneNum.substring(0,3) + ")" + " " + phoneNum.substring(3,6) + "-"
								+ phoneNum.substring(6,10);
					
						JOptionPane.showMessageDialog(null, msg); // displays message
			
			}
		}	
}
			
	
		
