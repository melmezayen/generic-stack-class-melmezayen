package melmezayen;

/**
 * Generic stack class
 * The last element that is pushed onto the stack
 * is the first element that will be removed.
 *
 * @param <T> generic data type of the stack elements
 */
public class Stack<T> {

    private Object[] items;
    private int top;

    /**
     * Default constructor.
     * Creates a stack with size 10.
     */
    public Stack() {
        items = new Object[10];
        top = 0;
    }

    /**
     * Constructor with custom stack size.
     *
     * @param size maximum number of elements in the stack
     */
    public Stack(int size) {
        items = new Object[size];
        top = 0;
    }

    /**
     * Pushes a new element onto the stack.
     *
     * @param value element that should be stored
     * @throws StackFullException if the stack is already full
     */
    public void push(T value) throws StackFullException {
        if (top == items.length) {
            throw new StackFullException();
        }

        items[top] = value;
        top++;
    }

    /**
     * Removes the top element from the stack
     * and returns it.
     *
     * @return element on the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException();
        }

        top--;
        T item = (T) items[top];
        items[top] = null;
        return item;
    }

    /**
     * Returns the top element of the stack
     * without removing it.
     *
     * @return element on the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException();
        }

        return (T) items[top - 1];
    }

    /**
     * Returns all stack elements as a string.
     * Elements are separated with ";".
     *
     * @return string containing all stack elements
     */
    public String list() {
        String list = "";

        for (int i = 0; i < top; i++) {
            list += items[i];

            if (i < top - 1) {
                list += ";";
            }
        }

        return list;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        return top == 0;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if stack is full
     */
    public boolean isFull() {
        return top == items.length;
    }
}