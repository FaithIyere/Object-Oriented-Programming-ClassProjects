//Faith Iyere
// 03/10/2022
//BINS5312 
public class Student {

			//data fields
			private String studID;
			private double creditHours;
			private double ptEarned;
			private double GPA;
			
			
			//set methods mutator methods
			public void setStudID(String ID)
			{
			studID =  ID;	
			}
			
			public void setcreditHours(double HRS)
			{
			creditHours = HRS;	
			}
			
			public void setptEarned(double score)
			{
			ptEarned =  score;	
			}
			
			public void setGPA(double myGPA)
			{
			GPA =  myGPA;	
			}
			
			//######### Get methods Accessor methods
			
			public String getStudID()
			{
				return studID;
			}
			
			public double getcreditHours()
			{
				return creditHours;
			}
			public double getptEarned()
			{
				return ptEarned;
			}
			public double getGPA()
			{
				return GPA;
			}
			
			public Student () // creating constructor to initialize student details
			{
				studID = "9999";
				ptEarned = 12;
				creditHours = 12/4;
			}
			public Student (String SID)
			{
				studID = SID;
			}
		}