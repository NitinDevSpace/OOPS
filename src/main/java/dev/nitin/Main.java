package dev.nitin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Nitin", 5000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);

        System.out.println(bankAccount.getOwnerName());
        System.out.println(bankAccount.getBalance());

    }
}