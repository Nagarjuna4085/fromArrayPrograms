package ClassAndConstructor;

public class Account {

    int accountNumber;
    String customerName;
    double balance;

    // Constructor
    Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    // Display account details
    public void display() {
        System.out.println(accountNumber + " | " + customerName + " | " + balance);
    }
}