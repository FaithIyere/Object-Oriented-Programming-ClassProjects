//Faith Iyere
// 03/11/2022
//BINS5312

public class Renter {

	private String IDNumber, lastName, firstName;
	private int Age, creditScore;
	private double Income;
	
	//set methods mutator methods
	public void setIDNumber(String idNum)
	{
		IDNumber = idNum;
	}
	public void setlastName(String lName)
	{
		lastName = lName;
	}
	public void setfirstName(String fName)
	{
		firstName = fName;
	}
	public void setAge(Integer age)
	{
		Age = age;
	}
	public void setcreditScore(Integer crdScore)
	{
		creditScore = crdScore;
	}
	public void setIncome(double income)
	{
		Income = income;
	}
	
	//get methods Accessor methods
	public String getIDNumber()
	{
		return IDNumber;
	}
	public String getlastName()
	{
		return lastName ;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public Integer getAge()
	{
		return Age;
	}
	public Integer getcreditScore()
	{
		return creditScore;
	}
	public double getIncome()
	{
		return Income;
	}
	
	public Renter() // creating a constructor
	{
		IDNumber = "9999";
		lastName = "Doe";
		firstName = "John";
				
	}
}

