package recitations.rec10;

public class BankAccount {
    // Instance variables
    private long balance;
    private long withdraw;
    private long deposit;

    // Methods
    public long withdraw(long n) {
        this.balance -= n;
        return this.balance;
    }
    public long deposit(long n) {
        this.balance += n;
        return this.balance;
    }
    public long getBalance() {
        return this.balance;
    }

    // Constructors
    public BankAccount() {
        balance = 0;
    }
    
    // Test the class
    public static void main(String[] args) {
        BankAccount jessica = new BankAccount();
        System.out.println(jessica.getBalance());
        jessica.deposit(2000);
        System.out.println(jessica.getBalance());
    }
}