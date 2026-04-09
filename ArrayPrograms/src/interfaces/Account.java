package interfaces;

import java.util.ArrayList;
import java.util.List;

interface Account {
	void deposit(double amount);

	void withdraw(double amount);

	void calculateInterest();

	void viewBalance();
}

class Bank {
	// You can use the Interface as the Type for the list!
	private List<Account> accounts = new ArrayList<>();

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void showAllBalances() {
		for (Account acc : accounts) {
			acc.viewBalance();
		}
	}
}



class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.05; // 5%

    public void deposit(double amount) { balance += amount; }
    
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds!");
    }

    public void calculateInterest() {
        balance += (balance * interestRate);
        System.out.println("Interest added. New balance: " + balance);
    }

    public void viewBalance() {
        System.out.println("Savings Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit = 1000;

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) balance -= amount;
        else System.out.println("Overdraft limit exceeded!");
    }

    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }

    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }
}