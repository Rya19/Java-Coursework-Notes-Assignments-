import java.util.*;

public class queuestack2ch20 {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>(); //interface of type collection that takes only String objects = to a concerete class Arraylsist that implements Collection interface. 
    //Left side is type Collection b/c so Arraylist has more methods to work with that are part of Collection interface. If we make it Arraylist (or whatever concrete class), we will only get
    //the methods that belong to Arraylist only. So making the left side of type Collection lets us use its methods along with the arraylist methods. 
    collection.add("New York");
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    Iterator<String> iterator = collection.iterator(); //creates an iterator object of type string which will iteratore over string objects.

    while (iterator.hasNext()) { //returns true if there are more elements to process. 
      System.out.print(iterator.next().toUpperCase() + " "); //next returns the next element in the iteration and moves to the internal pointer to the following element
    }

    //System.out.println(); ??????
  }
}