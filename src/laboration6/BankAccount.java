package laboration6;

import javax.swing.JOptionPane;

public class BankAccount {
	String accountNbr;
	double balance, interestRate;

	public void init(String accountNbr, double balance, double interestRate) {
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(int deposit) {
		this.balance += deposit;
	}

	public void withdrawal(int withdrawal) {
		this.balance -= withdrawal;
	}

	public void info() {
		JOptionPane.showMessageDialog(null, "Account number: " + accountNbr + "\nBalance: " + balance);
	}
}
