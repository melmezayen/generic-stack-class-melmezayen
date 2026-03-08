package melmezayen;

public class Main {

    public static void main(String[] args) {

        // -------- NUMBER STACK TEST --------
        System.out.println("NUMBER STACK TEST");

        Stack<Integer> numberStack = new Stack<>(5);

        try {

            // push numbers onto the stack
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            // print stack content
            System.out.println("Stack content: " + numberStack.list());

            // peek top element
            System.out.println("Top element (peek): " + numberStack.peek());

            // pop element
            System.out.println("Popped element: " + numberStack.pop());

            // print stack again
            System.out.println("Stack after pop: " + numberStack.list());

        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }

        // -------- TEXT STACK TEST --------
        System.out.println("\nTEXT STACK TEST");

        Stack<String> textStack = new Stack<>(3);

        try {

            // push text elements
            textStack.push("Apple");
            textStack.push("Banana");
            textStack.push("Orange");

            // show stack content
            System.out.println("Stack content: " + textStack.list());

            // test stack full
            textStack.push("Mango");

        } catch (StackFullException e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        try {

            // remove all elements
            System.out.println("Pop: " + textStack.pop());
            System.out.println("Pop: " + textStack.pop());
            System.out.println("Pop: " + textStack.pop());

            // test empty stack
            System.out.println("Pop: " + textStack.pop());

        } catch (StackEmptyException e) {
            System.out.println("Expected error: " + e.getMessage());
        }
    }
}