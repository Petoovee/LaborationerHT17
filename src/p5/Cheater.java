package p5;

import java.util.Random;

/**
 * 
 * @author Petar Nov
 *
 */

public class Cheater extends Player
{
	private Dice dice;
	
	/**
	 * Constructs
	 * 
	 * @param name Insert name in String format here
	 */
	public Cheater(String name)
	{
		super(name);
		dice = new SimpleDice();
	}
	
	/**
	 * Constructs
	 * 
	 * @param name Insert name in String format here
	 * @param dice Insert dice here
	 */
	public Cheater(String name, Dice dice)
	{
		super(name);
		this.dice = dice;
	}
	
	/**
	 * Gets dices
	 * 
	 * @return Returns dice
	 */
	public Dice getDice()
	{
		return dice;
	}
	
	/**
	 * Sets dice
	 * 
	 * @param dice Insert dice here
	 */
	public void setDice(Dice dice)
	{
		this.dice = dice;
	}
	
	/**
	 * Throws dice
	 */
	public int throwDice()
	{
		int res = dice.throwDice();
		if (new Random().nextBoolean())
			if (res < dice.getSides())
				res++;
		return res;
	}
}