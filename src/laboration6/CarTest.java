package laboration6;

import javax.swing.JOptionPane;

public class CarTest {
	public static void main(String[] args) {
		Car carTest = new Car();
		carTest.setBrand(JOptionPane.showInputDialog("Specify brand"));
		carTest.setModel(JOptionPane.showInputDialog("Specify model"));
		carTest.setHorsepower(Integer.parseInt(JOptionPane.showInputDialog("Specify hp")));
		carTest.info();
	}
}
