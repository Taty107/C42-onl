package homework13;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super("The login was entered incorrectly!");
    }
}
