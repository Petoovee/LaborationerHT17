package p6;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * Displays a chosen text rolling over the window from right to left side.
 * 
 * @author Gruppen
 *
 */
public class RollingTextApp extends JFrame {
	private ColorDisplay display;
	private Timer timer;
	private Chars characters = new Chars();
	private Array7x7[] textArray;
	private int counterFirstChar = 0;
	private int counterLastChar;
	private String text;
	private Array7x7[] stamp = new Array7x7[5]; // Variablen som används för att setDisplay och röra på bokstäverna
	int[] whiteColorArray = { Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE,
			Color.WHITE };

	/**
	 * Constructor which creates a new ColorDisplay and adds it to the frame.
	 */
	public RollingTextApp() {
		display = new ColorDisplay(1, 5, Color.WHITE, Color.BLACK, 2, 20);
		display.updateDisplay();
		setTitle("Rolling Text App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(display);
		pack();
		setVisible(true);
	}

	/**
	 * Runs the other methods to start the program.
	 */
	public void start() {
		userInput();
		initiateTextArray();
		setDefaultValuesStamp();
		useTimer();
	}

	/**
	 * Tilldelar textArray en array med ettor och nollor, kontrollerar sedan vilket
	 * v�rde och f�rg det motsvarar.
	 */
	public void initiateTextArray() {
		textArray = new Array7x7[text.length()];

		for (int i = 0; i < text.length(); i++) {
			textArray[i] = new Array7x7(characters.getCharacterArray(text.charAt(i)));
			for (int row = 0; row < 7; row++) {
				for (int col = 0; col < 7; col++) {
					if (textArray[i].getElement(row, col) == 0) {
						textArray[i].setElement(row, col, Color.WHITE);
					} else {
						textArray[i].setElement(row, col, Color.BLACK);
					}
				}
			}
		}
	}

	/**
	 * Sets the default int values in stamp to Color.WHITE
	 */
	public void setDefaultValuesStamp() {
		Array7 arr = new Array7(whiteColorArray);
		for (int i = 0; i < stamp.length; i++) { // 5 times
			stamp[i] = new Array7x7();
			for (int j = 0; j < 7; j++) { // 7 times
				stamp[i].setCol(j, arr);
			}
		}
	}

	/**
	 * Opens a window for the user to type in a word.
	 */
	public void userInput() {
		text = JOptionPane.showInputDialog("Vilken text ska rulla?");
	}

	/**
	 * Creates a new timer with specific interval.
	 */
	public void useTimer() {
		timer = new Timer();
		timer.schedule(new RunText(), 100, 100);
	}

	/**
	 * Uses coordinates to setDisplay and then updates the display
	 */
	public void setStampDisplay() {
		for (int i = 0; i < 5; i++) {
			display.setDisplay(stamp[i].toIntArray(), 0, i);
		}
		display.updateDisplay();
	}

	/**
	 * 
	 * Private class that includes kod to perform the text movement.
	 * 
	 * @author Gruppen
	 *
	 */
	private class RunText extends TimerTask {
		private int counter = 35 + text.length() * 7;
		private int counterTextArrayIndex = 0;
		private int counterColumn = 0;
		private Array7 leftArray = new Array7(whiteColorArray);

		/**
		 * Moves the text to the left in the window.
		 */
		public void run() {

			// Where the text is moved.
			if (counter > 0) {
				if ((counterTextArrayIndex < text.length()) && (counterColumn < 7)) {
					leftArray = textArray[counterTextArrayIndex].getCol(counterColumn);
				} else {
					leftArray.setArray(whiteColorArray);
				}

				for (int i = 4; i >= 0; i--) {
					leftArray = stamp[i].moveLeft(leftArray);
				}

				// Resets counterColumn and switches to next index in textArray
				if (counterColumn == 6) {
					counterTextArrayIndex++;
					counterColumn = 0;
				}
				setStampDisplay();
				counterColumn++;
				counter--;
			} else {
				timer.cancel();
				start();
			}
		}
	}

	/**
	 * 
	 * Main method that executes the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RollingTextApp app = new RollingTextApp();
		app.start();
	}
}
