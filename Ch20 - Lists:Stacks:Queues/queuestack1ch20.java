import java.util.*;

public class queuestack1ch20 {
  public static void main(String[] args) {

    ArrayList<String> collection1 = new ArrayList<>(); //dynamic array to store string objects
    collection1.add("New York"); 
    collection1.add("Atlanta"); 
    collection1.add("Dallas"); 
    collection1.add("Madison"); // Add "Madison" to collection1, and other stuff too

    System.out.println("A list of cities in collection1:");
    System.out.println(collection1); //[New York, Atlanta, Dallas, Madison]

    //collection1 contains string object dallas?
    System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas")); //returns true or false

    collection1.remove("Dallas"); //Removes dallas string object from string array
    System.out.println("\n" + collection1.size() + " cities are in collection1 now"); //returns the size of the arraylist

    //collection type
    Collection<String> collection2 = new ArrayList<>(); //Collections are data strucutre stuff, like linkedlists, trees, maps, sets, etc. Has useful methods like sorting, searching, 
    collection2.add("Seattle"); 
    collection2.add("Portland"); 
    collection2.add("Los Angles"); 
    collection2.add("Atlanta"); 

    System.out.println("\nA list of cities in collection2:");
    System.out.println(collection2);


    ArrayList<String> c1 = (ArrayList<String>)(collection1.clone()); //creates shallow copy, so c1 has all elems that collection1 has. It returns an object, so cast with arraylist of type string
    c1.addAll(collection2); // Add all elements in collection2 to c1
    System.out.println("\nCities in collection1 or collection2: ");
    System.out.println(c1);


    c1 = (ArrayList<String>)(collection1.clone()); //resets c1 to start fresh
    c1.retainAll(collection2); //c1 will only contain elements that are shared in both collection 1 and 2. In this case, only Atlanta will be stored. 
    System.out.print("\nCities in collection1 and collection2: ");
    System.out.println(c1);


    c1 = (ArrayList<String>)(collection1.clone()); //reset again to be a clone of collection1. 
    c1.removeAll(collection2); //removes from c1 all the elements that also exist in collection2. In this case, Atlanta will be removed.
    System.out.print("\nCities in collection1, but not in 2: ");
    System.out.println(c1);
  }
}