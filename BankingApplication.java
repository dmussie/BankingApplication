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

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransation = amount;
        }
    }
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransation = -amount;
        }
    }
    void getPreviousTransation() {
        if (previousTransation > 0) {
            System.out.println("Deposited: " + previousTransation);
        }
        else if (previousTransation < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransation));
        }
        else {
            System.out.println("No transaction occured");
        }
    }

    void showMenu() {

    }
}