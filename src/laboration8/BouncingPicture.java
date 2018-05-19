package laboration8;

public class BouncingPicture {
	private PaintWindow window;
	private Picture picture;
	private int minX, maxX, minY, maxY;

	public BouncingPicture(PaintWindow window2, Picture picture, int minX, int maxX, int minY, int maxY) {
		this.window = window2;
		this.picture = picture;
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}

	public void setDx(int dx) {
		this.picture.setDx(dx);
	}

	public void setDy(int dy) {
		this.picture.setDy(dy);
	}

	public void showPicture() {
		this.window.show(); // This no longer works
//		this.window.setVisible(true);
//		this.window.showImage(picture.getIcon(), picture.getX(), picture.getY());
	}
	public void move() {
		System.out.println("Moving within 0,0 and " +maxX +"," +maxY);
		picture.checkDirection(maxX, maxY);
		picture.move();
		System.out.println("Current location is " +picture.getX() +"," +picture.getY());
		this.window.showImage(picture.getIcon(), picture.getX(), picture.getY()); // Patching up outdated methods
	}
}
