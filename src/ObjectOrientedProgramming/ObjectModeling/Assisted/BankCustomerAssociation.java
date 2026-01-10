package ObjectOrientedProgramming.ObjectModeling.Assisted;

import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        customer.bank = this;
    }

    void displayCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            System.out.println("Customer: " + c.name);
        }
    }
}

class Customer {
    String name;
    double balance;
    Bank bank;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        if (bank != null) {
            System.out.println("Customer: " + name);
            System.out.println("Bank: " + bank.bankName);
            System.out.println("Balance: " + balance);
        }
    }
}

public class BankCustomerAssociation {
    public static void main(String[] args) {

        Bank bank = new Bank("City Bank");

        Customer c1 = new Customer("Nandha Arul", 50000);
        Customer c2 = new Customer("Rahul", 30000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();

        bank.displayCustomers();
    }
}
