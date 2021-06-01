public class Program {
    public static void main(String[] args) {
        User test = new User("Dima", 100);
        User test2 = new User("Oleg", -200);
        Transaction transaction = new Transaction(test, test2, 100);
        System.out.println(transaction.toString());
    }
}