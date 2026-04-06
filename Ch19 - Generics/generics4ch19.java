public class generics4ch19 {
    public static void main(String[] args ) {
      Rectangle rectangle = new Rectangle(2, 2);
      Circle circle = new Circle(2);
  
      System.out.println("Same area? " +
        equalArea(rectangle, circle));
    }
  
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) { //takes type E or any subclass of type Geometricobject
      return object1.getArea() == object2.getArea();
    }
  }