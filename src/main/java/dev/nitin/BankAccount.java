package dev.nitin;

public class BankAccount {
    private String ownerName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void withdraw (double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from " + ownerName);
        }
    }

    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
        System.out.println(amount + " deposited to " + ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
