public class User {
    private int         identifier;
    private String      name;
    private int         balance;
    private TransactionsList TranList;

    public User(String name, int balance) {
        identifier = UserIdsGenerator.getInstance().generateId();
        setBalance(balance);
        this.name = name;
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

    public float getBalance() {
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