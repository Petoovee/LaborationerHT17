package arrays;

public class Integer2DArrays
{
	
	// Prints out the numbers in a two dimensional array
	public static String toString(int[][] array)
	{
		String toString = "{";
		
		for(int x = 0; x < array.length; x++)
		{
			toString += "{";
			for(int y = 0; y < array[x].length; y++)
			{
				toString += array[x][y] +",";
			}
			toString += "}";
		}
		toString += "}";
		
		return toString;
	}
	
	
	// Returns the number of elements in a two dimensional array
	public static int elements(int[][] array)
	{
		int counter = 0;
		
		for(int x = 0; x < array.length; x++)
		{
			for(int y = 0; y < array[x].length; y++)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	// Returns the highest value in a two dimensional array
	public static int max(int[][] array)
	{
		int max = -2147483648; // Lowest possible value of an integer
		
		for(int x = 0; x < array.length; x++)
		{
			for(int y = 0; y < array[x].length; y++)
			{
				if(array[x][y] > max)
				{
					max = array[x][y];
				}
			}
		}
		
		return max;
	}
	
	// Returns the lowest value in a two dimensional array
	public static int min(int[][] array)
	{
		int min = 2147483647; // Highest possible value of an integer
		
		for(int x = 0; x < array.length; x++)
		{
			for(int y = 0; y < array[x].length; y++)
			{
				if(array[x][y] < min)
				{
					min = array[x][y];
				}
			}
		}
		
		return min;
	}
	
	// Returns the sum of the values in a two dimensional array
	public static int sum(int[][] array)
	{
		int sum = 0;
		
		for(int x = 0; x < array.length; x++)
		{
			for(int y = 0; y < array[x].length; y++)
			{
				sum += array[x][y];
			}
		}
		
		return sum;
	}
	
	// Returns the average of the values in a two dimensional array
	public static float average(int[][] array)
	{
		float average = (float)sum(array)/elements(array);
		return average;
	}
}
