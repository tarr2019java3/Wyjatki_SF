package pl.sda.wyjatki.exceptions;

public class EmailException extends Exception {
    public EmailException() {
    }

    public EmailException(String message) {
        super(message);
    }
}
