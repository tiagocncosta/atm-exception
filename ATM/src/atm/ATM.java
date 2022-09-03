package atm;

import exceptions.*;

public class ATM {

    public Card card;

    private boolean isCardValidated;

    public void insertCard(Card card) throws DuplicatedCard, CardNotInserted {
        if (this.card == card) {
            throw new DuplicatedCard();
        }
        if (this.card != null) {

            throw new CardNotInserted();
        }
        this.card = card;
        System.out.println("You card was inserted");
    }

    public void ejectCard() {
        this.card = null;
        isCardValidated = false;
    }

    public void insertPin(int pin) throws NotEnoughPermissions{

        if (card.getPin() != pin) {
            throw new NotEnoughPermissions();
        }
        isCardValidated = true;
        System.out.println("Your card is validated");
    }

    public void withdraw(int amount) throws NotEnoughPermissions, CardNotInserted {

        validateInsertedCard();

        if (!isCardValidated) {
        throw new NotEnoughPermissions();
        }
        if (card.getBalance() < amount) {
        throw new NotEnoughPermissions();
        }
        card.setBalance(card.getBalance() - amount);
        System.out.println("Withdrawing " + amount + " balance left " + card.getBalance());
    }

    private void validateInsertedCard() throws CardNotInserted {
        if (card == null) {
            throw new CardNotInserted();
        }
    }

}
