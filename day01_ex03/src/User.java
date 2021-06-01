public class User {
    private int         Identifier;
    private String      Name;
    private int         Balance;
    private TransactionsList TranList;

    public User(String name, int balance) {
        Identifier = UserIdsGenerator.getInstance().generateId();
        setBalance(balance);
        Name = name;
    }

    public int getIdentifier() {
        return Identifier;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getBalance() {
        return Balance;
    }

    public TransactionsList getTranList() {
        return TranList;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            Balance = balance;
    }
}