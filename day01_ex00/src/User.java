public class User {
    private int         identifier;
    private String      name;
    private int         balance;

    public User(String name, int balance) {
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

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            this.balance = balance;
    }
}