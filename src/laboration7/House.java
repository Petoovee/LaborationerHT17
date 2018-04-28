package laboration7;

public class House {
	private int year, size;
	private long garden;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getGarden() {
		return garden;
	}

	public void setGarden(long garden) {
		this.garden = garden;
	}

	public String toString() {
		return "House built year: " + year + ", with a size of: " + size + "m2 and a garden of garden: " + garden
				+ "m2";
	}
}
