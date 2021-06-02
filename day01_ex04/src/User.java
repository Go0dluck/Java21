public class User {
    private int                 identifier;
    private String              name;
    private int                 balance;
    private TransactionsList    tranList;

    public User(String name, int balance) {
        identifier = UserIdsGenerator.getInstance().generateId();
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            this.balance = balance;
        this.name = name;
        tranList = new TransactionsLinkedList();
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction){
        tranList.addTransaction(transaction);
        balance += transaction.getAmount();
    }

    public TransactionsList getTranList() {
        return tranList;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            this.balance = balance;
    }
}