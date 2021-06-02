import java.util.UUID;

public class TransactionsService {
    private UsersList usersList;

    public TransactionsService() {
        usersList = new UsersArrayList();
    }

    public void addUser(User user){
        usersList.addUser(user);
    }

    public int getBalance(int id) throws UserNotFoundException {
        return usersList.retrieveUserId(id).getBalance();
    }

    public void createTransaction(int senderId, int recipientId, int amount) throws UserNotFoundException, IllegalTransactionException {
        User sender = usersList.retrieveUserId(senderId);
        User recipient = usersList.retrieveUserId(recipientId);
        UUID uuid = UUID.randomUUID();
        Transaction transactionSender = new Transaction(uuid, sender, recipient, amount * -1);
        Transaction transactionRecipient = new Transaction(uuid, recipient, sender, amount);
        sender.addTransaction(transactionSender);
        recipient.addTransaction(transactionRecipient);
    }

    public Transaction[] getTransaction(int id) throws UserNotFoundException {
        return usersList.retrieveUserId(id).getTranList().toArray();
    }

    public void delTransaction(UUID uuid, int id) throws UserNotFoundException, TransactionNotFoundException {
        usersList.retrieveUserId(id).getTranList().removeTransaction(uuid);
    }

    public Transaction[] checkValid() throws UserNotFoundException {
        TransactionsList transactionsList = new TransactionsLinkedList();

        for (int i = 0; i < usersList.retrieveNumberUsers(); i++){
            Transaction [] transactions = usersList.retrieveUserId(i).getTranList().toArray();
            for (int j = 0; j < transactions.length; j++){
                User recipient = null;
                recipient = usersList.retrieveUserId(transactions[j].getRecipient().getIdentifier());
                assert recipient != null;
                Transaction [] recipientTransactions = recipient.getTranList().toArray();
                int k;
                for (k = 0; k < recipientTransactions.length; k++){
                    if (recipientTransactions[j].getIdentifier().equals(transactions[j].getIdentifier()))
                        break;
                }
                if (k == recipientTransactions.length)
                    transactionsList.addTransaction(transactions[j]);
            }
        }
        return transactionsList.toArray();
    }
}
