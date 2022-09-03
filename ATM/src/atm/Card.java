package atm;

public class Card {

    private int pin;

    private int balance;

    public Card(int pin, int initialBalance) {
        this.pin = pin;
        this.balance = initialBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
