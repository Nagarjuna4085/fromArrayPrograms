package polymorphism;

class BankAccount {
    protected double balance;
    protected String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountNumber + ": Deposited $" + amount + ". New Balance: $" + balance);
    }

    // This will be overridden by subclasses
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountNumber + ": Withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double minBalance = 500.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        // Savings Rule: Cannot go below $500
        if (balance - amount >= minBalance) {
            super.withdraw(amount); 
        } else {
            System.out.println(accountNumber + ": Withdrawal denied! Must maintain $" + minBalance + " minimum.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double transactionFee = 2.50;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        // Checking Rule: Apply a $2.50 fee for every withdrawal
        double totalToDebit = amount + transactionFee;
        System.out.println(accountNumber + ": Applying $" + transactionFee + " transaction fee.");
        
        if (totalToDebit <= balance) {
            balance -= totalToDebit;
            System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println(accountNumber + ": Insufficient funds for withdrawal + fee.");
        }
    }
}