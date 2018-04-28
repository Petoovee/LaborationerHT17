package laboration8;

public class Address {
	private String street;
	private int postalCode;
	private String town;

	public Address(String street, int postalCode, String town) {
		this.street = street;
		this.postalCode = postalCode;
		this.town = town;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public void setTown(String town) {
		this.town = town;
	}

	// Getters
	public String getStreet() {
		return this.street;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public String getTown() {
		return this.town;
	}

	// toString
	public String toString() {
		return "Address: " + this.street + ", " + this.postalCode + " " + this.town;
	}

	public static void main(String[] args) {
		Address address = new Address("Södergatan 23", 21112, "Malmö");
		System.out.println("Gatan är " + address.getStreet());
		System.out.println("Postnummer och postadress: " + address.getPostalCode() + " " + address.getTown());
		System.out.println("-------------------------------------");
		System.out.println(address.toString());
	}
}
