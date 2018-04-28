package arrays;

public class CountryArrays
{
	
	// Constructor
	public CountryArrays()
	{
		
	}
	
	public static int indexOf(Country[] array, Country country)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equals(country))
				return i;
		}
		return -1;
	}
	
	public static boolean member(Country[] array, Country country)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equals(country))
				return true;
		}
		return false;
	}
	
	public static String toString(Country[] array)
	{
		String toString = "{";
		for(int i = 0; i < array.length; i++)
		{
			toString += array[i].toString() +",";
		}
		toString = toString.substring(0, toString.length()-1);
		toString += "}";
		return toString;
	}
	
	public static Country min(Country[] array)
	{
		Country min = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(min.compareTo(array[i]) > 0)
			{
				min = array[i];
			}
		}
		return min;
	}
	
	public static Country max(Country[] array)
	{
		Country max = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(max.compareTo(array[i]) < 0)
			{
				max = array[i];
			}
		}
		return max;
	}
}