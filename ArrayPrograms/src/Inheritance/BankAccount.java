package Inheritance;

public class BankAccount {
    protected double balance; // 'protected' allows subclasses to see it directly

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". Remaining: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("--- Testing Savings Account ---");
        SavingsAccount mySavings = new SavingsAccount(150);
        
        // This should work (150 - 20 = 130, which is > 100)
        mySavings.withdraw(20); 
        
        // This should be blocked (130 - 40 = 90, which is < 100)
        mySavings.withdraw(40); 
    }
}

class SavingsAccount extends BankAccount {
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance); // Pass the balance to the parent constructor
    }

    @Override
    public void withdraw(double amount) {
        // Logic: Check if the withdrawal would leave us with less than 100
        if (balance - amount < 100) {
            System.out.println("Withdrawal Denied: Savings balance must stay above 100.");
        } else {
            // Use the parent's withdrawal logic if the rule is satisfied
            super.withdraw(amount);
        }
    }
}