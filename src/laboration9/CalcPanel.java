package laboration9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcPanel extends JPanel implements ActionListener {
	// Config fonts
	private Font fontLabels = new Font("SansSerif", Font.PLAIN, 18); // Labels
	private Font fontButtons = new Font("SansSerif", Font.PLAIN, 24); // Buttons

	// Initiate labels
	private JLabel lblNbr1 = new JLabel("Number 1:");
	private JLabel lblNbr2 = new JLabel("Number 2:");
	private JLabel lblTot = new JLabel("Total:");

	// Wrapper
	private JPanel centerWrapper = new JPanel();

	// Initiate textFields
	private JTextField tfNbr1 = new JTextField();
	private JTextField tfNbr2 = new JTextField();
	private JTextField tfTot = new JTextField();

	// Initiate Buttons
	private JButton btnAdd = new JButton("+");
	private JButton btnSub = new JButton("-");

	public CalcPanel() {
		centerWrapper.setLayout(new GridLayout(3, 2));
		setPreferredSize(new Dimension(250, 105));

		// Config labels
		lblNbr1.setPreferredSize(new Dimension(100, 20));
		lblNbr1.setFont(fontLabels);
		lblNbr1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNbr2.setPreferredSize(new Dimension(100, 20));
		lblNbr2.setFont(fontLabels);
		lblNbr2.setHorizontalAlignment(SwingConstants.CENTER);

		lblTot.setPreferredSize(new Dimension(100, 20));
		lblTot.setFont(fontLabels);
		lblTot.setHorizontalAlignment(SwingConstants.CENTER);

		// Config textFields
		tfNbr1.setPreferredSize(new Dimension(100, 20)); // textField 1
		tfNbr2.setPreferredSize(new Dimension(100, 20)); // textField 2
		tfTot.setPreferredSize(new Dimension(100, 20));
		tfNbr1.setFont(fontButtons);
		tfNbr2.setFont(fontButtons);
		tfTot.setFont(fontButtons);

		// Config buttons
		btnAdd.setPreferredSize(new Dimension(100, 20));
		btnAdd.setFont(fontButtons);
		btnAdd.addActionListener(this);
		btnSub.setPreferredSize(new Dimension(100, 20));
		btnSub.setFont(fontButtons);
		btnSub.addActionListener(this);

		// Prints number 1
		centerWrapper.add(lblNbr1);
		centerWrapper.add(tfNbr1);

		// Prints number 2
		centerWrapper.add(lblNbr2);
		centerWrapper.add(tfNbr2);

		// Prints buttons
		centerWrapper.add(btnAdd);
		centerWrapper.add(btnSub);

		// Prints centerWrapper
		add(centerWrapper, BorderLayout.CENTER);

		// Prints total
		add(lblTot, BorderLayout.SOUTH);
		add(tfTot, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		// Initiate variables
		double nbr1, nbr2, total = 0;
		nbr1 = Double.parseDouble(tfNbr1.getText());
		nbr2 = Double.parseDouble(tfNbr2.getText());

		// Methods
		if (e.getSource() == btnAdd) {
			total = nbr1 + nbr2;
		}
		if (e.getSource() == btnSub) {
			total = nbr1 - nbr2;
		}

		// Update total
		tfTot.setText("" + total);
	}
}