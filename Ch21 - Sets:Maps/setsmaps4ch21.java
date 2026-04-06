import java.util.*;
import java.util.Comparator;

public class setsmaps4ch21 {
  public static void main(String[] args) {
    // Create a tree set for geometric objects using a comparator
    Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());

    set.add(new Rectangle(4, 5));
    set.add(new Circle(40));
    set.add(new Circle(40));
    set.add(new Rectangle(4, 1));

    // Display geometric objects in the tree set
    System.out.println("A sorted set of geometric objects");
    for (GeometricObject element: set)
      System.out.println("area = " + element.getArea());
  }
}


class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable { //creates a custom comparator class
  public int compare(GeometricObject o1, GeometricObject o2) { //tells java to compare 2 objects of type geometric object (at least superclass)
    return o1.getArea() > o2.getArea() ? 1 : o1.getArea() == o2.getArea() ? 0 : -1; //simplified if-statement
  }
}