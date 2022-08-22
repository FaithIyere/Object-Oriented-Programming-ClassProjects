//Faith Iyere
// 03/11/2022
//BINS5312
public class showApartmentRenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apartment MyApartment = new Apartment();
		Renter newRenter = new Renter();
		
		//assigning new values to Apartment set data fields 
		newRenter.setfirstName("Roger");
		newRenter.setlastName("Moore");
		newRenter.setIDNumber("72205");
		newRenter.setAge(30);
		newRenter.setcreditScore(725);
		newRenter.setIncome(60000);
		
		//assigning  new data fields
		MyApartment.setapartmentNumber("UNIT007");
		MyApartment.setnBedrooms(2);
		MyApartment.setnBathrooms(2.5);
		MyApartment.setmonthlyRent(1200);
		MyApartment.setleaseTerms(12);

		//Displaying  Details on the console
		System.out.println("Apartment :" + MyApartment.setapartmentNumber());
		System.out.println("Terms     :" + MyApartment.setleaseTerms() + " months");
		System.out.println("Rent      :" + "$" + MyApartment.setmonthlyRent());
		System.out.println("Bedrooms  :" + MyApartment.setnBedrooms());
		System.out.println("Bathrooms :" + MyApartment.setnBathrooms());
		System.out.println("*********************************************************************************");
		System.out.println("Apartment is rented to");
		System.out.println("*********************************************************************************");
		System.out.println("Renter       :" + newRenter.getfirstName() + " " + newRenter.getlastName());
		System.out.println("Income       :" + "$"+ newRenter.getIncome());
		System.out.println("Credit Score :" + newRenter.getcreditScore());
	}
}
