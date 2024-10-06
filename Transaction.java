import java.util.Date;
class Transaction {
    private String transactionId;
    private String accountId;
    private double amount;
    private String transactionType;  // e.g., "Deposit", "Withdrawal"
    private Date transactionDate;

    public Transaction(String transactionId, String accountId, double amount, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = new Date();
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Account ID: " + accountId + ", Type: " + transactionType + ", Amount: " + amount + ", Date: " + transactionDate;
    }
}
