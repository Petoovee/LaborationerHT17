package p3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SSPViewer extends JPanel
{
	private int playerWins = 0, computerWins = 0;
	
	// Main window labels
	private JLabel titleLabel = new JLabel("First to three!");
	private JPanel scorePanel = new JPanel(new GridLayout(1, 2));
	
	// Player Side
	private JPanel playerPanel = new JPanel(new GridLayout(3, 1));
	private JLabel playerLabel = new JLabel("Player");
	private JLabel playerScore = new JLabel("" + playerWins);
	private JLabel playerChoice = new JLabel("0");
	
	// Computer Side
	private JPanel computerPanel = new JPanel(new GridLayout(3, 1));
	private JLabel computerLabel = new JLabel("Computer");
	private JLabel computerScore = new JLabel("" + computerWins);
	private JLabel computerChoice = new JLabel("0");
	
	public SSPViewer()
	{
		// Configure main window
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(200, 100));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Configure player side
		playerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerScore.setHorizontalAlignment(SwingConstants.CENTER);
		playerChoice.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Configure computer side
		computerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		computerScore.setHorizontalAlignment(SwingConstants.CENTER);
		computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Assemble player side
		// playerPanel.setPreferredSize(new Dimension(200, 300));
		playerPanel.add(playerLabel);
		playerPanel.add(playerScore);
		playerPanel.add(playerChoice);
		
		// Assemble computer side
		// computerPanel.setPreferredSize(new Dimension(200, 300));
		computerPanel.add(computerLabel);
		computerPanel.add(computerScore);
		computerPanel.add(computerChoice);
		
		// Assemble scorePanel
		scorePanel.add(computerPanel);
		scorePanel.add(playerPanel);
		
		// Assemble main object
		add(titleLabel, BorderLayout.NORTH);
		add(scorePanel, BorderLayout.CENTER);
		
	}
	
	// Is used by the controller to set the values of playerScore and computerScore
	public void setScore(int player, int computer)
	{
		playerScore.setText("" + player);
		computerScore.setText("" + computer);
	}
	
	// Is used by the controller to set the value of playerChoice and computerCoice
	public void setChoice(String player, String computer)
	{
		playerChoice.setText(player);
		computerChoice.setText(computer);
	}
}
