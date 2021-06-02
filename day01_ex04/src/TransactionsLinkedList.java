import java.util.UUID;

class ListElement {
    Transaction data;
    ListElement prev;
    ListElement next;
}

public class TransactionsLinkedList implements TransactionsList{
    private ListElement head = new ListElement();
    private ListElement tail = new ListElement();
    private int         size;

    public TransactionsLinkedList() {
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        ListElement elem = new ListElement();

        elem.data = transaction;
        tail.prev.next = elem;
        elem.prev = tail.prev;
        tail.prev = elem;
        elem.next = tail;
        size++;
    }

    @Override
    public void removeTransaction(UUID uuid) throws TransactionNotFoundException {
        ListElement tmp = head.next;

        while (tmp != tail)
        {
            if (tmp.data.getIdentifier() == uuid){
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
                tmp.next = null;
                tmp.prev = null;
                size--;
                return;
            }
            tmp = tmp.next;
        }
        throw new TransactionNotFoundException();
    }

    @Override
    public Transaction[] toArray() {
        Transaction[] transArr = new Transaction[size];
        int i = 0;

        ListElement tmp = head.next;
        while (tmp != tail)
        {
            transArr[i] = tmp.data;
            tmp = tmp.next;
            i++;
        }
        return transArr;
    }
}
