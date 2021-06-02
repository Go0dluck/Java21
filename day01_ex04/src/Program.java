public class Program {
    public static void main(String[] args) throws UserNotFoundException, IllegalTransactionException {
        User test1 = new User("Dima", 1000);
        User test2 = new User("Oleg", 1300);
        TransactionsService transactionsService = new TransactionsService();
        transactionsService.addUser(test1);
        transactionsService.addUser(test2);
        System.out.println("Balance test1 = " + transactionsService.getBalance(0) + " Balance test2 = " + transactionsService.getBalance(1));
        transactionsService.createTransaction(0, 1, 500);
        System.out.println("Balance test1 = " + transactionsService.getBalance(0) + " Balance test2 = " + transactionsService.getBalance(1));
        for (int i = 0; i < transactionsService.getTransaction(0).length; i++){
            System.out.println(transactionsService.getTransaction(0)[i]);
            System.out.println(transactionsService.getTransaction(1)[i]);
        }
        try {
            transactionsService.delTransaction(transactionsService.getTransaction(0)[0].getIdentifier(), 0);
        } catch (TransactionNotFoundException e) {
            e.printStackTrace();
        }
        Transaction[] transactions = transactionsService.checkValid();
        System.out.println("Check valid transaction " + transactions[0]);
        transactionsService.createTransaction(0, 1, 5000);
    }
}
