package exceptionHandling;

public class VendingMachine {

    public static void main(String[] args) {
        System.out.println("--- Vending Machine Starting ---");

        // Scenario 1: User tries to buy a $5 snack with $2
        processTransaction(2, 5);

        // Scenario 2: User tries to buy a $5 snack with $10
        processTransaction(10, 5);

        System.out.println("--- Program Finished Safely (No Crash!) ---");
    }

    public static void processTransaction(int moneyInput, int price) {
        try {
            checkBalance(moneyInput, price);
            // If checkBalance throws an error, the code below is skipped
            System.out.println("Dispensing snack... Enjoy!");
        } 
        catch (IllegalArgumentException e) {
            // We catch the error here! The program stays alive.
            System.err.println("CUSTOMER ERROR: " + e.getMessage());
            System.out.println("Please insert more coins.");
        }
    }

    public static void checkBalance(int money, int price) {
        if (money < price) {
            // We pull the alarm, but the catch block above is waiting
            throw new IllegalArgumentException("Insufficient funds! You provided $" + money);
        }
    }
}
