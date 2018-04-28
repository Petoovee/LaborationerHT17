package laboration8;

public class PointTest
{
	public static void main(String[] args)
	{
		Point point1 = new Point(10, 12);
		Point point2 = new Point(point1);
		System.out.println(point1.toString());
		System.out.println(point2.toString());
	}
}
