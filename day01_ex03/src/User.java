public class User {
    private int                 identifier;
    private String              name;
    private int                 balance;
    private TransactionsList    TranList;

    public User(String name, int balance) {
        identifier = UserIdsGenerator.getInstance().generateId();
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            this.balance = balance;
        this.name = name;
        TranList = new TransactionsLinkedList();
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

    public TransactionsList getTranList() {
        return TranList;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            this.balance = balance;
    }
}