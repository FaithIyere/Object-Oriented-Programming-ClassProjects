//Faith Iyere
// 03/10/2022
//BINS5312 
import java.util.Scanner; //Importing Scanner
public class showStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student gradStudent = new Student();
		Student undergradStudent = new Student ("T011109");
		
		//assigning new values to the set fields 
		undergradStudent.setcreditHours(10.5);
		undergradStudent.setptEarned(37.5);
		undergradStudent.setGPA(37.5/10.5);
		undergradStudent.setStudID("T0100999");
		
		//Displaying student information
		System.out.println("student ID is :" + undergradStudent.getStudID());
		System.out.println("Credit Hours is :" + undergradStudent.getcreditHours());
		System.out.println("Points Earned is :" + undergradStudent.getptEarned());
		System.out.println("GPA is :" + undergradStudent.getGPA());
	}

}
