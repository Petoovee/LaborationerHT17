package laboration7;

public class HouseTest {
	static House house = new House();

	public static void main(String[] args) {
		house.setYear(1998);
		house.setSize(164);
		house.setGarden(3);
		System.out.println(house.getYear());
		System.out.println(house.getSize());
		System.out.println(house.getGarden());
		System.out.println(house.toString());
	}
}
