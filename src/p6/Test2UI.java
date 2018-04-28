package p6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/*
 * @Author Grupp 14
 * Used for testing the second part of the assignment
 */

@SuppressWarnings("serial")
public class Test2UI extends JPanel implements ActionListener {
	private JPanel panelLeft = new JPanel(new GridLayout(7, 1));
	private JPanel panelCenter = new JPanel(new GridLayout(7, 7, 5, 5));
	private JPanel panelRight = new JPanel(new GridLayout(7, 1));
	private JPanel panelButtons = new JPanel(new GridLayout(1, 2));
	private JButton btnLeft = new JButton("<- Shift to the left <-");
	private JButton btnRight = new JButton("-> Shift to the right ->");
	private JTextField[] tfLeft = new JTextField[7];
	private JTextField[] tfRight = new JTextField[7];
	private JLabel[][] lblCenter = new JLabel[7][7];
	private Array7x7 array = new Array7x7();

	// Sets the standard values for the text fields and labels.
	public void setValues() {
		for (int i = 0; i < 7; i++) {
			tfLeft[i] = new JTextField();
			tfLeft[i].setText("1");
			tfRight[i] = new JTextField();
			tfRight[i].setText("1");
			tfLeft[i].setPreferredSize(new Dimension(50, 10));
			tfRight[i].setPreferredSize(new Dimension(50, 10));
		}
		for (int row = 0; row < lblCenter.length; row++) {
			for (int col = 0; col < lblCenter[row].length; col++) {
				lblCenter[row][col] = new JLabel("0");
				lblCenter[row][col].setPreferredSize(new Dimension(30, 30));
				lblCenter[row][col].setHorizontalAlignment(JLabel.CENTER);
				lblCenter[row][col].setOpaque(true);
			}
		}
	}

	/**
	 * Constructor that adds the panels in the window and sets the values. Also sets
	 * background color to the labels.
	 */
	public Test2UI() {
		setPreferredSize(new Dimension(400, 400));
		setLayout(new BorderLayout());
		panelLeft.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelCenter.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelRight.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelButtons.setBorder(new EmptyBorder(10, 10, 10, 10));
		btnLeft.setPreferredSize(new Dimension(1, 20));
		btnRight.setPreferredSize(new Dimension(1, 20));
		panelButtons.add(btnLeft);
		panelButtons.add(btnRight);

		setValues();

		add(panelLeft, BorderLayout.WEST);
		add(panelCenter, BorderLayout.CENTER);
		add(panelRight, BorderLayout.EAST);
		add(panelButtons, BorderLayout.SOUTH);

		for (int i = 0; i < 7; i++) {
			panelLeft.add(tfLeft[i]);
			panelRight.add(tfRight[i]);
		}

		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				panelCenter.add(lblCenter[row][col]);
				lblCenter[row][col].setBackground(Color.gray);
			}
		}
		update();
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);
	}

	// For performing different tasks, depending on the button used
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnLeft) {
			Array7 temp = new Array7();
			for (int i = 0; i < 7; i++) {
				temp.setElement(i, Integer.parseInt(tfRight[i].getText()));
			}
			array.shiftAllLeft(temp);

		}
		if (e.getSource() == btnRight) {
			Array7 temp = new Array7();
			for (int i = 0; i < 7; i++) {
				temp.setElement(i, Integer.parseInt(tfLeft[i].getText()));
			}
			array.shiftAllRight(temp);
		}
		update();
	}

	// Updates the center 7x7 grid
	public void update() {
		System.out.println("Printing 7x7 used in update");
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				lblCenter[row][col].setText(String.valueOf(array.getElement(row, col)));
			}
			System.out.println("" + array.getRow(row).toString());
		}
		System.out.println("----------");
		repaint();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Array7x7");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Test2UI());
		frame.pack();
		frame.setVisible(true);
	}
}
