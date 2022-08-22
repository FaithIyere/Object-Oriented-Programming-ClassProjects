//Faith Iyere
//April 24,2022
//BINS 5312

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
public class Receipt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] items= {"Milk","Cheese","Eggs","Sugar","Oats","Cereal","Juice","Bread","Coffee","Butter"};
		double[] itemPrices = {2.56, 3.68, 1.98, 2.77,5.65, 4.99, 3.96, 3.99, 2.75, 5.66};
		
		//Customer myCustomer = new Customer();
		customerReceipt myCustomer;
		String userInput;
		String fileName = "customerinfo.txt";
		String fileName2 =  "itemsPurchased.txt";
		String FirstName, LastName;
		String idEntered;
		String line;
		
		//userInput= JOptionPane.showInputDialog("Enter your ID");
		//idEntered= Integer.parseInt(userInput);
		idEntered = JOptionPane.showInputDialog("Enter your ID");
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			while((line= in.readLine()) !=null)
			{
				if(line.substring(0, 3).equals(idEntered))
				{
				//	userInput = idEntered;
					FirstName = line.substring(4, line.indexOf(",", 4));
					LastName = line.substring(line.indexOf(",", 4)+ 1, line.length());
					
					
					String msg= FirstName + LastName;
					
				}
			}
			/*		Customer myCustomer = new Customer(idEntered, FirstName, LastName);
					Customer newCustomer = new customer;
				//	Customer myCustomer = new customer(cid, fN, lN);
					{
					String msg= "Point of Sale Receipt +\n" + "**********************************" +
							"Customer Name : " + newCustomer.getfirstName() + " " + myCustomer.getlastName()+ " " +
							"Item Purcased" + " " + "******************************";
					}
			}
		}

				/*			items + "   " + itemPrices[] + " " + "******************";
				
		
		catch(IOException e)
		{
						
		} 
		catch(IOException someException)
		{
			String msg2 = "ID is Invalid";		
		}
		finally 
		{ 
			
		}*/
}
