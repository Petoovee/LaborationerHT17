package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * Creates a new test environment for the first testing program.
 * 
 * @author Gruppen
 *
 */
public class Test1UI extends JFrame implements ActionListener {
	private Controller controller = new Controller(this);
	private Array7x7 array = new Array7x7();
	private Array7 leftCol = new Array7();
	private Array7 bottomRow = new Array7();

	private JPanel pnlWest = new JPanel(new GridLayout(7, 1));
	private JPanel pnlSouth = new JPanel(new GridLayout(1, 7));
	private JPanel pnlCenter = new JPanel(new GridLayout(7, 7, 5, 5));
	private JPanel pnlEast = new JPanel(new BorderLayout());
	private JPanel pnlEastTop = new JPanel(new GridLayout(3, 1));
	private JPanel pnlEastTopText = new JPanel(new GridLayout(1, 2));
	private JPanel pnlEastBottom = new JPanel(new GridLayout(3, 1));
	private JPanel pnlEastBottomText = new JPanel(new GridLayout(1, 2));
	private JTextField[] tfWest = new JTextField[7];
	private JTextField[] tfSouth = new JTextField[7];
	private JLabel[][] lblCenter = new JLabel[7][7];
	private JLabel lblRow = new JLabel("Rad nr: ");
	private JTextField tfRow = new JTextField();
	private JLabel lblCol = new JLabel("Kolumn nr: ");
	private JTextField tfCol = new JTextField();
	private JButton btnReadRow = new JButton("Läs rad");
	private JButton btnPrintRow = new JButton("Skriv rad");
	private JButton btnReadCol = new JButton("Läs kolumn");
	private JButton btnPrintCol = new JButton("Skriv kolumn");

	/**
	 * Sets the default values in all the boxes before they will be changed.
	 */
	public void setDefaultValues() {
		tfRow = new JTextField();
		tfRow.setText("0");
		tfCol = new JTextField();
		tfCol.setText("0");
		for (int i = 0; i < 7; i++) {
			tfWest[i] = new JTextField();
			tfWest[i].setText("0");
			;
			tfWest[i].setPreferredSize(new Dimension(50, 20));
			tfSouth[i] = new JTextField();
			tfSouth[i].setText("0");
			;
		}
		for (int row = 0; row < lblCenter.length; row++) {
			for (int col = 0; col < lblCenter[row].length; col++) {
				lblCenter[row][col] = new JLabel("0");
				lblCenter[row][col].setPreferredSize(new Dimension(30, 30));
				lblCenter[row][col].setHorizontalAlignment(JLabel.CENTER);
				lblCenter[row][col].setBackground(new java.awt.Color(150, 150, 150));
				lblCenter[row][col].setOpaque(true);
			}
		}
	}

	/**
	 * Adds the actionlisteners to the buttons.
	 */
	public void addActionListeners() {
		btnReadRow.addActionListener(this);
		btnPrintRow.addActionListener(this);
		btnReadCol.addActionListener(this);
		btnPrintCol.addActionListener(this);
	}

	/**
	 * Constructor that adds everything to the frame.
	 */
	public Test1UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		setDefaultValues();
		addActionListeners();

		this.add(pnlWest, BorderLayout.WEST);
		this.add(pnlEast, BorderLayout.EAST);
		this.add(pnlCenter, BorderLayout.CENTER);
		this.add(pnlSouth, BorderLayout.SOUTH);

		for (int row = 0; row < 7; row++) {
			pnlWest.add(tfWest[row]);
			pnlSouth.add(tfSouth[row]);
			for (int col = 0; col < 7; col++) {
				pnlCenter.add(lblCenter[row][col]);
			}
		}
		pnlEast.add(pnlEastTop, BorderLayout.NORTH);
		pnlEast.add(pnlEastBottom, BorderLayout.SOUTH);

		pnlEastTop.add(pnlEastTopText);
		pnlEastTop.add(btnReadRow);
		pnlEastTop.add(btnPrintRow);
		pnlEastTopText.add(lblRow);
		pnlEastTopText.add(tfRow);

		pnlEastBottom.add(pnlEastBottomText);
		pnlEastBottom.add(btnReadCol);
		pnlEastBottom.add(btnPrintCol);
		pnlEastBottomText.add(lblCol);
		pnlEastBottomText.add(tfCol);

		pack();
		setVisible(true);
	}

	/**
	 * Prints the values in all the labels.
	 */
	public void printValues() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				lblCenter[i][j].setText("" + array.getElement(i, j));
			}
			tfWest[i].setText("" + leftCol.getElement(i));
			tfSouth[i].setText("" + bottomRow.getElement(i));
		}
	}

	/**
	 * Reads the values from all the labels.
	 */
	public void readValues() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				array.setElement(i, j, Integer.parseInt(lblCenter[i][j].getText()));
			}
			leftCol.setElement(i, Integer.parseInt(tfWest[i].getText()));
			bottomRow.setElement(i, Integer.parseInt(tfSouth[i].getText()));
		}
	}

	/**
	 * Performs tasks when each button in the program is pressed.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		readValues();
		controller.setValues(array, leftCol, bottomRow);
		if (e.getSource() == btnReadRow) {
			controller.readRow(Integer.parseInt(tfRow.getText()));
		} else if (e.getSource() == btnPrintRow) {
			controller.printRow(Integer.parseInt(tfRow.getText()));
		} else if (e.getSource() == btnReadCol) {
			controller.readCol(Integer.parseInt(tfCol.getText()));
		} else if (e.getSource() == btnPrintCol) {
			controller.printCol(Integer.parseInt(tfCol.getText()));
		}

	}

	/**
	 * 
	 * Main method that executes the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Test1UI program = new Test1UI();
	}
}
