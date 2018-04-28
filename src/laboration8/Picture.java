package laboration8;

import javax.swing.*;

public class Picture
{
	private ImageIcon icon;
	private int x, y, dx, dy;
	
	public Picture(ImageIcon arg1, int arg2, int arg3)
	{
		icon = arg1;
		x = arg2;
		y = arg3;
	}
	
	public Picture(ImageIcon arg1, int arg2, int arg3, int arg4, int arg5)
	{
		icon = arg1;
		x = arg2;
		y = arg3;
		dx = arg4;
		dy = arg5;
	}
	
	public ImageIcon getIcon()
	{
		return icon;
	}
	
	public void setIcon(ImageIcon icon)
	{
		this.icon = icon;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getDx()
	{
		return dx;
	}
	
	public void setDx(int dx)
	{
		this.dx = dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public void setDy(int dy)
	{
		this.dy = dy;
	}
	
	// Exercise 8m
	public boolean containsX(int minX, int maxX)
	{
		if (this.x > minX && this.x < maxX)
			return true;
		else return false;
	}
	
	public boolean containsY(int minY, int maxY)
	{
		if ( this.y > minY && this.y < maxY)
			return true;
		else return false;
	}
	
	public void changeXDirection()
	{
		this.dx = -this.dx;
	}
	
	public void changeYDirection()
	{
		this.dy = -this.dy;
	}
	
	// Task 7o
	public void move()
	{
		x += dx;
		y += dy;
	} // Moves the icons to their new position
	
	public void checkDirection(int maxX, int maxY) // Checks the position of the icons and reverses their velocity if needed
	{
		if (x > maxX - icon.getIconHeight() || x < 0)
		{
			dx = -dx;
		}
		if (y > maxY - icon.getIconWidth() || y < 0)
		{
			dy = -dy;
		}
	}
}
