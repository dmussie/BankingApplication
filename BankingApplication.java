import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


    }
}

class BankAccount {
    int balance;
    int previousTransation;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransation = amount;
        }
    }
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
        }
    }
}