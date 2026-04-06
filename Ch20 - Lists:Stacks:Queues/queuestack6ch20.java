import java.util.Comparator; //For comparing objects

public class queuestack6ch20 {
  public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);
    GeometricObject g2 = new Circle(5);

    GeometricObject g = max(g1, g2, new queuestack5ch20()); //the new queuestack object is for the compare method
    //Basically saying "Heres 2 shapes and a tool to get the max"

    System.out.println("The area of the larger object is " + g.getArea());
  }
  
  public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
  	return c.compare(g1, g2) > 0 ? g1 : g2;
  }
}