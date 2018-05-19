package laboration8;

import java.awt.Color;

import javax.swing.ImageIcon;

import laboration8.PaintWindow;

public class Exercise8n {
	private PaintWindow window;
	private BouncingPicture bPicture1;
	private BouncingPicture bPicture2;

	public void action1() {
		Picture man1, man2;
		ImageIcon image1 = new ImageIcon("images/sommar.jpg");
		ImageIcon image2 = new ImageIcon("images/liggandegubbe.jpg");
		ImageIcon image3 = new ImageIcon("images/gubbe.jpg");

		window = new PaintWindow(image1);
		window.setTitle("Uppgift 8n");

		int width = window.getBackgroundWidth();
		int height = window.getBackgroundHeight();
		man1 = new Picture(image2, 0, (height - image2.getIconHeight()) / 2);
		man2 = new Picture(image3, (width - image3.getIconWidth()) / 2, height - image3.getIconHeight());
		bPicture1 = new BouncingPicture(window, man1, 0, 400, 0, 500);
		bPicture2 = new BouncingPicture(window, man2, 0, width, 0, height);
		bPicture1.showPicture();
		bPicture2.showPicture();
		window.drawRect(-2, -2, 402, 502, Color.RED, 2);
		move();
	}

	public void move() {
		bPicture1.setDx(3);
		bPicture1.setDy(1);
		bPicture2.setDx(-3);
		bPicture2.setDy(-2);
		while (true) {
			bPicture1.move();
			bPicture2.move();
			PaintWindow.pause(20);
		}
	}

	public static void main(String[] args) {
		Exercise8n u8n = new Exercise8n();
		u8n.action1();
	}
}
