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
            return sender.getName() + " -> " + recipient.getName() + ", " + getAmount() + ", OUTCOME, transaction " + getIdentifier();
        else
            return sender.getName() + " -> " + recipient.getName() + ", +" + getAmount() + ", INCOME, transaction " + getIdentifier();
    }

    public Transaction(UUID uuid, User sender, User recipient, int amount) {
        this.sender = sender;
        this.recipient = recipient;
        if (amount > 0)
            category = Transfer.DEBITS;
        else
            category = Transfer.CREDITS;
        identifier = uuid;
        setAmount(amount);
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

enum Transfer
{
    DEBITS,
    CREDITS
}