package p5;

public class TestTestOrdinaryPlayer {
	public static void main(String[] args) {
		// ordinary();
		cheater();
	}

	public static void ordinary() {
		SimpleDice dice = new SimpleDice(6);
		Player player1 = new OrdinaryPlayer("Gustav", dice);
		Player player2 = new OrdinaryPlayer("Valborg", dice);
		Game game = new Game(player1, player2);
		game.play(true);
	}

	public static void cheater() {
		Player player1 = new OrdinaryPlayer("Viktor", new SimpleDice(6));
		Player player2 = new Cheater("Signe", new SimpleDice(6));
		Game game = new Game(player1, player2);
		TextWindow.println(" \nResult of ten games");
		for (int i = 0; i < 10; i++) {
			game.play(false);
		}
	}
}
