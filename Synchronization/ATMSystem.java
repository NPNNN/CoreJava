package Synchronization;

class SavingAccount {
    private double balance;

    // Constructor to initialize account balance
    public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public synchronized void checkBalance(String name) {
        System.out.println(name + " is checking balance...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current Balance for " + name + ": " + balance);
    }

    // Method to withdraw money with synchronization
    public synchronized void withdraw(String name, double amount) {
        System.out.println(name + " is attempting to withdraw " + amount + "...");
        
        if (balance >= amount) {
            try {
                Thread.sleep(1000); // Simulating delay in transaction
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            balance -= amount;
            System.out.println("Withdrawal successful! " + name + " withdrew " + amount);
            System.out.println("Updated Balance for " + name + ": " + balance);
        } else {
            System.out.println("Insufficient balance for " + name + " to withdraw " + amount);
        }
        
        System.out.println("********************Transaction Completed*****************");
    }

    // Method to deposit money with synchronization
    public synchronized void deposit(String name, double amount) {
        System.out.println(name + " is attempting to deposit " + amount + "...");
        
        try {
            Thread.sleep(1000); // Simulating delay in transaction
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        balance += amount;
        System.out.println("Deposit successful! " + name + " deposited " + amount);
        System.out.println("Updated Balance for " + name + ": " + balance);
        
        System.out.println("********************Transaction Completed*****************");
    }
}

// Class to handle ATM user actions
class UserThread extends Thread {
    SavingAccount account;
    String userName;
    String action;
    double amount;

    UserThread(SavingAccount account, String userName, String action, double amount) {
        this.account = account;
        this.userName = userName;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (action) {
            case "withdraw":
                account.withdraw(userName, amount);
                break;
            case "deposit":
                account.deposit(userName, amount);
                break;
            case "checkBalance":
                account.checkBalance(userName);
                break;
            default:
                System.out.println("Invalid action for " + userName);
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        // Initialize account with a balance of 5000
        SavingAccount savingAccount = new SavingAccount(1000);

        // Simulate multiple users performing actions on the same account
        UserThread user1 = new UserThread(savingAccount, "User1", "withdraw", 2000);
        UserThread user2 = new UserThread(savingAccount, "User2", "deposit", 1500);
        UserThread user3 = new UserThread(savingAccount, "User3", "checkBalance", 0);
        UserThread user4 = new UserThread(savingAccount, "User4", "withdraw", 3000);

        // Start all user threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
