public class TransactionNotFoundException extends Throwable{
    public TransactionNotFoundException(){
        super("Transaction not found");
    }
}
