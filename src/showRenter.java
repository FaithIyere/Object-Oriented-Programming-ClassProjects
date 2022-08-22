//Faith Iyere
// 03/11/2022
//BINS5312
public class showRenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Renter renterDetails = new Renter();
		Renter RenterDetails = new Renter();
		
		//assigning values to set fields
		RenterDetails.setfirstName("James");
		RenterDetails.setlastName("Brown");
		RenterDetails.setIDNumber("92055");
		RenterDetails.setAge(45);
		RenterDetails.setcreditScore(750);
		RenterDetails.setIncome(100000);
		
		//Displaying Details on the console
		System.out.println("Renter       :" + RenterDetails.getfirstName() + " " + RenterDetails.getlastName());
		System.out.println("Renter ID    :" + RenterDetails.getIDNumber());
		System.out.println("Income       :" + "$"+ RenterDetails.getIncome());
		System.out.println("Credit Score :" + RenterDetails.getcreditScore());
		System.out.println("Age          :" + RenterDetails.getAge());
	}

}