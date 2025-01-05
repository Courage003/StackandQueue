import java.util.LinkedList;

public class QueueUsingLinkedList {
    private LinkedList<Integer> queue;

    public QueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    // Enqueue method to add elements to the queue (at the end of the list)
    public void enqueue(int value) {
        queue.addLast(value); // Adds the element at the end of the list (rear of the queue)
    }

    // Dequeue method to remove the front element from the queue (beginning of the list)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst(); // Removes the element from the front (beginning of the queue)
    }

    // Peek method to view the front element of the queue
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst(); // Returns the first element (front of the queue)
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Display the queue elements (for visualization)
    public void displayQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // Enqueuing elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Displaying the queue
        queue.displayQueue(); // Output: Queue: [56, 30, 70]

        // Dequeuing elements from the beginning and peeking at the front element
        while (!queue.isEmpty()) {
            // Peeking the front element
            System.out.println("Front element (peek): " + queue.peek());

            // Dequeuing the front element (beginning of the list)
            System.out.println("Dequeued element: " + queue.dequeue());
        }
    }
}
