package laboration5;

import javax.swing.ImageIcon;

public class Exercise5n {
	public void program() {
		String menu = "MENYVAL:\n\n" + "" + "1. Steg vänster\n2. Steg uppåt\n3. Steg höger\n4. Steg nedåt\n"
				+ "-----------------------\n" + "0. Avsluta";
		ImageIcon image = new ImageIcon("images/Gubbe.jpg");
		ImageController cont = new ImageController(image);
		// int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	public static void main(String[] args) {
		Exercise5n e8n = new Exercise5n();
		e8n.program();
	}
}
