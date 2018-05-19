package laboration8;

public class Exercise8g {
	public static void main(String[] args) {
		
		// The value in c1 is never changed so I don't get the same result as the document wants me to
		Point p1, p2;
		p1 = new Point(10, 12);
		Circle c1 = new Circle(3.5, p1);
		System.out.println("p1 = " + p1.toString());
		System.out.println("c1 = " + c1.toString());
		System.out.println("-------------");
		p2 = c1.getPosition();
		p2.setX(333);
		System.out.println("p1 = " + p1.toString());
		System.out.println("c1 = " + c1.toString());
		System.out.println("p2 = " + p2.toString());
		
		/*
		 *  A) It doesn't?
		 *  
		 *  B) Didn't change the circle either?
		 */
	}
}