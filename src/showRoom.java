//Faith Iyere
// 03/10/2022
//BINS5312 
public class showRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room myClassRoom = new Room();
		
		//assigning values to set fields
		myClassRoom.setCapacity(35);
		myClassRoom.setLocation("College of Business");
		myClassRoom.setName("RBUS108");
		myClassRoom.setTech(true);
		
		//Displaying Room Details
		System.out.println(myClassRoom.getName() + " " + "Information");
		System.out.println();
		System.out.println("Location OF RBUS108 :" + myClassRoom.getLocation());
		System.out.println("Capacity of RBUS108 :" + myClassRoom.getCapacity());
		System.out.println("Zoom and Computers  :" + myClassRoom.getisTech());	
	}

}
