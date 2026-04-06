public class generics8ch19 {
    public static void main(String[] args) {
      GenericStack<String> stack1 = new GenericStack<>();
      GenericStack<Object> stack2 = new GenericStack<>();

      stack2.push("Java"); //of type object, so i can assign whatever i want to it.
      stack2.push(2);
      stack1.push("Sun");

      add(stack1, stack2); // Add everything in stack1 to stack2
      AnyWildCardDemo.print(stack2);
    }
  
    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) { //and supertype of the generic class T
      while (!stack1.isEmpty())
        stack2.push(stack1.pop());
    }
  }