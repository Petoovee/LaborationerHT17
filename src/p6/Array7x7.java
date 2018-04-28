package p6;

public class Array7x7
{
	private Array7[] array7x7 = new Array7[7];
	
	// Constructors
	public Array7x7()
	{
		for (int xpos = 0; xpos < array7x7.length; xpos++)
		{
			array7x7[xpos] = new Array7();
		}
	}
	
	public Array7x7(int[][] intArray) // Constructs an array7x7 using a regular 2-D integer array
	{
		setArray(intArray);
	}
	
	public Array7x7(Array7x7 array7x7) // Constructs each element in the 7x7 by using the setElement method from array7
	{
		setArray(array7x7);
	}
	
	// Getters and setters for the whole array
	public int[][] getArray()
	{
		int[][] returnVal = new int[7][7];
		for (int xpos = 0; xpos < array7x7.length; xpos++)
		{
			for (int ypos = 0; ypos < array7x7.length; ypos++)
			{
				returnVal[xpos][ypos] = array7x7[xpos].getElement(ypos);
			}
		}
		return returnVal;
	}
	
	public void setArray(int[][] intArray)
	{
		for (int xpos = 0; xpos < array7x7.length; xpos++)
		{
			this.array7x7[xpos].setArray(intArray[xpos]);
		}
	}
	
	public void setArray(Array7x7 array7x7)
	{
		for (int xpos = 0; xpos < this.array7x7.length; xpos++)
		{
			for (int ypos = 0; ypos < this.array7x7.length; ypos++)
			{
				this.array7x7[xpos].setElement(ypos, array7x7.getElement(xpos, ypos));
			}
		}
	}
	
	public int[][] toIntArray() // Converts the 7x7 to a regular 2-D integer array
	{
		int[][] intArray = new int[7][7];
		return intArray;
	}
	
	// Getters and setters for individual rows
	public Array7 getRow(int xpos)
	{
		Array7 array7Copy = new Array7(array7x7[xpos].toIntArray());
		return array7Copy;
	}
	
	public void setRow(int xpos, Array7 array7)
	{
		array7x7[xpos].setArray(array7);
	}
	
	// Getters and setters for individual columns
	
	public void setCol(int col, Array7 array7) // Sets an element in each row according to an Array7
	{
		Array7 arrayClone = new Array7();
		for (int pos = 0; pos < array7x7.length; pos++)
		{
			this.array7x7[pos].setElement(col, array7.getElement(pos));
			arrayClone.setElement(pos, array7.getElement(pos));
		}
		System.out.println("Array7x7 setCol() set " +arrayClone.toString());
		System.out.println("----------");
	}
	
	public Array7 getCol(int ypos) // Makes a new Array7 and sets each value according to the Y-position given
	{
		Array7 returnVal = new Array7();
		for (int xpos = 0; xpos < array7x7.length; xpos++)
		{
			returnVal.setElement(xpos, this.array7x7[xpos].getElement(ypos));
		}
		System.out.println("Array7.getCol() returned " +returnVal.toString());
//		System.out.println("----------");
		return returnVal;
	}
	
	// Getters and setters for individual elements in the array
	public int getElement(int xpos, int ypos)
	{
		int returnVal = array7x7[xpos].getElement(ypos);
		return returnVal;
	}
	
	public void setElement(int xpos, int ypos, int val)
	{
		array7x7[xpos].setElement(ypos, val);
	}
	
	// Shifters
	public void shiftColRight(int ypos) // Shifts one column
	{
		Array7 tempArray = new Array7();
		for (int x = 0; x < 6; x++)
		{
			tempArray.setElement(x, getElement(x + 1, ypos));
		}
		tempArray.setElement(6, this.getElement(0, ypos));
		this.setCol(ypos, tempArray);
	}
	
	public void shiftAllRight(Array7 array)
	{
		for (int xpos = 6; xpos > 0; xpos--)
		{
			setCol(xpos, getCol(xpos - 1));
		}
		setCol(0, array);
	}
	
	public void shiftColLeft(int ypos) // Shifts one column
	{
		Array7 tempArray = new Array7();
		for (int x = 6; x > 0; x--)
		{
			tempArray.setElement(x, getElement(x - 1, ypos));
		}
		tempArray.setElement(0, this.getElement(6, ypos));
		this.setCol(ypos, tempArray);
	}
	
	public void shiftAllLeft(Array7 array)
	{
		for (int xpos = 0; xpos < 7; xpos++)
		{
			if (xpos == 6)
			{
				setCol(xpos, array);
			} else
			{
				setCol(xpos, getCol(xpos + 1));
			}
		}
	}
	
}