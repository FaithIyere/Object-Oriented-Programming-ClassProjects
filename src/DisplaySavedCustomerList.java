//Faith Iyere
//03/20/2022
//BINS5312  

import java.nio.*; // import java input output package
import java.io.*; // import java input output package

public class DisplaySavedCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		String CustomerList = "CustomerList.txt";
		double balance;
		String str, CustomerOutput;

		//use the try catch block to read from the file
		try
		{
		BufferedReader in = new BufferedReader(new FileReader(CustomerList));
		while ((str = in.readLine()) != null)
		{
		System.out.println(str);
		CustomerOutput = str.substring(str.length() - 4, str.length());
		}
		in.close();

		}

		catch (IOException e)
		{

		}

	}

}
