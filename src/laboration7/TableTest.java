package laboration7;

public class TableTest {
	static Table table = new Table();

	public static void main(String[] args) {
		table.setMaterial("Wood");
		table.setWidth(460.46);
		table.setDepth((float) 1264.16);
		table.setHeight(80);

		System.out.println("" + table.getDepth());
		System.out.println("" + table.getHeight());
		System.out.println("" + table.getWidth());
		System.out.println("" + table.getMaterial());
		System.out.println("" + table.size());
		System.out.println("" + table.toString());

	}
}
