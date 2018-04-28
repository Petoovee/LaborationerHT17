package laboration9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FCConverterPanel extends JPanel implements ActionListener {
	// Config fonts
	private Font fontLabels = new Font("SansSerif", Font.PLAIN, 16); // Labels
	private Font fontButtons = new Font("SansSerif", Font.PLAIN, 14); // Buttons

	// // Initiate panels
	// private FCConverterPanel panel = new FCConverterPanel();

	// Initiate labels
	private JLabel lblFar = new JLabel("Fahrenheit:");
	private JLabel lblCel = new JLabel("Celsius:");

	// Initiate textField
	private JTextField tfCel = new JTextField();
	private JTextField tfFar = new JTextField();

	// Initiate buttons
	private JButton btnFar = new JButton("To fahrenheit!");
	private JButton btnCel = new JButton("To celsius!");

	public FCConverterPanel() {

		// Config panels
		setBorder(BorderFactory.createLineBorder(Color.BLACK));

		// Config labels
		lblFar.setPreferredSize(new Dimension(100, 20));
		lblFar.setFont(fontLabels);
		lblFar.setHorizontalAlignment(SwingConstants.CENTER);

		lblCel.setPreferredSize(new Dimension(100, 20));
		lblCel.setFont(fontLabels);
		lblCel.setHorizontalAlignment(SwingConstants.CENTER);

		// Config textFields
		tfCel.setPreferredSize(new Dimension(100, 20));
		tfCel.setFont(fontButtons);
		tfFar.setPreferredSize(new Dimension(100, 20));
		tfFar.setFont(fontButtons);

		// Config buttons
		btnFar.setPreferredSize(new Dimension(140, 20));
		btnFar.setFont(fontButtons);
		btnFar.addActionListener(this);
		btnCel.setPreferredSize(new Dimension(120, 20));
		btnCel.setFont(fontButtons);
		btnCel.addActionListener(this);

		// Render components
		add(lblCel);
		add(tfCel);
		add(lblFar);
		add(tfFar);
		add(btnFar);
		add(btnCel);

	}

	public void actionPerformed(ActionEvent e) {
		// Initiate variables
		double celsius, fahrenheit;

		// Fahrenheit method
		if (e.getSource() == btnFar) {
			celsius = Double.parseDouble(tfCel.getText());
			fahrenheit = 32 + celsius * 1.8;
			tfFar.setText(String.format("%1.3f", fahrenheit));
		}

		// Celsius method
		if (e.getSource() == btnCel) {
			fahrenheit = Double.parseDouble(tfFar.getText());
			celsius = (fahrenheit - 32) / 1.8;
			tfCel.setText(String.format("%1.3f", celsius));
		}

	}
}
