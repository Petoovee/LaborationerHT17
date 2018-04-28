package p5;

/**
 * 
 * @author Petar Nov
 *
 */

public class OrdinaryPlayer extends Player {
	private Dice dice;

	/**
	 * Constructs
	 * 
	 * @param name
	 *            Insert name here
	 */
	public OrdinaryPlayer(String name) {
		super(name);
		dice = new SimpleDice();
	}

	/**
	 * Constructs
	 * 
	 * @param name
	 *            Insert name here
	 * @param dice
	 *            Insert dice here
	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}

	/**
	 * Gets dice
	 * 
	 * @return Returns dice
	 */
	public Dice getDice() {
		return dice;
	}

	/**
	 * Sets dice
	 * 
	 * @param dice
	 *            Insert dice here
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * Throws dice
	 */
	public int throwDice() {
		return dice.throwDice();
	}
}
