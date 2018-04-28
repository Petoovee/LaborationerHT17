package laboration8;

public class Exercise8e {
	public static void main(String[] args) {
		Building building = new Building(5, 1350);
		Address address = new Address("Nygatan 4", 12345, "Ystad");
		RealEstate re = new RealEstate("Kvarnen 4", building, address);
		System.out.println(re.getName());
		System.out.println(re.getBuilding().toString());
		System.out.println(re.getAddress().toString());
		System.out.println("-----------------------------");
		System.out.println(re.toString());
		System.out.println("------------------------------");
		re.setName("Skorpionen 17");
		re.setBuilding(new Building(6, 1470));
		;
		re.setAddress(new Address("Nygatan 4", 55555, "Ystad"));
		System.out.println(re.toString());
	}
}
