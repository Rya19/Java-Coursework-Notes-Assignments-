import java.util.*;

public class setsmaps6ch21 {
  public static void main(String[] args) {
    // Create a HashMap
    Map<String, Integer> hashMap = new HashMap<>(); //creates a hasmap that stores strings and integers.
    hashMap.put("Perez", 30); //inserting objects into hashmap
    hashMap.put("Washington", 31);
    hashMap.put("Lewis", 29);
    hashMap.put("Cook", 29);

    System.out.println("Display entries in HashMap");
    System.out.println(hashMap + "\n");



    // Create a TreeMap from the preceding HashMap
    Map<String, Integer> treeMap = new TreeMap<>(hashMap); //creates a treemap to automatically keep things in order from the original hashmap by name
    System.out.println("Display entries in ascending order of key");
    System.out.println(treeMap);



    // Create a LinkedHashMap
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true); //Remembers the order you accessed them (thanks to the true parameter at the end)
                                                                                //If LF is > 75% of size, increase hashmaps size
    linkedHashMap.put("Perez", 30);
    linkedHashMap.put("Washington", 31);
    linkedHashMap.put("Lewis", 29);
    linkedHashMap.put("Cook", 29);

    // Display the age for Lewis
    System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis")); //we get lewis's age

    System.out.println("Display entries in LinkedHashMap");
    System.out.println(linkedHashMap); //Lewis will show up on last since he was accessed recently
    
    // Display each entry with name and age
    System.out.print("\nNames and ages are ");
    treeMap.forEach((name, age) -> System.out.print(name + ": " + age + " "));
    //For each elemeent in the treemap with the name and age, print them out
  }
}