package laboration8;

public class Exercise8a {
	public static void main(String[] args) {
		PhoneNumber phone = new PhoneNumber("0413-11111", "040-123456", "0735191919");
		System.out.println(phone.getHome() + ", " + phone.getWork() + ", " + phone.getMobile());
		System.out.println("------------------------");
		System.out.println(phone.toString());
		System.out.println("------------------------");
		phone.setHome("040-222222");
		phone.setWork("");
		phone.setMobile("0707657654");
		System.out.println(phone.toString());
	}
}
