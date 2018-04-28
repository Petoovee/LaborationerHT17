package p2;

import javax.swing.JOptionPane;

public class Excercise2a {
	public void demo() {
		Painting p1 = new Painting("Mona Lisa", "Leonardo da Vinci", 1507);
		Painting p2 = new Painting("Guernica", "Pablo Picasso", 1937);

		JOptionPane.showMessageDialog(null, p1.getTitle() + " painted by " + p1.getPainter() + " in " + p1.getYear());
		JOptionPane.showMessageDialog(null, p2.toString());
	}

	public static void main(String[] args) {
		Excercise2a prog = new Excercise2a();
		prog.demo();
	}
}
