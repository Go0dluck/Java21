public class User {
    private int         Identifier;
    private String      Name;
    private int         Balance;

    public User(String name, int balance) {
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

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance negative");
        }
        else
            Balance = balance;
    }
}