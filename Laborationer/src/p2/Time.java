package p2;

import java.util.Calendar;

//This class contains experimental code, kept for future reference

public class Time //implements Runnable
{
	private int hour, minute, second;
	private Calendar cal;
	
	public Time()
	{
		update();
	}
	
	//getters
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public int getSecond() {return second;}
	
	//update
	public void update()
	{	
		cal = Calendar.getInstance(); //Since we're calling a new instance on each update we don't have to cal.setTime
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	//toString
	public String toString()
	{
		String toString = hour +":" +minute +":" +second;
		return toString;
	}
	
	
/*	// Clock
  	public Thread clock;
	public String timekeeper = "Timekeeper";
	public void start()
	{
		System.out.println("Starting clock");
		if (clock == null)
		{
			clock = new Thread(this, timekeeper);
			clock.start();
		}
	}
	
	public void run()
	{
		while(1>0)
		{
			hour = cal.get(Calendar.HOUR_OF_DAY);
			minute = cal.get(Calendar.MINUTE);
			second = cal.get(Calendar.SECOND);
			try
			{
				Thread.sleep(59);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/
}
