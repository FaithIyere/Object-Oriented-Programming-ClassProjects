//Faith Iyere
// 03/10/2022
//BINS5312 

public class Course {
	//define data fields
	private String cName,cDescription,cDept,cSemester;
	private Room courseRoom;
	private double creditHours;
	
	//set method mutator methods
	public void setName(String courseName)
	{
		cName = courseName;
	}
	public void setDescription(String cDesc)
	{
		cDescription = cDesc;
	}
	public void setDepartment(String courseDept)
	{
		cDept = courseDept;
	}
	public void setSemester(String courseSemester)
	{
		cSemester = courseSemester;
	}
	public void setCourseRoom(Room cRoom)
	{
		courseRoom = cRoom;
	}
	public void setcreditHours(double cHours)
	{
		creditHours = cHours;
	}
	
	//get methods accessor methods
	
	public String getName()
	{
		return cName;
	}
	public String getDescription()
	{
		return cDescription;
	}
	public String getDepartment()
	{
		return cDept;
	}
	public String getSemester()
	{
		return cSemester;
	}
	public Room getCourseRoom()
	{
		return courseRoom;
	}
	public double getcreditHours()
	{
		return creditHours;
	}
		
}
