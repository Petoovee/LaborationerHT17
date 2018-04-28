package laboration7;

public class Table {
	private String material;
	private double width, depth, height;

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setWitdh(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getMaterial() {
		return material;
	}

	public double getDepth() {
		return depth;
	}

	public double size() {
		double size = width * depth;
		return size;
	}

	public String toString() {
		String toString = "Table [ material = " + material + ", width = " + width + ", depth = " + depth + ", height = "
				+ height + "]";
		return toString;
	}
}
