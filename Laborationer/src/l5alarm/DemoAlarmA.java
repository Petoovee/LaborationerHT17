package l5alarm;

import java.util.Observable;
import java.util.Observer;

public class DemoAlarmA
{
	public DemoAlarmA(int ms)
	{
		AlarmThreadA at = new AlarmThreadA(ms);
		at.addObserver(new AlarmPrinter());
		at.startAlarm();
	}
	
	public static void main(String[] args)
	{
		DemoAlarmA da = new DemoAlarmA(4000);
	}
	
	public class AlarmPrinter implements Observer
	{
		@Override
		public void update(Observable arg0, Object arg1)
		{
			System.out.println("Alarm!");
		}
	}
}
