//Faith Iyere
// 03/11/2022
//BINS5312
public class Apartment {

	private String apartmentNumber;
	private int nBedrooms, leaseTerms;
	private double monthlyRent, nBathrooms;
	private Renter Renter;
	
	// set methods modular methods
	
	public void setapartmentNumber(String apartmentNUM)
	{
		apartmentNumber = apartmentNUM;
	}
	public void setnBedrooms(Integer bedroomNUM)
	{
		nBedrooms = bedroomNUM;
	}
	public void setleaseTerms(Integer lsTerm)
	{
		leaseTerms = lsTerm;
	}
	public void setmonthlyRent(double mthrent)
	{
		monthlyRent = mthrent;
	}
	public void setnBathrooms(double bathroomNUM)
	{
		nBathrooms = bathroomNUM;
	}
	public void setRenter(Renter rEnter)
	{
		Renter = rEnter;
	}
	
	//get methods accessor methods
	public String setapartmentNumber()
	{
		return apartmentNumber;
	}
	public Integer setnBedrooms()
	{
		return nBedrooms;
	}
	public Integer setleaseTerms()
	{
		return leaseTerms;
	}
	public double setmonthlyRent()
	{
		return monthlyRent;
	}
	public double setnBathrooms()
	{
		return nBathrooms;
	}
	public Renter setRenter()
	{
		return Renter;
	}
	
	
}
