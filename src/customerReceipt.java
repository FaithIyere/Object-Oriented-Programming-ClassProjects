//Faith Iyere
//April 28,2022
//BINS 5312

import javax.swing.JOptionPane; //Importing packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class customerReceipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining arrays
		String [] items= {"Milk","Cheese","Eggs","Sugar","Oats","Cereal","Juice","Bread","Coffee","Butter"};
		double[] itemPrices = {2.56, 3.68, 1.98, 2.77,5.65, 4.99, 3.96, 3.99, 2.75, 5.66};
		
		//defining variables
		String userInput;
		String CustomerID;
		double total = 0;
		double taxes;
		String line = "";
		String itemLine;
		String itemsList = "";
		String customer = "";
		boolean isValid = true;
		
		
		//defining text files variables
		String fileName = "customerinfo.txt";
		String purchasedfileName =  "itemsPurchased.txt";
		
		//Requesting user's Input
		userInput= JOptionPane.showInputDialog("Enter your ID: ");
		
		//using the try,while and if block to read the file and compare if user input matches details on file
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			while((line= in.readLine()) !=null)
			{
				CustomerID = line.substring(0,4);
			
				if(userInput.equals(CustomerID))
				{
					customer = line;
					isValid = false;
				}
				}
				in.close();
			
			}
		
		//using the catch block to catch exceptions
		catch(IOException e)
		{
						
		} 
		
		//Notifying the user when input doesn't match details on file
		if (isValid != false)
		{
			JOptionPane.showMessageDialog(null,"The ID you entered is  invalid");
			return;
		}
		
		//Assigning customer details to variables
		int lastindex = customer.lastIndexOf(',');
		String custID = customer.substring(0,4);
		String custFName = customer.substring(5,lastindex);
		String custLName = customer.substring(lastindex + 1 ,customer.length());
		
		//calling the Customer method
		Customer myCustomer = new Customer(custID,custFName,custLName);
		
		//using the try and while block to read the itemPurchased file
		try
		{
			BufferedReader in2 = new BufferedReader(new FileReader(purchasedfileName));
		
		
		while((itemLine = in2.readLine()) != null)
		{
			CustomerID = itemLine.substring(0,4);
			if(custID.equals(CustomerID))
			{
				itemsList = itemLine;
			}
		}
		}
		catch(IOException e)
		{
			
		}
		
		// using variables to differentiate between the itemsPurchased by customers
		int indexOne = itemsList.indexOf(',');
		int indexTwo = itemsList.indexOf(',',indexOne +1);
		int indexThree = itemsList.lastIndexOf(',');
		
		//assigning variables to itemsPurchased by customers
		String itemOne = itemsList.substring(indexOne +1, indexTwo);
		String itemTwo = itemsList.substring(indexTwo +1, indexThree);
		String itemThree = itemsList.substring(indexThree +1, itemsList.length());
		
		//Printing Receipt
		System.out.println("Point of Sale Receipt \n"
				+ "*********************** \n"
				+ "Customer Name: " + myCustomer.getfirstName() + " " + myCustomer.getlastName() + "\n"
				+ "Items Purchased \n"
				+ "***********************");
		
		//using the for loop to move through and identify itemList and print Price for each item purchased
		for (int i = 0; i<items.length; i++)
		{
			if(itemOne.equals(items[i]))
			{
				System.out.println(items[i] +  " $" + itemPrices[i]);
				total = itemPrices[i];
			}
		}
		for (int i = 0; i < items.length; i++)
		{
		if(itemTwo.equals(items[i]))
		{
		System.out.println(items[i] +  " $" + itemPrices[i]);
		total = total + itemPrices[i];
		}
		}

		for (int i = 0; i < items.length; i++)
		{
		if(itemThree.equals(items[i]))
		{
		System.out.println(items[i] + " $" + itemPrices[i]);
		total = total + itemPrices[i];
		}
		}

		//calculating taxes and total amount
		taxes = 0.068 * total;
		total = total + taxes;

		//printing calculated tax and Total amount on the receipt
		System.out.println("Taxes $" + String.format("%.2f", taxes));
		System.out.println("***********************");
		System.out.println("Total $" + String.format("%.2f", total));
		}
		}
		