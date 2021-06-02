import java.util.UUID;

public class TransactionsService {
    private UsersList usersList;

    public TransactionsService() {
    }

    public void addUser(User user){
        usersList.addUser(user);
    }

    public int getBalance(int id) throws UserNotFoundException {
        return usersList.retrieveUserId(id).getBalance();
    }

    public void createTransaction(User sender, User recipient, int amount){
        UUID uuid = UUID.randomUUID();
        Transaction transactionSender = new Transaction(uuid, sender, recipient, amount * -1);
        Transaction transactionRecipient = new Transaction(uuid, recipient, sender, amount);
        sender.addTransaction(transactionSender);
        recipient.addTransaction(transactionRecipient);
    }

    public Transaction[] getTransaction(User user){
        return user.getTranList().toArray();
    }

    public void delTransaction(UUID uuid, int id) throws UserNotFoundException, TransactionNotFoundException {
        usersList.retrieveUserId(id).getTranList().removeTransaction(uuid);
    }

    public Transaction[] checkValid(){
        TransactionsList transactionsList = new TransactionsLinkedList();

        for (int i = 0; i < usersList.retrieveNumberUsers(); i++){
//            usersList.retrieveUserIndex(i).getTranList().toArray()[0].getIdentifier()
            for (int y = 0; y < usersList.retrieveUserIndex(i).getTranList().toArray().length; y++){
                //usersList.retrieveUserIndex(i).getTranList().toArray()[y].getIdentifier()
            }
        }
        return transactionsList.toArray();
    }
}
