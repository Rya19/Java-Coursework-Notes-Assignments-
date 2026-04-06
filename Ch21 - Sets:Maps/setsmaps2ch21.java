import java.util.*;

public class setsmaps2ch21 {
  public static void main(String[] args) {
    // Create a linked hash set
    Set<String> set = new LinkedHashSet<>();
    
    // Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York"); //try adding an existing element in a set, it will not work since sets are non duplciate.

    System.out.println(set);

    // Display the elements in the hash set
    for (String element : set) //for each element (of type string) in the Set named set:
      System.out.print(element.toLowerCase() + " ");
  }
}