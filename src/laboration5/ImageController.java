package laboration5;

import javax.swing.ImageIcon;

public class ImageController {
	private PaintWindow window = new PaintWindow();
	private ImageIcon image;
	private int x;
	private int y;

	public ImageController(ImageIcon image) {
		this.image = image;
		this.x = (window.getBackgroundWidth() - image.getIconWidth()) / 2;
		this.y = (window.getBackgroundHeight() - image.getIconHeight()) / 2;
		this.window.showImage(image, x, y);
	}

	private void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		this.window.showImage(image, x, y);
	}

	/**
	 * Metoden flyttar bilden en bildbredd till vänster. Bilden flyttas aldrig förbi
	 * vänster fönsterkant.
	 */
	public void left() {
		int imageWidth = image.getIconWidth(); // Bildens bredd
		if (this.x > imageWidth) { // om bildens x-koordinat är större än bildens bredd
			move(-imageWidth, 0); // flytta hel bildbredd
		} else { // annars
			move(-this.x, 0); // flytta lika långt som bilden är till höger om fönstrets vänsterkant
		}
	}

	/**
	 * Metoden flyttar bilden en bildbredd till höger. Bilden flyttas aldrig förbi
	 * höger fönsterkant.
	 */
	public void right() {
		int imageWidth = image.getIconWidth();
		int maxX = window.getBackgroundWidth() - imageWidth;
		if (imageWidth < maxX - this.x) {
			move(imageWidth, 0);
		} else {
			move(maxX - this.x, 0);
		}
	}

	/**
	 * Metoden flyttar bilden en bildhöjd uppåt i fönstret. Bilden flyttas aldrig
	 * förbi fönstrets övre kant.
	 */
	public void up() {
		int imageHeight = image.getIconHeight();
		if (this.y > imageHeight) {
			move(0, -imageHeight);
		} else {
			move(0, -this.y);
		}
	}

	/**
	 * Metoden flyttar bilden en bildhöjd nedåt i fönstret. Bilden flyttas aldrig
	 * förbi fönstrets nedre kant.
	 */
	public void down() {
		int imageHeight = image.getIconHeight(); // Bildens höjd
		int maxY = window.getBackgroundHeight() - imageHeight; // Största y-värde som bilden kan ha och ändå vara
																// helt synlig
		if (imageHeight < maxY - this.y) { // om det går att flytta hel bildhöjd
			move(0, imageHeight); // flytta hel bildhöjd
		} else { // annars
			move(0, maxY - this.y); // flytta så att bildens y-koordinat blir samma som maxY
		}
	}

}
