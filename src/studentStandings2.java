//Faith Iyere
//03/20/2022
//BINS5312 
import java.nio.*;
import java.io.*;
public class studentStandings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// defining Variables
		String goodFile = "goodStanding.txt";
		String badFile = "probationFile.txt";
		double gpa;
		String str;
		String strGPA;
		
		//use the try catch block to write to file
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(goodFile));
			while ((str = in.readLine()) != null)
			{
				System.out.println(str);
				strGPA = str.substring(str.length() -4, str.length());
				gpa = Double.parseDouble(strGPA);
				System.out.println(gpa -2);
			}
			in.close();
			
			System.out.println("**************************************");
			
			BufferedReader in2 = new BufferedReader(new FileReader(badFile));
			while ((str = in2.readLine()) != null)
			{
				System.out.println(str);
				strGPA = str.substring(str.length() -4, str.length());
				gpa = Double.parseDouble(strGPA);
				System.out.println(gpa -2);
			}
			in2.close();
		}
			catch(IOException e)
		{

			
		}
	
	}
}
