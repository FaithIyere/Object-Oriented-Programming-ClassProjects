//Faith Iyere
//April 10,2022
//BINS 5312

public class Salesperson {

	// Declaring variable
	private int id; 
	private double annualSalesAmount;

	public Salesperson(int idNum, double AnnualSalesAmount) // Introducing a constructor
	{
	id = idNum; // Setting values for ID Number
	annualSalesAmount = AnnualSalesAmount; // Setting values for Annual sales amount
	}
	//introducing set methods
	public void setid(int idNum) 
	{
	id = idNum; 
	}
	public void setannualSalesAmount(double AnnualsalesAmnt)
	{ 
	annualSalesAmount = AnnualsalesAmnt;
	}
	//introducing get methods
	public int getid() 
	{ 
	return id;
	}
	public double getannualSalesAmount() 
	{
	return annualSalesAmount;
	}
}
