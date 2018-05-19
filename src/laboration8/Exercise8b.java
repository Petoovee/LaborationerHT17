package laboration8;

public class Exercise8b {
	public static void main(String[] args) {

		// 8b
		Contact contact = new Contact("Eva Bok", "040-123456", "040-333333", "0705223344");
		System.out.println("Namne: " + contact.getName() + "\n" + "Telefonnummer: " + contact.getHome() + ", "
				+ contact.getWork() + ", " + contact.getMobile());
		System.out.println("--------------------");
		System.out.println(contact.toString());
	}
}
