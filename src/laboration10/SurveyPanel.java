package laboration10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SurveyPanel extends JPanel
{
	// Main panels
	private JTextArea taSummary = new JTextArea(); // Lower panel
	private JPanel pnlNorth = new JPanel(new BorderLayout());
	
	// Upper panel, is to contain the following two panels
	private JPanel pnlNorthNorth = new JPanel(new BorderLayout());
	private JPanel pnlNorthCenter = new JPanel(new GridLayout(1, 2));
	
	// Elements for pnlNorthNorth
	private JLabel lblName = new JLabel("Namn: ");
	private JTextField tfName = new JTextField();
	
	// Elements for pnlNorthCenter
	private JPanel pnlAge = new JPanel(new GridLayout(5, 1));
	private JPanel pnlHobby = new JPanel(new GridLayout(5, 1));
	
	// Elements for pnlAge
	private JRadioButton rb0_17 = new JRadioButton("0 - 17");
	private JRadioButton rb18_64 = new JRadioButton("18 - 64");
	private JRadioButton rb65 = new JRadioButton("65+");
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	// Elements for pnlHobby
	private JCheckBox cbSport = new JCheckBox("Sport");
	private JCheckBox cbDance = new JCheckBox("Dance");
	private JCheckBox cbBirds = new JCheckBox("Birdgazing");
	private JCheckBox cbBridge = new JCheckBox("Brige");
	private JCheckBox cbSong = new JCheckBox("Orchestra");
	
	// Initiate buttons
	JButton btnSummary = new JButton("Lorem impsum");
	
	public SurveyPanel()
	{
		// Configure main panel
		setPreferredSize(new Dimension(300, 360));
		setLayout(new BorderLayout());
		
		// Add elements to pnlAge
		buttonGroup.add(rb0_17);
		buttonGroup.add(rb18_64);
		buttonGroup.add(rb65);
		pnlAge.add(rb0_17);
		pnlAge.add(rb18_64);
		pnlAge.add(rb65);
		rb65.setSelected(true);
		
		// Add elements to pnlHobby
		pnlHobby.setBorder(BorderFactory.createTitledBorder("Hobby"));
		pnlHobby.add(cbSport);
		pnlHobby.add(cbDance);
		pnlHobby.add(cbBirds);
		pnlHobby.add(cbBridge);
		pnlHobby.add(cbSong);
		
		// Add elements and configure pnlNorthNorth
		pnlNorthNorth.add(lblName, BorderLayout.WEST);
		pnlNorthNorth.add(tfName, BorderLayout.CENTER);
		
		// Add elements to pnlNorthCenter
		pnlNorthCenter.add(pnlAge);
		pnlNorthCenter.add(pnlHobby);
		
		// Add elements to pnlNorth
		pnlNorth.add(pnlNorthNorth, BorderLayout.NORTH);
		pnlNorth.add(pnlNorthCenter, BorderLayout.CENTER);
		pnlNorth.add(btnSummary, BorderLayout.SOUTH);
		btnSummary.addActionListener(new SummaryListener());
		
		// Add elements to main panel
		add(pnlNorth, BorderLayout.NORTH);
		add(taSummary, BorderLayout.CENTER);
		
	}
	
	public void summary()
	{
		// Fetch the name and insert in result
		String result = tfName.getText() + "\n";
		
		// What to do for each age selection
		if (rb0_17.isSelected()) {result += "Age: " + "0-17 years\n";}
		if (rb18_64.isSelected()) {result += "Age : " + "18-64 years\n";}
		if (rb65.isSelected()) {result += "Age : " + "65 years\n";}
		
		// What to do for each hobby
		if (cbSport.isSelected()) {result += " Sport";}
		if (cbDance.isSelected()) {result += " Dance";}
		if (cbBirds.isSelected()) {result += " Birdgazing";}
		if (cbBridge.isSelected()) {result += " Bridge";}
		if (cbSong.isSelected()) {result += " Orchestra";}
		result += "\n";
		
		// Update taSummary
		taSummary.setText(result);
	}
	
	private class SummaryListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			summary();
		}
		
	}
}
