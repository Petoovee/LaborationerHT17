package laboration7;

import javax.swing.ImageIcon;

import laboration6.PaintWindow;

public class Exercise7o {
	private PaintWindow window;
	private Picture man1, man2;

	public void action1() {
		ImageIcon image1 = new ImageIcon("images/sommar.jpg");
		ImageIcon image2 = new ImageIcon("images/liggandegubbe.jpg");
		ImageIcon image3 = new ImageIcon("images/gubbe.jpg");

		window = new PaintWindow(image1);
		window.setTitle("Uppgift 7o");

		int width = window.getBackgroundWidth();
		int height = window.getBackgroundHeight();

		man1 = new Picture(image2, 0, (height - image2.getIconHeight()) / 2, 3, -1);
		man2 = new Picture(image3, (width - image3.getIconWidth()) / 2, height - image3.getIconHeight(), 1, 7);
		showPicture(man1);
		showPicture(man2);
		movePictures();
	}

	public void movePictures() {
		int maxX = window.getBackgroundWidth();
		int maxY = window.getBackgroundHeight();
		while (true) {
			man1.checkDirection(maxX, maxY);
			man1.move(); // Checks picture for clearance and reverses their direction
			man2.checkDirection(maxX, maxY);
			man2.move(); // if necessary, then moves them
			PaintWindow.pause(20);
			showPicture(man1);
			showPicture(man2); // Renders the new pictures

		}
	}

	public void showPicture(Picture picture) {
		window.showImage(picture.getIcon(), picture.getX(), picture.getY());
	}

	public static void main(String[] args) {
		Exercise7o u7n = new Exercise7o();
		u7n.action1();
	}
}
