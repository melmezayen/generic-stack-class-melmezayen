package melmezayen;

/**
 * Exception that is thrown when pop or peek
 * is used on an empty stack.
 */
public class StackEmptyException extends RuntimeException {

    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException() {
        super("Stack Empty Exception was thrown!");
    }
}