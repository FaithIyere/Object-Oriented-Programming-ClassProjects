//Faith Iyere
//March 5,2022
//BINS 5312

import java.util.Scanner; //importing Scanner
public class BookstoreCredit {

	public static double computeStoreCredit(double gradePA)// defining method to compute Store Credit
	{
		double storeCredit = gradePA *10;//computing store credit
		return storeCredit;
	}
	
	
	public static void main(String[] args) { //Main method
		// TODO Auto-generated method stub

		//define variables
		String name = "";
		double gpa = 0;
		double storeCredit = 0;
		double tuitionCredit = 0;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your name >>>>>"); //prompt user for input
		name = input.nextLine();
		 
		System.out.println("Enter your GPA >>>>>");//prompt user for input
		gpa = input.nextDouble();
		
		storeCredit = computeStoreCredit(gpa);
		tuitionCredit = computeTuitionCredit(gpa);
		
		//displaying output
		System.out.println("Your Name is " + "" + name);
		System.out.println("Your GPA is " + "" + gpa);
		System.out.println("Book Store Credit is " + "" + "$" + String.format("%,.2f", storeCredit));
		System.out.println("Tuition Credit is " + "" + "$" + String.format("%,.2f", tuitionCredit));
	}
	public static double computeTuitionCredit(double gradePA)//defining method to compute TuitionCredit
	{
		double tuitionCredit = gradePA *100;// calculate tuition credit
		return tuitionCredit;
	}

}
