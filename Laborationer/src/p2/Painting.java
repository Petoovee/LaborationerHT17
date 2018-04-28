package p2;

public class Painting
{
	String title, painter;
	int year;
	
	//Initiator
	public Painting(String arg1, String arg2, int arg3)
	{
		title = arg1; painter = arg2; year = arg3;
	}
	
	//Getters
	public String getTitle(){return title;}
	public String getPainter(){return painter;}
	public int getYear(){return year;}
	
	//toString
	public String toString()
	{
		String string = title + " from " + painter + ", " + year;
		return string;
	}
	 
}