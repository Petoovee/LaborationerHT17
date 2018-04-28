package laboration7;

import javax.swing.ImageIcon;

import laboration6.PaintWindow;

public class Exercise7n {
	private PaintWindow window;
	private Picture man1, man2;

	public void action1() {
		ImageIcon image1 = new ImageIcon("images/sommar.jpg");
		ImageIcon image2 = new ImageIcon("images/liggande_gubbe.jpg");
		ImageIcon image3 = new ImageIcon("images/gubbe.jpg");

		window = new PaintWindow(image1);
		window.setTitle("Uppgift 7n");

		int width = window.getBackgroundWidth();
		int height = window.getBackgroundHeight();

		man1 = new Picture(image2, 0, (height - image2.getIconHeight()) / 2, 3, 0);
		man2 = new Picture(image3, (width - image3.getIconWidth()) / 2, (window.getBackgroundHeight()) / 2, 0, 3);
		showPicture(man1);
		showPicture(man2);
		movePictures();
	}

	public void movePictures() {
		int x, dx;
		int maxX = window.getBackgroundWidth() - man1.getIcon().getIconWidth();
		int maxY = window.getBackgroundHeight() - man2.getIcon().getIconHeight();

		while (true) {
			man1.setX(man1.getX() + man1.getDx());
			man2.setY(man2.getY() + man2.getDy()); // Moves the men

			showPicture(man1);
			showPicture(man2); // Renders the new frame

			if (man1.getX() > maxX || man1.getX() < 0) {
				man1.setDx(-man1.getDx());
			} // Reverses the horizontal mans velocity
			if (man2.getY() > maxY || man2.getY() < 0) {
				man2.setDy(-man2.getDy());
			} // Reverses the vertical mans velocity

			PaintWindow.pause(10);
		}
	}

	public void showPicture(Picture picture) {
		window.showImage(picture.getIcon(), picture.getX(), picture.getY());
	}

	public static void main(String[] args) {
		Exercise7n u7n = new Exercise7n();
		u7n.action1();
	}
}
