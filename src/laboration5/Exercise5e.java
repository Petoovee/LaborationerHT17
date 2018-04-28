package laboration5;

import javax.swing.ImageIcon;

/**
 * Flytta bild i ett PaintWindow-fönster
 * 
 * @author tsroax
 */
public class Exercise5e {

	public void leftRight() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon("images/Gubbe.jpg");
		for (int x = 0; x <= 500; x += 5) {
			window.showImage(man, x, 150);
			PaintWindow.pause(50);
		}
	}

	public void rightLeft() {
	}

	public void upDown() {
	}

	public void downUp() {
	}

	public static void main(String[] args) {
		Exercise5e e5e = new Exercise5e();
		e5e.leftRight();
	}
}
