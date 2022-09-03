package exceptions;

public class NotEnoughPermissions extends ATMException{

    public NotEnoughPermissions() {
        super("You don't have permissions");
    }
}
