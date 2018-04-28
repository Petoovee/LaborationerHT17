package laboration7;

public class BOX
{
	int height = 0, width = 0, depth = 0;
	boolean full = false;
	
	public BOX(int height, int width, int depth)
	{
		this.height = height; this.width = width; this.depth = depth; full = false;
	}
	
	//setters
	
	public void setHeight(int height) {this.height = height;}
	
	public void setWidth(int width) {this.width = width;}
	
	public void setDepth(int depth) {this.depth = depth;}
	
	public void setFull(boolean full) {this.full = full;}
	
	//getters
	
	public int getHeight() {return height;}
	
	public int getWidth() {return width;}
	
	public int getDepth() {return depth;}
	
	public boolean full() {return full;}
	
	//toString
	
	public String toString()
	{
		String toString = "Height: " + height + ", Width: " + width + ", Depth: " + depth + ", isFull: " + full;
		return toString;
	}
}