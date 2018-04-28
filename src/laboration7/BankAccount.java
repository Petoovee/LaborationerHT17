package laboration7;

import javax.swing.JOptionPane;

public class BankAccount {
	String accountNbr;
	double balance, interestRate;

	public BankAccount(String accountNbr) // Varf�r funkar dessa inte med void? De returnar ju inget v�rde!
	{
		this.accountNbr = accountNbr;
		balance = 0.0;
		interestRate = 0.005;
	}

	public BankAccount(String accountNbr, double balance, double interestRate) // Varf�r funkar dessa inte med void? De
																				// returnar ju inget v�rde!
	{
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccountNbr() {
		return accountNbr;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void withdrawal(double withdrawal) {
		balance -= withdrawal;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void info() {
		JOptionPane.showMessageDialog(null, "Account number: " + accountNbr + "\nBalance: " + balance);
	}
}
