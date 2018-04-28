package laboration7;

import javax.swing.JOptionPane;

public class Input {
	public static int getInt(String message) {
		int res = Integer.MIN_VALUE;
		String str = JOptionPane.showInputDialog(message);
		if (str != null && str.length() > 0) { // användaren klickade inte på Avbryt
			res = Integer.parseInt(str); // och minst ett tecken i inmatningen
		}
		return res;
	}

	public long getLong(String message) {
		long res = Long.MIN_VALUE;
		String str = JOptionPane.showInputDialog(message);
		if (str != null && str.length() > 0) { // användaren klickade inte på Avbryt
			res = Long.parseLong(str); // och minst ett tecken i inmatningen
		}
		return res;
	}

	public double getDouble(String message) {
		double res = Double.NaN;
		String str = JOptionPane.showInputDialog(message);
		if (str != null && str.length() > 0) { // användaren klickade inte på Avbryt
			res = Double.parseDouble(str); // och minst ett tecken i inmatningen
		}
		return res;
	}
}
