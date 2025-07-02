+public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Account account1 = new Account("123456", "Alice", 1000.0);
        Account account2 = new Account("654321", "Bob", 500.0);
        
        bank.createAccount(account1);
        bank.createAccount(account2);

        // Perform transactions
        bank.performTransaction(new Transaction("T001", 200.0, "Deposit", account1.getAccountNumber()));
        bank.performTransaction(new Transaction("T002", 150.0, "Withdraw", account2.getAccountNumber()));

        // Display account details
        System.out.println(bank.getAccountDetails("123456"));
        System.out.println(bank.getAccountDetails("654321"));
    }
}