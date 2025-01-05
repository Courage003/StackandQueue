import java.util.LinkedList;

public class StackUsingLinkedList {
    private LinkedList<Integer> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    // Push method to add elements to the stack
    public void push(int value) {
        stack.addFirst(value); // Adds the element at the front of the list
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeFirst(); // Removes the element from the front
    }

    // Peek method to view the top element of the stack
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getFirst(); // Returns the first element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display the stack elements (for visualization)
    public void displayStack() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Pushing elements onto the stack (order will be reversed internally)
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Peeking and popping elements until the stack is empty
        while (!stack.isEmpty()) {
            // Peeking the top element
            System.out.println("Top element (peek): " + stack.peek());

            // Popping the top element
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
