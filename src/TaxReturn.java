//Faith Iyere
//April 03,2022
//BINS 5312
public class TaxReturn {

	private String lastName, firstName,streetAdd,city,state,mStatus,ValidSSN;
	private String SSN, zipCode;
	private double annualIncome,taxLiab;
	
	//set methods mutator methods
	
	public TaxReturn(String ssn, String lName, String fName, String streetAdd2, String city2, String state2,
			String zipCode2, double annualIncome2, String mStatus2) {
		// TODO Auto-generated constructor stub
		SSN = ssn;
		lastName = lName;
		firstName = fName;
		streetAdd = streetAdd2;
		city = city2;
		state = state2;
		zipCode = zipCode2;
		mStatus = mStatus2;
		annualIncome = annualIncome2;
		calculatedTaxLiab();
		
	}
	
	public void calculatedTaxLiab() // introducing a private method to calculate tax liability
	{
			
			if (annualIncome >= 0 && annualIncome <= 20000) { // Use the if statement to set condition for annual income
				switch (mStatus) { // Introducing the switch statement for marital status
				 case "Single": // case option for Single
				 case "single": // case option for single
					 taxLiab = 0.15 * annualIncome; // calculating tax liability
					 break; // introducing the break option to break the flow of codes
			
				 case "Married": // case option for Married
				 case "married": // case option for married
					 taxLiab = 0.14 * annualIncome; // calculating tax liability
					 break; // introducing the break option to break the flow of codes
			
				 default: // Using the default case for invalid entry
					 break; // introducing the break option to break the flow of codes
				}
			}
			
			else if (annualIncome > 20000 && annualIncome <= 50000) {
				switch (mStatus) { // Introducing the switch statement for marital status
				case "Single": // case option for Single
				case "single": // case option for single
					taxLiab = 0.22 * annualIncome;
					break; // introducing the break option to break the flow of codes
			
				case "Married":// case option for Married
				case "married": // case option for married
					taxLiab = 0.20 * annualIncome;
					break; // introducing the break option to break the flow of codes
			
				default: // Using the default case for invalid entry
					break; // introducing the break option to break the flow of codes
				}
			}
			
			else if (annualIncome > 50000) {
				switch (mStatus) { // Introducing the switch statement for marital status
				case "Single":// case option for Single
				case "single": // case option for single
					taxLiab = 0.30 * annualIncome;
					break; // introducing the break option to break the flow of codes
				case "Married":// case option for Married
				case "married": // case option for married
					taxLiab = 0.28 * annualIncome;
					break; // introducing the break option to break the flow of codes
			
				default: // Using the default case for invalid entry
					break; // introducing the break option to break the flow of codes
			
			}
	}
}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("==========================================================");

		System.out.println("Taxpayer SSN: " + SSN + "\nFirst Name: " + firstName + "\nLast Name: " + lastName
		+ "\nStreet Address: " + streetAdd + "\nCity: " + city + "\nState: " + state
		+ "\nZip Code: " + zipCode + "\nMarital status: " + mStatus + "\nIncome: $"
		+ annualIncome + "\nTax Liability: $" + taxLiab);
		System.out.println("=========================================================="); 
	}

	
}