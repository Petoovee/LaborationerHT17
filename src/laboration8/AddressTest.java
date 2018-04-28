package laboration8;

public class AddressTest {
	public static void main(String[] args) {
		Building building = new Building(5, 1350);
		Address address = new Address("Test street 4", 12345, "Amsterdam");
		RealEstate re = new RealEstate("Grinder 4", building, address);
		System.out.println(re.getName());
		System.out.println(re.getBuilding().toString());
		System.out.println(re.getAddress().toString());
		System.out.println("--------------------");
		System.out.println(re.toString());

		System.out.println("--------------------");
		re.setName("The scorpion 17");
		re.setBuilding(new Building(6, 1470));
		re.setAddress(new Address("Newstreet 4", 55555, "Berlin"));
		System.out.println(re.toString());
	}
}
