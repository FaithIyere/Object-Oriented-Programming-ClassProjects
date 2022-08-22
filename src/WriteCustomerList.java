//Faith Iyere
//03/20/2022
//BINS5312

import java.io.BufferedWriter; //imports java input package BufferedWriter
import java.io.FileWriter; //imports java input package FileWriter
import java.io.IOException; //imports java package IOException
import java.util.Scanner; //imports Scanner

public class WriteCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining variables
		String idNum, fName, lName;
		double Bal;
		String msg;
		
		Scanner Input = new Scanner(System.in);//imports new scanner object
		
		//collects and displayes user information
		System.out.println("Enter Student's ID>>>>>>");
		idNum = Input.nextLine();
		
		System.out.println("Enter Student's first Name>>>>>>");
		fName = Input.nextLine();
		
		System.out.println("Enter Student's Last Name>>>>>>");
		lName = Input.nextLine();
		
		System.out.println("Enter Balance owed>>>>>>");
		Bal = Input.nextDouble();

		msg = idNum + ","+  fName + "," + lName + "," + Bal;
		
		//use the try catch block to write to file
		try
		{
			String CustomerList = "CustomerList.txt";
			BufferedWriter writer = new BufferedWriter(new FileWriter(CustomerList));
			writer.append(msg);
			writer.close();
		}
		
		catch(IOException e)
		{
		}
	
	}
}
