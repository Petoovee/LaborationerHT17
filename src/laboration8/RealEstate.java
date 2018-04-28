package laboration8;

public class RealEstate {
	private String name;
	private Building building;
	private Address address;

	public RealEstate(String arg1, Building arg2, Address arg3) {
		name = arg1;
		building = arg2;
		address = arg3;
	}

	// Getters
	public String getName() {
		return name;
	}

	public Building getBuilding() {
		return building;
	}

	public Address getAddress() {
		return address;
	}

	// toString
	public String toString() {
		String toString = "Name: " + name + "\n" + building + "\n" + address;
		return toString;
	}

	// Setters
	public void setName(String arg1) {
		name = arg1;
	}

	public void setBuilding(Building arg1) {
		building = arg1;
	}

	public void setAddress(Address arg1) {
		address = arg1;
	}
}
