package p6;

import java.util.Random;

public class Array7
{
	private int[] array7 = new int[7];
	private Random rand = new Random();
	
	// Constructor goes here
	public Array7()
	{
		for(int pos = 0; pos < array7.length; pos++)
		{
			this.array7[pos] = rand.nextInt(2);
		}
	}
	
	public Array7(int[] array)
	{
		int[] arrayClone = array.clone();
		{
			for(int pos = 0; pos < array7.length; pos++)
			{
				this.array7[pos] = arrayClone[pos];
			}
		}
	}
	
	public Array7(Array7 array7)
	{
		int[] arrayClone = array7.toIntArray();
		for(int pos = 0; pos < this.array7.length; pos++)
		{
			this.array7[pos] = arrayClone[pos];
		}
	}
	
	// Getters and setters for the whole array
	public void setArray(int[] intArray)
	{
		this.array7 = intArray.clone();
	}
	
	public void setArray(Array7 array7)
	{
		int[] arrayClone = array7.toIntArray();
		for (int pos = 0; pos < this.array7.length; pos++)
		{
			this.array7[pos] = arrayClone[pos];
		}
	}
	
	public int[] getArray()
	{
		int[] arrayCopy = this.array7.clone();
		return arrayCopy;
	}
	
	public int[] toIntArray()
	{
		int[] intArray = this.array7.clone();
		return intArray;
	}
	
	public String toString()
	{
		int[] arrayCopy = this.array7.clone();
		String toString = "";
		for(int pos = 0; pos < 7; pos++)
		{
			toString += arrayCopy[pos];
		}
		return toString;
	}
	
	// Getters and setters for individual elements in the array
	public int getElement(int pos)
	{
		int[] arrayCopy = this.array7.clone();
		int returnVal = arrayCopy[pos];
		return returnVal;
	}
	
	public void setElement(int pos, int val)
	{
		this.array7[pos] = val;
	}
}