package laboration7;

import javax.swing.ImageIcon;

public class Picture {
	private ImageIcon icon;
	private int x, y, dx, dy;

	public Picture(ImageIcon arg1, int arg2, int arg3) {
		icon = arg1;
		x = arg2;
		y = arg3;
	}

	public Picture(ImageIcon arg1, int arg2, int arg3, int arg4, int arg5) {
		icon = arg1;
		x = arg2;
		y = arg3;
		dx = arg4;
		dy = arg5;
	}

	// getters
	public ImageIcon getIcon() {
		return icon;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDx() {
		return dx;
	}

	public int getDy() {
		return dy;
	}

	// setters
	public void setIcon(ImageIcon arg1) {
		icon = arg1;
	}

	public void setX(int arg1) {
		x = arg1;
	}

	public void setY(int arg1) {
		y = arg1;
	}

	public void setDx(int arg1) {
		dx = arg1;
	}

	public void setDy(int arg1) {
		dy = arg1;
	}

	// Task 7o
	public void move() {
		x += dx;
		y += dy;
	} // Moves the icons to their new position

	public void checkDirection(int maxX, int maxY) // Checks the position of the icons and reverses their velocity if
													// needed
	{
		if (x > maxX - icon.getIconHeight() || x < 0) {
			dx = -dx;
		}
		if (y > maxY - icon.getIconWidth() || y < 0) {
			dy = -dy;
		}
	}
}
