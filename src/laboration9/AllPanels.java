package laboration9;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AllPanels extends JPanel {
	public void start() {
		// Initiate all the panels
		TransportPanel transportPanel = new TransportPanel();
		ColorPanel colorPanel = new ColorPanel();
		CalcPanel calcPanel = new CalcPanel();
		FCConverterPanel converterPanel = new FCConverterPanel();
		JPanel panel = new JPanel();

		// Configure the window
		panel.setPreferredSize(new Dimension(800, 700));
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		// Add all the panels
		panel.add(calcPanel);
		panel.add(converterPanel);
		panel.add(colorPanel);
		panel.add(transportPanel);

		// Show the panel
		JOptionPane.showMessageDialog(null, panel);
	}

	// Makes the class runnable
	// public static void main(String[] args)
	// {
	// // Initiate all the panels
	// TransportPanel transportPanel = new TransportPanel();
	// ColorPanel colorPanel = new ColorPanel();
	// CalcPanel calcPanel = new CalcPanel();
	// FCConverterPanel converterPanel = new FCConverterPanel();
	// JPanel panel = new JPanel();
	//
	// // Configure the window
	// panel.setPreferredSize(new Dimension(800, 700));
	// panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	//
	// // Add all the panels
	// panel.add(calcPanel);
	// panel.add(converterPanel);
	// panel.add(colorPanel);
	// panel.add(transportPanel);
	//
	// // Show the panel
	// JOptionPane.showMessageDialog(null, panel);
	// }
}
