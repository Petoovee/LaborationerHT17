package laboration8;

import javax.swing.ImageIcon;

public class Exercise8m {
	private PaintWindow window;
	private Picture man1, man2;
	private int minX, maxX, minY, maxY;

	public void action1() {
		ImageIcon image1 = new ImageIcon("images/sommar.jpg");
		ImageIcon image2 = new ImageIcon("images/liggandegubbe.jpg");
		ImageIcon image3 = new ImageIcon("images/gubbe.jpg");

		window = new PaintWindow(image1);
		window.setTitle("Uppgift 8m");

		int width = window.getBackgroundWidth();
		int height = window.getBackgroundHeight();

		man1 = new Picture(image2, 0, (height - image2.getIconHeight()) / 2);
		man2 = new Picture(image3, (width - image3.getIconWidth()) / 2, height - image3.getIconHeight());
		showPicture(man1);
		showPicture(man2);

		minX = 0;
		maxX = width - man1.getIcon().getIconWidth(); // Antagande: kvadratiska bilder, samma storlek
		minY = 0;
		maxY = height - man1.getIcon().getIconHeight(); // Antagande: se ovan
		move();
	}

	public void move() {
		man1.setDx(3);
		man1.setDy(-1);
		man2.setDx(2);
		man2.setDy(-3);
		while (true) {
			move(man1);
			move(man2);
			PaintWindow.pause(20);
		}
	}

	private void move(Picture picture) {
		picture.move();
		showPicture(picture);
		if (picture.containsX(minX, maxX) == false) {
			picture.changeXDirection();
		}
		if (!picture.containsY(minY, maxY)) {
			picture.changeYDirection();
		}
	}

	public void showPicture(Picture picture) {
		window.showImage(picture.getIcon(), picture.getX(), picture.getY());
	}

	public static void main(String[] args) {
		Exercise8m u8m = new Exercise8m();
		u8m.action1();
	}
}
