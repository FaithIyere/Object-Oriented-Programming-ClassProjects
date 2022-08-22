//Faith Iyere
//April 03,2022
//BINS 5312

import javax.swing.JOptionPane;
public class DaysMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//defining Variables
		int year = 0;
		String month = "";
		int days = 0;
		String entry;
		
		entry = JOptionPane.showInputDialog("Enter a year and the first 3 characters of the month");
		
		year = Integer.parseInt(entry.substring(0, 4));
		
		month = entry.substring(5, entry.length());
		
		switch(month)
		{
		case "Jan": case "Mar": case "May" : case "Jul" : case "Aug" : case "Oct" : case "Dec":
			days = 31;
			break;
			
		case "Apr": case "Jun": case "Sep" : case "Nov" :
			days = 30;
			break;
			
		case "Feb":
			if (year%4 ==0)
			{
				days = 29;
			}
			else
			{
				days = 28;
			}
		break;
			
		default : break;
		}
		
		JOptionPane.showMessageDialog(null, "The Month entered has " + days + " days" );
		
		}

}
