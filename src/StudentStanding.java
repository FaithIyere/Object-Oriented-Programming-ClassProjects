//Faith Iyere
//03/20/2022
//BINS5312 

import java.io.BufferedWriter;//imports java input package BufferedWriter
import java.io.FileWriter;	//imports java package BufferedWriter
import java.io.IOException; //imports java package FileWriter
import java.util.Scanner; //imports scanner
public class StudentStanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining variables
		String sID,lName,fName;
		double gpa;
		Boolean isGood = false;
		String msg;
		
		Scanner Input = new Scanner(System.in); //imports new scanner object
		
		//requests and retrieves user information
		System.out.println("Enter your ID>>>>>>");
		sID = Input.nextLine();
		
		System.out.println("Enter your First Name>>>>>>");
		fName = Input.nextLine();
		
		System.out.println("Enter your Last Name>>>>>>");
		lName = Input.nextLine();
		
		System.out.println("Enter your GPA>>>>>>");
		gpa = Input.nextDouble();
		
		//introducing an if else statement to determine student's standing
		if(gpa > 2)
		{
			isGood = true;
		}
		else
		{
			isGood = false;
		}
		
		msg = sID + ","+  fName + "," + lName + "," + gpa; 
		
		//use the try catch block to write to file
		try
		{
			String goodFile = "goodStanding.txt";
			String badFile = "probationFile.txt";
			if(isGood == true)
			{
				BufferedWriter writer = new BufferedWriter(new FileWriter(goodFile));
				writer.append(msg);
				writer.close();
			}
			else
			{
				BufferedWriter writer = new BufferedWriter(new FileWriter(badFile));
				writer.append(msg);
				writer.close();
			
			}
		}
		catch(IOException e)
		{
			
		}
		}

}
