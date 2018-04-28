package laboration8;

public class PhoneNumber {
	private String home, work, mobile;

	public PhoneNumber(String arg1, String arg2, String arg3) {
		home = arg1;
		work = arg2;
		mobile = arg3;
	}

	// setters
	public void setHome(String arg1) {
		home = arg1;
	}

	public void setWork(String arg1) {
		work = arg1;
	}

	public void setMobile(String arg1) {
		mobile = arg1;
	}

	// getters
	public String getHome() {
		return home;
	}

	public String getWork() {
		return work;
	}

	public String getMobile() {
		return mobile;
	}

	// toString
	public String toString() {
		String toString = "Home:   " + home + "\nWork:   " + work + "\nMobile: " + mobile;
		return toString;
	}
}
