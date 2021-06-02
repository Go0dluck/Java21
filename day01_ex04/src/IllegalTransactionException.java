public class IllegalTransactionException extends Throwable{
    public IllegalTransactionException(){
        super("Too large amount of transfer");
    }
}
