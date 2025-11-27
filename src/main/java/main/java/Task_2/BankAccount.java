package main.java.Task_2;

public class BankAccount {
    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount acc_1 = new BankAccount("Павел", 1000000);
        acc_1.deposit(2000000);
        acc_1.withdraw(500000);
        acc_1.printBalance();
    }

    String owner;
    int balance;

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(int amount) {
        this.balance += amount;
    };

    void withdraw(int amount) {
        this.balance -= amount;
    };

    void printBalance() {
        System.out.println("Ваш баланс составляет " + this.balance + " рублей");
    }
}
