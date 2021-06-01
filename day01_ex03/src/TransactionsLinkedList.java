class ListElement {
    Transaction data;
    ListElement prev;
    ListElement next;
}

public class TransactionsLinkedList implements TransactionsList{
    private ListElement head;
    private ListElement tail;

    @Override
    public void addTransaction(User recipient, User sender, int amount) {

    }

    @Override
    public void removeTransaction(int id, String uuid) {

    }

    @Override
    public Transaction[] toArray() {
        return new Transaction[0];
    }
}
