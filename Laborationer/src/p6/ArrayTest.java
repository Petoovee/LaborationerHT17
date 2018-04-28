package p6;

public class ArrayTest {
	public static void main(String[] args)
	{
		Array7[] test = new Array7[7];
		test[1].setElement(1, 5);
		System.out.println(test[1].getElement(1));
	}
}
