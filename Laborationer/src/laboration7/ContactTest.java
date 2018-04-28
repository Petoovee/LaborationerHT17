package laboration7;

import javax.swing.JOptionPane;

public class ContactTest
{
	public void action()
	{
		Contact contact = new Contact();
		String name, phone;
		name = JOptionPane.showInputDialog("Input name");
		contact.setName(name);
		phone = JOptionPane.showInputDialog("Input number");
		contact.setPhone(phone);
		contact.setCellphone(JOptionPane.showInputDialog("Input mobile number"));
		contact.setEmail(JOptionPane.showInputDialog("Input email"));
		JOptionPane.showMessageDialog(null, contact.toString());
		JOptionPane.showMessageDialog(null, contact.getName() + "\n" + contact.getPhone() + "\n"
				+ contact.getCellphone() + "\n" + contact.getEmail());
	}
	
	public static void main(String[] args)
	{
		ContactTest prog = new ContactTest();
		prog.action();
	}
}
