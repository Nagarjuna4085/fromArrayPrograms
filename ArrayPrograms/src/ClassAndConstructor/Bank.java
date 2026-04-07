package ClassAndConstructor;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    // Remove account
    public void removeAccount(int accountNumber) {
        accounts.removeIf(acc -> acc.accountNumber == accountNumber);
    }

    // Deposit money
    public void depositMoney(int accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    // Withdraw money
    public void withdrawMoney(int accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    // Show all accounts
    public void showAccounts() {
        for (Account acc : accounts) {
            acc.display();
        }
    }

    // Main method
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Creating accounts
        Account a1 = new Account(101, "John", 5000);
        Account a2 = new Account(102, "Alice", 8000);

        // Add accounts
        bank.addAccount(a1);
        bank.addAccount(a2);

        System.out.println("Initial Accounts:");
        bank.showAccounts();

        // Transactions
        bank.depositMoney(101, 2000);
        bank.withdrawMoney(102, 3000);

        System.out.println("\nAfter Transactions:");
        bank.showAccounts();

        // Remove account
        bank.removeAccount(101);

        System.out.println("\nAfter Removing Account 101:");
        bank.showAccounts();
    }
}