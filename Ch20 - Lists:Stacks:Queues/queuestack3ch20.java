import java.util.*;

public class queuestack3ch20 {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    //Foreach only avaliable for objects that implement the Iterable interface (which Arraylist does).
    //Lambda expression performs an action on each element. 
    collection.forEach(elem -> System.out.print(elem.toUpperCase() + " ")); //
  }
}