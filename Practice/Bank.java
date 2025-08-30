public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("101", 5000);
        BankAccount acc2 = new BankAccount("102", 10000);

        acc1.deposit(5000);
        System.out.println("Account number: " + acc1.getAccountNumber());
        System.out.println("Total Balance: " + acc1.getBalance());
        
        acc2.deposit(1000);
        System.out.println("Account number: " + acc2.getAccountNumber());
        System.out.println("Total Balance: " + acc2.getBalance() );
        

        acc1.withdraw(1500);

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
