import atm.ATM;
import atm.Card;
import exceptions.*;

public class Main {

    public static void main(String[] args) throws CardNotInserted, DuplicatedCard, NotEnoughPermissions {
        ATM atm = new ATM();

        Card card1 = new Card(1111, 1000);
        Card card2 = new Card(1234,200);

        atm.insertCard(card1);
        atm.ejectCard();
        atm.insertCard(card2);
        atm.insertPin(1234);
        atm.withdraw(100);
    }
}
