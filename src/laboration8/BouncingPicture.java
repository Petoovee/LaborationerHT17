package laboration8;

public class BouncingPicture
{
	private PaintWindow window;
	private Picture picture;
	private int minX, maxX, minY, maxY;
	
	public BouncingPicture(PaintWindow window, Picture picture, int minX, int maxX, int minY, int maxY)
	{
		this.window = window;
		this.picture = picture;
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}
	
	public void setDx(int dx)
	{
		this.picture.setDx(dx);
	}
	
	public void setDy(int dy)
	{
		this.picture.setDy(dy);
	}
	
	public void showPicture()
	{
		this.window.show
	}
}
