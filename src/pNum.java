//Faith Iyere
	//April 03,2022
	//BINS 5312
import javax.swing.JOptionPane;
public class pNum {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//declaring Variables
			String phoneNum = ""; 
			char bracket1 = '(';
			char bracket2 = ')';
			char space = ' ';
			char hyphen = '-';
			Boolean is999 = false;
			
			while(is999 == false)
			{
				phoneNum= JOptionPane.showInputDialog(null, "Enter 10 Digit Phone Number");
			
				if(Integer.parseInt(phoneNum)==999)
				{
					is999 = true;
					JOptionPane.showInputDialog("Request Terminated");
			
				}
			
				else
				{
				
					if(phoneNum.length() ==10);
					{
						if(phoneNum.matches("[0-9]+"))
						{
							StringBuffer phoneNumber = new StringBuffer(phoneNum);
						
							phoneNumber.insert(0, bracket1);
							phoneNumber.insert(4, bracket1);
							phoneNumber.insert(5, space);
							phoneNumber.insert(9, hyphen);
						
							String msg=("Your phone number is " + phoneNumber);
							JOptionPane.showConfirmDialog(null, msg);
						
						}
					
						else 
						{
							JOptionPane.showMessageDialog(null, "Enter only Digits");
						}				
					}
				
					else
					{
						JOptionPane.showMessageDialog(null, "Number must be ten digits");
					}
				}
			}
		}
	}
