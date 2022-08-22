//Faith Iyere
// 03/10/2022
//BINS5312 
public class Room {

	//defining fields
	private String rmName, rmLocation;
	private int rmCapacity;
	private Boolean isTech;
	
	//set methods mutator methods
	public void setName(String newName)
	{
		rmName = newName;
	}
	
	public void setLocation(String newLocation)
	{
		rmLocation = newLocation;
	}
	
	public void setCapacity(int size)
	{
		rmCapacity = size;
	}
	
	public void setTech (Boolean isZoom)
	{
	isTech = isZoom;
	}
	
	//########## get methods ..accessor methods
	public String getName()
	{
		return rmName;
	}
	
	public String getLocation()
	{
		return rmLocation;
	}
	
	public int getCapacity()
	{
		return rmCapacity;
	}
	public Boolean getisTech()
	{
		return isTech;
	}
	
}