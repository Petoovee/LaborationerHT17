package laboration7;

public class Contact {
	String name, phone, cellphone, email;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return "Name: " + name + "\nPhone: " + phone + "\nCellphone: " + cellphone + "\nEmail: " + email;
	}
}
