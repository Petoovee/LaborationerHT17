package p3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SSPUserInput extends JPanel implements ActionListener
{
	// Initiate objects
	JButton rock = new JButton("Rock");
	JButton scissor = new JButton("Scissor");
	JButton paper = new JButton("Paper");
	JButton newGame = new JButton("New Game");
	JButton quitGame = new JButton("Quit!");
	JPanel userInput = new JPanel();
	
	SSPController controller;
	
	public SSPUserInput(SSPController controller)
	{
		// Initiate controller
		this.controller = controller;
		
		// Add listeners
		rock.addActionListener(this);
		scissor.addActionListener(this);
		paper.addActionListener(this);
		newGame.addActionListener(this);
		quitGame.addActionListener(this);
		
		// Add objects
		add(rock);
		add(scissor);
		add(paper);
		add(newGame);
		add(quitGame);
	}
	
	// Assigns a number to each of the choices
	public void actionPerformed(ActionEvent e)
	{
		int choice = 0;
		if (e.getSource() == rock)
		{
			choice = 0;
		}
		if (e.getSource() == scissor)
		{
			choice = 1;
		}
		if (e.getSource() == paper)
		{
			choice = 2;
		}
		if (e.getSource() == newGame)
		{
			choice = 3;
		}
		if (e.getSource() == quitGame)
		{
			choice = 4;
		}
		controller.setPlayerChoice(choice);
	}
}
