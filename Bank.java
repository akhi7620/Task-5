public class Bank {
    private List<Account> accounts;
    private List<Transaction> transactions;

    public Bank() {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void createAccount(Account account) {
        accounts.add(account);
    }

    public void performTransaction(Transaction transaction) {
        transactions.add(transaction);
        Account account = getAccountDetails(transaction.getAccountNumber());
        if (account != null) {
            if (transaction.getTransactionType().equals("deposit")) {
                account.deposit(transaction.getAmount());
            } else if (transaction.getTransactionType().equals("withdraw")) {
                account.withdraw(transaction.getAmount());
            }
        }
    }

    public Account getAccountDetails(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}