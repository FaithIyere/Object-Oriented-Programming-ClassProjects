//Faith Iyere
//April 23,2022
//BINS 5312

public class Customer {
		private String CustomerID, FirstName, LastName;
	
		//set methods
		public void setCustomerID(String cID)
		{
			CustomerID = cID;
		}
		public void setfirstName(String fName)
		{
			FirstName = fName;
		}
		public void setlastName(String lName)
		{
			LastName = lName;
		}
		
		//get methods
		public String getCustomerID()
		{
			return CustomerID;
		}
		public String getfirstName()
		{
			return FirstName;
		}
		public String getlastName()
		{
			return LastName;
		}
		
		//Constructor
		Customer (String cid, String fN, String lN)
		{
			CustomerID = cid;
			FirstName = fN;
			LastName = lN;
		}
		
}
