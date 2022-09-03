package exceptions;

public class CardNotInserted extends ATMException{
    public CardNotInserted() {
        super("The is no card in this ATM");
    }
}
