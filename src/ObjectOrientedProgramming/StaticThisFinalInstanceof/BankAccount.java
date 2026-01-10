package ObjectOrientedProgramming.StaticThisFinalInstanceof;

class BankAccount {

    // ---------- Static ----------
    static String bankName = "Capgemini Bank";
    static int totalAccounts = 0;

    // ---------- Final ----------
    final int accountNumber;

    // Instance variables
    String accountHolderName;
    double balance;

    // ---------- This ----------
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;              // resolves ambiguity
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // ---------- Static Method ----------
    static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Nandha Arul", 50000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 30000);

        // ---------- instanceof ----------
        if (acc1 instanceof BankAccount) {
            System.out.println("\nAccount 1 Details:");
            acc1.displayAccountDetails();
        }

        if (acc2 instanceof BankAccount) {
            System.out.println("\nAccount 2 Details:");
            acc2.displayAccountDetails();
        }

        // Static method call
        BankAccount.getTotalAccounts();
    }
}
