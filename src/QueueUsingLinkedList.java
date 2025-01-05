import java.util.LinkedList;

public class QueueUsingLinkedList {
    private LinkedList<Integer>queue;

    public QueueUsingLinkedList(){
        queue = new LinkedList<>();
    }

    //Enqueue method to add elements to the queue (at end of list)
    public void enqueue(int value){
        queue.addLast(value);
    }

    //Dequeue method to remove front element from queue
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException(("Queue is empty."));
        }
        return queue.removeFirst();
    }

    //peek method to view front element of queue
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException(("Queue is empty."));
        }
        return queue.getFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //display
    public void displayQueue(){
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args){
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // Enqueuing elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Displaying the queue
        queue.displayQueue(); // Output: Queue: [56, 30, 70]

        // Dequeuing elements and peeking at the front element
        while (!queue.isEmpty()) {
            // Peeking the front element
            System.out.println("Front element (peek): " + queue.peek());

            // Dequeuing the front element
            System.out.println("Dequeued element: " + queue.dequeue());
        }
    }
}
