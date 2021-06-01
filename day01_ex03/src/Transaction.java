import java.util.UUID;

public class Transaction {
    private UUID        identifier;
    private User        recipient;
    private User        sender;
    private Transfer    category;
    private int         amount;

    @Override
    public String toString() {
        if (category == Transfer.CREDITS)
            return recipient.getName() + " -> " + sender.getName() + ", " + getAmount() + ", OUTCOME, transaction " + getIdentifier();
        else
            return sender.getName() + " -> " + recipient.getName()+ ", +" + getAmount() + ", INCOME, transaction " + getIdentifier();
    }

    public Transaction(User recipient, User sender, int amount) {
        this.recipient = recipient;
        this.sender = sender;
        if (amount > 0)
            category = Transfer.CREDITS;
        else
            category = Transfer.DEBITS;
        setAmount(amount);
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (category == Transfer.CREDITS && amount > 0){
            System.out.println("Negative amounts only");
        }
        else if (category == Transfer.DEBITS && amount < 0){
            System.out.println("Positive amounts only");
        }
        this.amount = amount;
    }
}

enum Transfer
{
    DEBITS,
    CREDITS
}