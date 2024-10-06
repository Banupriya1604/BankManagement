public class BankManagementSystem {
    public static void main(String[] args) {
        // Create a Bank
        Bank myBank = new Bank("Global Bank");

        // Create a Customer
        Customer customer1 = new Customer("John Doe", "CUST123");
        myBank.addCustomer(customer1);

        // Create Accounts for the Customer
        Account savingsAccount = new Account("ACC001", "Savings", 500.0);
        Account checkingAccount = new Account("ACC002", "Checking", 1000.0);

        customer1.addAccount(savingsAccount);
        customer1.addAccount(checkingAccount);

        // Perform a Deposit on the Savings Account
        myBank.performDeposit(savingsAccount, 200.0);

        // Perform a Withdrawal from the Checking Account
        myBank.performWithdrawal(checkingAccount, 150.0);

        // Print Customer Accounts Information
        myBank.printCustomerAccounts(customer1);

        // Create a Transaction
        Transaction transaction1 = new Transaction("TXN001", "ACC001", 200.0, "Deposit");
        System.out.println(transaction1.getTransactionDetails());

        Transaction transaction2 = new Transaction("TXN002", "ACC002", 150.0, "Withdrawal");
        System.out.println(transaction2.getTransactionDetails());
    }
}