import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String id;
    private List<Account> accounts;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
