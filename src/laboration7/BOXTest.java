package laboration7;

public class BOXTest
{
	public void test()
	{
		BOX box1 = new BOX(0, 0, 0);
		BOX box2 = new BOX(0, 0, 0);
		box1.setHeight(13);
		box2.setDepth(box1.height);
		box1.setFull(true);
		BOX box3 = new BOX(box1.height, 14, box2.depth);
		System.out.println(box3.toString());
		System.out.println("Filling box 3..."); box3.setFull(true);
		System.out.println(box3.toString());
	}
	
	public static void main(String[] args)
	{
		BOXTest test = new BOXTest();
		test.test();
	}
}
