import java.util.*;

public class TestGeometricObject {
  /** Main method */
    public static void main(String[] args) {
        GeometricObject[] geo_objs = {new Circle(5), new Circle(6), new Rectangle(2, 3), new Rectangle(3, 4)};

        ArrayList<GeometricObject> Arr_geo_objs = new ArrayList<>();
        Arr_geo_objs.add(new Rectangle(10, 20));
        Arr_geo_objs.add(new Rectangle(20, 30));
        Arr_geo_objs.add(new Circle(5));
        Arr_geo_objs.add(new Circle(15));


        System.out.println("Before Sorting: ");
        for (GeometricObject obj : geo_objs) {
            System.out.printf("%-10.1f", obj.getPerimeter());
        }
        System.out.println();


        System.out.println("After Sorting: ");
        Arrays.sort(geo_objs);
        for (GeometricObject obj : geo_objs) {
            System.out.printf("%-10.1f", obj.getPerimeter());
        }
        System.out.println();

        Search(Arr_geo_objs, new Rectangle(10, 20));
        Search(Arr_geo_objs, new Circle(15));

    }

    static int Search(ArrayList<GeometricObject> list2, GeometricObject element) {
        if (list2.contains(element)) {
            System.out.println("Found at index: ");
            return list2.indexOf(element);
        }
        else {
            return -1;
        }
    }
}