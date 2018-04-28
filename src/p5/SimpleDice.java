package p5;

import java.util.Random;

/**
 * @author Petar Nov
 *
 */
public class SimpleDice implements Dice
{
	private int sides;
	
	/**
	 *  Constructs
	 */
	public SimpleDice()
	{
		this.sides = 6;
	}
	
	/**
	 *  Constructs
	 * @param sides Insert sides in int here
	 */
	public SimpleDice(int sides)
	{
		if (sides <= 0)
			throw new NegativeSidesException();
		else
			this.sides = sides;
	}
	
	/**
	 * Gets sides
	 */
	public int getSides()
	{
		int returnSides = this.sides;
		return returnSides;
	}
	
	/**
	 * Throws dice
	 */
	public int throwDice()
	{
		return (new Random().nextInt(this.sides) + 1);
	}
}
