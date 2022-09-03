package exceptions;

public class CardAlreadyPresent extends ATMException{

    public CardAlreadyPresent() {
        super("There is already a card in the machine");
    }
}
