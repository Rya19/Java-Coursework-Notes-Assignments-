import java.util.Vector;
public class queuestack10ch20 {
public static void main(String[] args) {
// Creating a Vector
Vector<String> vector = new Vector<>();
// Adding elements to the Vector
vector.add("Apple");
vector.add("Banana");
vector.add("Cherry");
System.out.println("Vector after additions: " + vector);
// Accessing an element
String elementAtIndex1 = vector.get(1);
System.out.println("Element at index 1: " + elementAtIndex1);
// Removing an element from the Vector
vector.remove("Banana");
System.out.println("Vector after removal: " + vector);
// Getting the size of the Vector
int size = vector.size();
System.out.println("Size of the Vector: " + size);
}
}