package laboration11;

public class Exercise11a
{
	public void action()
	{
		double[] numbers = {23.2, 14.7, 17.0, -5.5, -11.1, 26.3, 8.3, 7.6};
// 		double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4};
		int counter;
		double sum;
		String res;
		
		
		// 1
		System.out.println("Size of array: " +numbers.length);
		
		// 2
		sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			sum += numbers[i];
		}
		System.out.println("\nSum of all numbers\n" +sum);
		
		// 3
		res = "";
		for (int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] > 8)
			{
				res += numbers[i] + " ";
			}
		}
		System.out.println("\nNumbers larger than 8:\n" +res);
		
		// 4
		counter = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] > 8)
			{
				counter++;
			}
		}
		System.out.println("\nNumber of numbers larger than 8: " +counter);
		
		// 5
		res = "";
		for (int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] < 0)
			{
				res += numbers[i] + " ";
			}
		}
		System.out.println("\nNegative numbers;\n" +res);
		
		// 6
		sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] < 0)
			{
				sum += numbers[i];
			}
		}
		System.out.println("\nSum of negative numbers;\n" +sum);
		
		// 7
		res = "";
		for (int i = 1; i <= numbers.length; i++)
		{
			res += numbers[numbers.length-i] + " ";
		}
		System.out.println("\nAll numbers, in reverse order\n" +res);
		
		// 8
		
	}
	
	public static void main(String[] args)
	{
		Exercise11a e11a = new Exercise11a();
		e11a.action();
	}
}
