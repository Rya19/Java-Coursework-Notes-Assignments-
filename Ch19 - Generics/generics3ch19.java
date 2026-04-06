public class generics3ch19 {

    public static void main(String[] args) {
        
    }

    public class GenericStack<E> { //Is it like templates in c++?
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
}