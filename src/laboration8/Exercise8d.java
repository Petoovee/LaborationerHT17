package laboration8;

public class Exercise8d {
	public static void main(String[] args) {
		Building building = new Building(5, 1350);
		Address address = new Address("Nygatan 4", 12345, "Ystad");
		RealEstate re = new RealEstate("Kvarnen 4", building, address);
		System.out.println(re.getName());
		System.out.println(re.getBuilding().toString());
		System.out.println(re.getAddress().toString());
		System.out.println("-----------------------------");
		System.out.println(re.toString());
	}
}
