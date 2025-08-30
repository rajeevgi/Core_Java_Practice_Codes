public class BankAccount {
    // Fields
    private String accountNumber;
    private double balance;

    // Parametarized Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount should be greater than 0...");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited " + amount + " to account number: " + accountNumber);
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount should be greater than 0...");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient amount in the account...");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " From Account number " + accountNumber);
    }

    // Show Total Balance
    public double getBalance() {
        return balance;
    }

    // Fetch Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Balance: " + balance;
    }
}
