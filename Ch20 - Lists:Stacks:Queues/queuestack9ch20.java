import java.util.Stack;
public class queuestack9ch20 {
public static void main(String[] args) {
// Creating a Stack
Stack<Integer> stack = new Stack<>();
// Pushing elements onto the Stack
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println("Stack after pushes: " + stack);
// Popping an element from the Stack
int poppedElement = stack.pop();
System.out.println("Popped element: " + poppedElement);
System.out.println("Stack after pop: " + stack);
// Peeking at the top element of the Stack
int topElement = stack.peek();
System.out.println("Top element: " + topElement);
System.out.println("Final Stack: " + stack);
}
}