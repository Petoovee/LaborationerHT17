package p5;

public class TestDice {
	public static void test(Player player, int nbrOfThrows) {
		OrdinaryPlayer oPlayer;
		Cheater cheater;
		int[] res = null;

		if (player instanceof OrdinaryPlayer) {
			oPlayer = (OrdinaryPlayer) player;
			res = new int[oPlayer.getDice().getSides() + 1];
			for (int i = 0; i < nbrOfThrows; i++) {
				res[player.throwDice()]++;
			}
		} else {
			cheater = (Cheater) player;
			res = new int[cheater.getDice().getSides() + 1];
			for (int i = 0; i < nbrOfThrows; i++) {
				res[player.throwDice()]++;
			}
		}

		for (int i = 1; i < res.length; i++) {
			TextWindow.println(String.format("%-4s%10d", (i), res[i]));
		}

	}

	public static void test(Dice dice, int nbrOfThrows) {
		int[] res = new int[dice.getSides() + 1];
		for (int i = 0; i != nbrOfThrows; i++) {
			res[dice.throwDice()]++;
		}

		for (int i = 1; i < res.length; i++) {
			TextWindow.println(String.format("%-4s%10d", (i), res[i]));
		}
	}

	public static void main(String[] args) {
		TestDice.test(new SimpleDice(6), 1000000);
		TextWindow.println();
		TestDice.test(new SimpleDice(4), 1000000);

		TextWindow.println();

		TestDice.test(new OrdinaryPlayer("Rut", new SimpleDice(6)), 1000000);
		TextWindow.println();
		TestDice.test(new Cheater("Fuffe", new SimpleDice(6)), 1000000);
	}
}
