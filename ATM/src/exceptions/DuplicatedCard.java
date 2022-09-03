package exceptions;

public class DuplicatedCard extends ATMException{

    public DuplicatedCard(){
        super("This card is duplicated.");
    }
}
