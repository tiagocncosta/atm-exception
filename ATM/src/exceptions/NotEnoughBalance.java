package exceptions;

public class NotEnoughBalance extends ATMException{
    public NotEnoughBalance() {
        super("The is not enough balance");
    }
}
