package p3;

import javax.swing.JOptionPane;

public class SSPController {
	SSPPlayer player = new SSPPlayer();
	SSPViewer viewer = new SSPViewer();
	int computerChoice = 0, playerChoice = 0;
	int computerScore = 0, playerScore = 0;

	// Constructor
	public SSPController(SSPPlayer player, SSPViewer viewer) {
		this.player = player;
		this.viewer = viewer;
	}

	// Is called whenever the user makes a choice
	public void setPlayerChoice(int playerChoice) {
		this.computerChoice = player.getChoice();
		this.playerChoice = playerChoice;
		System.out.println("P:" + playerChoice + "   C:" + computerChoice); // Debug
		doStuff();
	}

	// Does stuff, with an outcome for every situation
	public void doStuff() {
		switch (playerChoice) {
		case 4:
			System.exit(0);
			break;
		case 3:
			computerScore = 0;
			playerScore = 0;
			break;
		case 2:
			switch (computerChoice) {
			case 2:
				viewer.setChoice("Paper", "Paper");
				break;
			case 1:
				viewer.setChoice("Paper", "Scissor");
				computerScore++;
				break;
			case 0:
				viewer.setChoice("Paper", "Rock");
				playerScore++;
				break;
			}
			break;
		case 1:
			switch (computerChoice) {
			case 2:
				viewer.setChoice("Scissor", "Paper");
				playerScore++;
				break;
			case 1:
				viewer.setChoice("Scissor", "Scissor");
				break;
			case 0:
				viewer.setChoice("Scissor", "Rock");
				computerScore++;
				break;
			}
			break;
		case 0:
			switch (computerChoice) {
			case 2:
				viewer.setChoice("Rock", "Paper");
				computerScore++;
				break;
			case 1:
				viewer.setChoice("Rock", "Scissor");
				playerScore++;
				break;
			case 0:
				viewer.setChoice("Rock", "Rock");
				break;
			}
			break;
		}
		viewer.setScore(playerScore, computerScore);
		if (playerScore == 3) {
			JOptionPane.showMessageDialog(null, "You win!");
			playerScore = 0;
			computerScore = 0;
		}
		if (computerScore == 3) {
			JOptionPane.showMessageDialog(null, "You lose!");
			playerScore = 0;
			computerScore = 0;
		}
		viewer.setScore(playerScore, computerScore);
	}
}
