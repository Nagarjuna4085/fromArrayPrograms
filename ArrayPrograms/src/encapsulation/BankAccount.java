package encapsulation;

public class BankAccount {
    // Private variables: No one can touch these directly
    private String accountNumber;
    private double balance;

    // Constructor (The "Create" operation)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // GETTERS (Read)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // SETTERS (Update with Business Logic)
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        // Here is where Encapsulation protects the data!
        // We prevent the balance from ever being a negative number.
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }
}