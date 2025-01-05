import java.util.LinkedList;

public class StackUsingLinkedList {
    private LinkedList<Integer> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    //Push method to add elements to the stack
    public void push(int value){
        stack.addFirst(value); //adds element at front of the list
    }

    //Pop method to remove the top element from stack
    public int pop(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is Empty");



        }
        return stack.removeFirst();  //removes the element from front
    }

    //peek method to view the top element of stack
    public int peek(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.getFirst(); //return first element
    }

    //display stack elements
    public void display(){
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args){
        StackUsingLinkedList stack = new StackUsingLinkedList();

        //Pushing elements onto stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();

        System.out.println("Popped: "+ stack.pop());

        //Peek top element
        System.out.println("Top element: " + stack.peek());


    }
}
