package p2;

import javax.swing.JOptionPane;

public class Excercise2b
{
	public void demo()
	{
		String message1, message2;
		int hour, minute, second;
		Time time = new Time();
		hour = time.getHour();
		minute = time.getMinute();
		second = time.getSecond();
		
		message1 = "The time is " + minute + " minutes over " + hour + " (+" + second + " seconds)";
		message2 = time.toString();
		JOptionPane.showMessageDialog(null, message1);
		JOptionPane.showMessageDialog(null, message2);
		time.update();
		message2 = time.toString();
		JOptionPane.showMessageDialog(null, message2);
	}
	
	public static void main(String[] args)
	{
		Excercise2b prog = new Excercise2b();
		prog.demo();
	}
}
