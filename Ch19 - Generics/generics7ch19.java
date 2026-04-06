public class generics7ch19 {
    public static void main(String[] args) {
      GenericStack<Integer> intStack = new GenericStack<>();
      intStack.push(1); // 1 is autoboxed into an Integer object
      intStack.push(2);
      intStack.push(-2);
  
      print(intStack);
    }
  
    /** Print objects and empties the stack */
    public static void print(GenericStack<?> stack) { //Put question mark here for type so it takes any value
      while (!stack.isEmpty()) {
        System.out.print(stack.pop() + " ");
      }
    }
  }