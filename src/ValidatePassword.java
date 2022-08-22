//Faith Iyere
//April 03,2022
//BINS 5312
import javax.swing.JOptionPane; //import JOptionPane
public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		String password = "";
		int countUpper = 0;
		int countLower = 0;
		int countDigit = 0;
		Boolean isValid = false;
		
		//using while loop to assign a conditions
		while (isValid ==false)
		{
			password = JOptionPane.showInputDialog("Enter a valid password\n" + "Must contain 1 digit\n" + "2 uppercase\n" + "3 lowercase");
			
		for (int i = 0; i < password.length(); i++)	
		{
			if(Character.isDigit(password.charAt(i)))
			{
				countDigit++;
			}
			else if(Character.isUpperCase(password.charAt(i)))
			{
				countUpper++;
			}
			else if (Character.isLowerCase(password.charAt(i)))
			{
				countLower++;
			}
		}
		if( countDigit >= 1 && countLower >= 3 && countUpper >= 2)
		{
			isValid = true;
			JOptionPane.showMessageDialog(null, "Password entered is Valid");
		}
		else
		{
			String msg = "Your password has " + countDigit + "digit\n" + countUpper + "upperCase\n" + countLower + "lowerCase\n";
			
			JOptionPane.showMessageDialog(null, msg);
			
			}
		}
	
}


}
