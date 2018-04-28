package p3;

import java.util.Random;

public class SSPPlayer
{
	private final static Random rand = new Random();
	
	// Used to get the randomized answer for the computer
	public int getChoice()
	{
		return rand.nextInt(3);
	}
}
