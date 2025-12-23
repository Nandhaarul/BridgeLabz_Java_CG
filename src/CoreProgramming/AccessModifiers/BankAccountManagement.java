package CoreProgramming.AccessModifiers;


import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accNo = sc.nextInt();
        sc.nextLine();
        String holder = sc.nextLine();
        double balance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(accNo, holder, balance);
        sa.displayDetails();

        double newBalance = sc.nextDouble();
        sa.setBalance(newBalance);

        sa.displayDetails();

        sc.close();
    }
}
