package banking_project;

public class Account implements Bank {

    private int accountNo;
    private String name;
    private double balance;

    // Constructor
    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check Balance
    @Override
    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    // toString()
    @Override
    public String toString() {
        return "Account No: " + accountNo +
               ", Name: " + name +
               ", Balance: ₹" + balance;
    }
}