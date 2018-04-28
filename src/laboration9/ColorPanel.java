package laboration9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorPanel extends JPanel implements ActionListener
{
	// Initiate objects
	private JLabel label = new JLabel("Choose your pill, Neo ");
	private JRadioButton rbRed = new JRadioButton("Red");
	private JRadioButton rbGreen = new JRadioButton("Green");
	private JRadioButton rbBlue = new JRadioButton("Blue");
	private JRadioButton rbRandom = new JRadioButton("Mix them for me Morpheus");
	Random rand = new Random();
	
	public ColorPanel()
	{
		// Configure windows
		setPreferredSize(new Dimension(200, 130));
		label.setPreferredSize(new Dimension(180,20));
		
		//Configure buttons
		rbRed.setPreferredSize(new Dimension(180,20));
		rbGreen.setPreferredSize(new Dimension(180,20));
		rbBlue.setPreferredSize(new Dimension(180,20));
		rbRandom.setPreferredSize(new Dimension(180,20));
		
//		// Initiate some unnecessary group?
//		ButtonGroup group = new ButtonGroup();
//		
//		// Add objects to the unused group?
//		group.add(rbRed);
//		group.add(rbGreen);
//		group.add(rbBlue);
//		group.add(rbRandom);
//		
//		// For reasons unknown, add all actionlisteners to one method
//		addListeners();
		
		// Actually add the buttons to the object we're working on
		add(label);
		add(rbRed);
		add(rbGreen);
		add(rbBlue);
		add(rbRandom);
		
		// And add the listeners to them
		rbRed.addActionListener(this);
		rbGreen.addActionListener(this);
		rbBlue.addActionListener(this);
		rbRandom.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (rbRed.isSelected() == true) {setBackground(Color.RED);}
		if (rbGreen.isSelected() == true) {setBackground(Color.GREEN);}
		if (rbBlue.isSelected() == true) {setBackground(Color.BLUE);}
		if (rbRandom.isSelected() == true) {setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));}
	}
	
//	// Make a separate class for giggles, then disable it b/c PITA
//	public class ColorListener implements ActionListener
//	{
//		public void actionPerformed(ActionEvent e)
//		{
//			if (rbRed.isSelected() == true) {setBackground(Color.RED);}
//			if (rbGreen.isSelected() == true) {setBackground(Color.GREEN);}
//			if (rbBlue.isSelected() == true) {setBackground(Color.BLUE);}
//			if (rbRandom.isSelected() == true) {setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));}
//		}
//	}
	
	public static void main(String[] args)
	{
		ColorPanel panel = new ColorPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JOptionPane.showMessageDialog(null, panel);
	}
}
