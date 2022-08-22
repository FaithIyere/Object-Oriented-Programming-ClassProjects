//Faith Iyere
//April 07,2022
//BINS 5312

import javax.swing.JOptionPane; // imports JOptionPane
public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		int[] userEntry = new int[8];
		//	int[] userEntry = {8,5,6,9,20,41,8,90};
		String result;
		
		for(int i=0; i < userEntry.length; i++)
		{
			result = JOptionPane.showInputDialog("Enter Integer number " + (i + 1));
			userEntry[i] = Integer.parseInt(result);
		}
		
		//Call and Displays the methods
		displayInt(userEntry);
		displayIntReverse(userEntry);
		displaysumInt(userEntry);
		displayLessAvg (userEntry);
		displaymorethanAvg(userEntry);
	}

	public static void displayInt(int[] someArray) //defines the method to display userEntry
	{
		String msg = "The numbers in the Array are \n";
		for(int i = 0; i < someArray.length; i++)
		{
			msg = msg + someArray[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
		}

	public static void displayIntReverse(int[] someArray)//defines the method that displays user Entry in Reverse order
	{
		String msg = "The numbers in the Array in reverse order are \n";
		for(int i = 1; i < someArray.length; i++)
		{
			msg = msg + someArray[someArray.length - i] + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void displaysumInt(int[] someArray)//defines the method that displays the sum of user Entry
	{
		int sum = 0;
		String msg = "The sum of numbers is \n";
		for(int i = 1; i < someArray.length; i++)
		{
			sum += someArray[i];
		}
		JOptionPane.showMessageDialog(null, msg + sum);
	}
	public static void displayLessAvg(int[] someArray)//defines the method that displays user Entry less than the Average
	{
		int average = 0;
		int sum = 0;
		String msg = "These are numbers less than average \n";
		for(int i = 1; i < someArray.length; i++)
		{
			sum += someArray[i];
		}
		average = sum/someArray.length;
		
		
		for(int i = 1; i < someArray.length; i++)
		{
			if(someArray[i] < average)
			{
				msg = msg + someArray[i] + "\n";
			}
			}
			JOptionPane.showMessageDialog(null, msg);
			}
		
		public static void displaymorethanAvg(int[] someArray) //defines the method that displays user Entry more than the Average
		{
			int average = 0;
			int sum = 0;
			String msg = "These are numbers more than average \n";
			for(int i = 1; i < someArray.length; i++)
			{
				sum += someArray[i];
			}
			average = sum/someArray.length;
			
			for(int i = 1; i < someArray.length; i++)
			{
				if(someArray[i] > average)
				{
					msg = msg + someArray[i] + "\n";
				}
			}
		JOptionPane.showMessageDialog(null, msg);
		
	}
}

