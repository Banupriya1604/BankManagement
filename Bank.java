import java.util.ArrayList;
import java.util.List;

// Bank Class
class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void performDeposit(Account account, double amount) {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " into account " + account.getAccountNumber());
    }

    public void performWithdrawal(Account account, double amount) {
        account.withdraw(amount);
        System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
    }

    public void printCustomerAccounts(Customer customer) {
        System.out.println("Accounts for Customer: " + customer.getName());
        for (Account account : customer.getAccounts()) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Type: " + account.getAccountType() + ", Balance: " + account.getBalance());
        }
    }
}

