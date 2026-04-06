import java.util.Comparator;

public class queuestack5ch20 implements Comparator<GeometricObject>, java.io.Serializable { //serializable means we can write them right away to a file as an object
  public int compare(GeometricObject o1, GeometricObject o2) {
    return o1.getArea() > o2.getArea() ? 1 : o1.getArea() == o2.getArea() ? 0 : -1;
  }
}