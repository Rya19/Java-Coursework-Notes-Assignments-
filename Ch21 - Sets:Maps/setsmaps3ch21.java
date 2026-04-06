import java.util.*;

public class setsmaps3ch21 {
  public static void main(String[] args) {
    // Create a hash set
    Set<String> set = new HashSet<>();

    // Add strings to the set (not in order)
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    TreeSet<String> treeSet = new TreeSet<>(set); //creates new treeset from existing set (and removed duplicates)
    System.out.println("Sorted tree set: " + treeSet); // set is ordered in alphabetical order

    // Use the methods in SortedSet interface
    System.out.println("first(): " + treeSet.first()); //returns the smallest (alphabetically first) elemen
    System.out.println("last(): " + treeSet.last()); //returns the largest (alphabetically last) elemen

    System.out.println("headSet(\"New York\"): " +  treeSet.headSet("New York")); //Returns all elements less than "New york"
    System.out.println("tailSet(\"New York\"): " +  treeSet.tailSet("New York")); //Returns all elements greater-than or equal to New York

    // Use the methods in NavigableSet interface
    System.out.println("lower(\"P\"): " + treeSet.lower("P")); //returns the greatest element less than "P" (alphabetically)
    System.out.println("higher(\"P\"): " + treeSet.higher("P")); //returns the smallest element greater than "P"

    System.out.println("floor(\"P\"): " + treeSet.floor("P")); //returns the greatest element less than or equal to "P"
    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P")); //eturns the smallest element greater than or equal to "P"

    System.out.println("pollFirst(): " + treeSet.pollFirst()); //removes Beijing
    System.out.println("pollLast(): " + treeSet.pollLast()); //Removes san francisco
    
    System.out.println("New tree set: " + treeSet);
  }
}