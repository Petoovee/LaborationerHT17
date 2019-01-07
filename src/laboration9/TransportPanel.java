package laboration9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TransportPanel extends JPanel implements ActionListener {
	// Config fonts
	private Font fontLabels = new Font("SansSerif", Font.PLAIN, 16); // Labels
	private Font fontButtons = new Font("SansSerif", Font.PLAIN, 18); // Checkboxes

	// Initiate labels
	JLabel lbl1 = new JLabel("   How do you haul ass to school");
	JLabel lbl2 = new JLabel(" ");

	// Initiate checkboxes
	JCheckBox cbCar = new JCheckBox("Moms car");
	JCheckBox cbTrain = new JCheckBox("Smelly train");
	JCheckBox cbBus = new JCheckBox("3rd world bus");
	JCheckBox cbBike = new JCheckBox("Tricycle");
	JCheckBox cbWalk = new JCheckBox("By walking");

	public TransportPanel() {
		// Configure windows
		setPreferredSize(new Dimension(550, 100));
		setBackground(Color.CYAN);

		// Configure labels
		lbl1.setPreferredSize(new Dimension(550, 20));
		lbl1.setFont(fontLabels);
		lbl2.setPreferredSize(new Dimension(550, 20));
		lbl2.setFont(fontLabels);

		// Configure checkboxes

		// Initiate actionlisteners
		cbCar.addActionListener(this);
		cbWalk.addActionListener(this);
		cbTrain.addActionListener(this);
		cbBus.addActionListener(this);
		cbBike.addActionListener(this);
		cbWalk.addActionListener(this);

		// Print objects
		add(lbl1);
		add(cbCar);
		add(cbTrain);
		add(cbBus);
		add(cbBike);
		add(cbWalk);
		add(lbl2);
	}

	public void actionPerformed(ActionEvent e) {
		String str = "   ";
		if (cbCar.isSelected() || cbTrain.isSelected() || cbBus.isSelected() || cbBike.isSelected() || cbWalk.isSelected()) {
			str += "You";
			if (cbCar.isSelected()) {
				str += " drive,";
			}
			if (cbTrain.isSelected()) {
				str += " take a train,";
			}
			if (cbBus.isSelected()) {
				str += " take a bus,";
			}
			if (cbBike.isSelected()) {
				str += " bicycle,";
			}
			if (cbWalk.isSelected()) {
				str += " walk,";
			}
			// Remove the last comma in the string
			str = str.substring(0, str.length()-1);
			
			// If we have more than one selection, replace the second last comma with " and"
			if(str.lastIndexOf(",") > -1) {
				str = str.substring(0, str.lastIndexOf(",")) + " and" + str.substring(str.lastIndexOf(",")+1, str.length());
			}
			str += " to school";
		}
		lbl2.setText(str);
		add(lbl2);
	}

	public static void main(String[] args) {
		TransportPanel panel = new TransportPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JOptionPane.showMessageDialog(null, panel);
	}
}
