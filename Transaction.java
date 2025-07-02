public class Transaction {
    private String transactionId;
    private double amount;
    private String transactionType;

    public Transaction(String transactionId, double amount, String transactionType) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount + ", Type: " + transactionType;
    }
}