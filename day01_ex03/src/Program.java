import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User test1 = new User("Dima", 1000);
        User test2 = new User("Oleg", 1000);
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.randomUUID();
        test1.getTranList().addTransaction(new Transaction(uuid1,test1, test2, 500));
        test1.getTranList().addTransaction(new Transaction(uuid2,test1, test2, 300));
        System.out.println(test1.getTranList().toArray()[0]);
        System.out.println(test1.getTranList().toArray()[1]);
        try {
            test1.getTranList().removeTransaction(uuid3);
        } catch (TransactionNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}