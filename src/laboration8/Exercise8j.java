package laboration8;

public class Exercise8j
{
	public static void main(String[] args)
	{
		Point p1 = new Point(10, 12);
		Point p2 = new Point(20, 15);
		p1.setPoint(p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
