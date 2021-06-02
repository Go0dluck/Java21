public class Program {
    public static void main(String[] args) {
        User test1 = new User("Dima", 1000);
        User test2 = new User("Oleg", 1300);
        TransactionsService transactionsService = new TransactionsService();
        transactionsService.createTransaction(test1, test2, 500);
    }
}
