package melmezayen;

/**
 * Exception that is thrown when an element
 * is pushed onto a full stack.
 */
public class StackFullException extends Exception {

    public StackFullException(String message) {
        super(message);
    }

    public StackFullException() {
        super("Stack Full Exception was thrown!");
    }
}