public class generics6ch19 {
    public static void main(String[] args ) {
      GenericStack<Integer> intStack = new GenericStack<>();
      intStack.push(1); // 1 is autoboxed into an Integer Object
      intStack.push(2);
      intStack.push(-2);
  
      System.out.print("The max number is " + max(intStack)); // Error: 
    }
  
    /** Find the maximum in a stack of numbers */
    public static double max(GenericStack<Number> stack) { //this method can take generticstack of type number | integer is subclas of number, but there is no generic class of subtype number
        //See generics7
      double max = stack.pop().doubleValue(); // initialize max
  
      while (!stack.isEmpty()) {
        double value = stack.pop().doubleValue();
        if (value > max)
          max = value;
      }
  
      return max;
    }
  }

class GenericStack<E> { //Is it like templates in c++?
    private java.util.ArrayList<E> list = new java.util.ArrayList<>(); //array list provided with genertic type E. Can create a lsit of type int or of type float, string, etc
  
    //Functions for the arraylist
    public int getSize() {
      return list.size();
    }
  
    public E peek() {
      return list.get(getSize() - 1);
    }
  
    public void push(E o) {
      list.add(o);
    }
  
    public E pop() { //function of type E.
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
    }
  
    public boolean isEmpty() {
      return list.isEmpty();
    }
    
    @Override
    public String toString() {
      return "stack: " + list.toString();
    }
  }