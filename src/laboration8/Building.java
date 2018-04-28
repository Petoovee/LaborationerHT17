package laboration8;

public class Building {
	private int floors;
	private int area;

	public Building(int floors, int area) {
		this.floors = floors;
		this.area = area;
	}

	public int getFloors() {
		return this.floors;
	}

	public int getArea() {
		return this.area;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String toString() {
		return "Building: " + this.floors + " floors, space " + this.area + " kvm";
	}

	public static void main(String[] args) {
		Building building = new Building(4, 832);
		System.out.println("Floors=" + building.getFloors() + ", Space=" + building.getArea());
		System.out.println("--------------------------------");
		System.out.println(building.toString());
	}
}
