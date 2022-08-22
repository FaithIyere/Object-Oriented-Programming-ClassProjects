//Faith Iyere
// 03/10/2022
//BINS5312 
public class showCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room myNewClassRoom = new Room();
		Course myCourse = new Course();
		
		//assigning values to set fields
		myNewClassRoom.setCapacity(35);
		myNewClassRoom.setLocation("College of Business");
		myNewClassRoom.setName("RBUS108");
		myNewClassRoom.setTech(true);
		
		//assigning values to Room set fields
		myCourse.setDepartment("BINS");
		myCourse.setDescription("Object Oriented Programming");
		myCourse.setName("BINS4312/5312");
		myCourse.setCourseRoom(myNewClassRoom);
		myCourse.setSemester("Spring");
		myCourse.setcreditHours(3);
		
		//Displaying Course Details on the console
		System.out.println("Course Name is     :" + myCourse.getName());
		System.out.println("Department Name is :" + myCourse.getDepartment());
		System.out.println("Description is     :" + myCourse.getDescription());
		System.out.println("Credit Hours is    :" + myCourse.getcreditHours());
		System.out.println("Class Room         :" + myCourse.getCourseRoom().getName() );
		
		
		System.out.println();
		
		System.out.println(myNewClassRoom.getName() + " " + "Information");
		System.out.println();
		
		System.out.println("Location of RBUS108 :" + myNewClassRoom.getLocation());
		System.out.println("Capacity of RBUS108 :" + myNewClassRoom.getCapacity());
		System.out.println("Zoom and Computers  :" + myNewClassRoom.getisTech()); 
	}

}
