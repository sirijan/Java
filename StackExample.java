package GGG;
import java.util.Stack;
public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into stack
        stack.push(10);
        System.out.println("Pushed element: " + stack.peek());
        stack.push(20);
        System.out.println("Pushed element: " + stack.peek()); 
        stack.push(30);
        System.out.println("Pushed element: " + stack.peek()); 

        // Popping elements from stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Trying to pop when stack is empty
        try {
            System.out.println("Popped element: " + stack.pop());
        } catch (Exception e) {
            System.out.println("Stack is empty, Cannot pop element");
        }

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}