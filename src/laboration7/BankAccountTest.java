/*
 * BankAccountTest.java
 * Den 5/10 - 2015
 */
package laboration7;

import javax.swing.JOptionPane;

/**
 * Programmet testar klassen BankAcccount
 * 
 * @author Rolf Axelsson
 */
public class BankAccountTest {
	public void test() {
		BankAccount account1 = new BankAccount("399.847.500");
		BankAccount account2 = new BankAccount("399.847.555", 1000, 0.0395);
		account1.deposit(1000);

		account1.info();
		account1.deposit(250);
		JOptionPane.showMessageDialog(null, "Bank account with " + account1.getBalance() + " eur, has an intrest of "
				+ account1.getInterestRate() * 100 + " % per år");
		account1.withdrawal(550);
		account1.info();

		account2.info();
		account2.deposit(500);
		JOptionPane.showMessageDialog(null, "Bank account with " + account2.getBalance() + " eur, has an intrest of "
				+ account2.getInterestRate() * 100 + " % per år");
		account2.withdrawal(200);
		account2.info();
	}

	public static void main(String[] args) {
		BankAccountTest prog = new BankAccountTest();
		prog.test();
	}
}
