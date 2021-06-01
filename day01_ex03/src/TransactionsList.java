public interface TransactionsList {
    void addTransaction(User recipient, User sender, int amount);
    void removeTransaction(int id, String uuid);
    Transaction[] toArray();
}
