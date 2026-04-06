public class Ch11and13practice {
    public static void main(String[] args) {
        // Create an array of GeometricObject containing circles and rectangles
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(2.0);
        objects[1] = new Rectangle(3.0, 4.0);
        objects[2] = new Circle(3.0);
        objects[3] = new Rectangle(2.5, 5.0);

        // Display the original objects
        System.out.println("Original Objects:");
        for (GeometricObject obj : objects) {
            System.out.println(obj);
        }

        // Resize objects that are resizable (in this case, circles)
        for (GeometricObject obj : objects) {
            if (obj instanceof Resizable) {
                ((Resizable) obj).resize(1.5);
            }
        }

        System.out.println("\nAfter resizing circles:");
        for (GeometricObject obj : objects) {
            System.out.println(obj);
        }

        // Extract circles and sort them by area
        Circle[] circles = java.util.Arrays.stream(objects)
                                 .filter(o -> o instanceof Circle)
                                 .toArray(Circle[]::new);
        java.util.Arrays.sort(circles);
        System.out.println("\nSorted Circles by Area:");
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}

// Abstract class for geometric objects
abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

// Interface to allow objects to be resized
interface Resizable {
    void resize(double factor);
}

// Circle class that implements Comparable and Resizable
class Circle extends GeometricObject implements Comparable<Circle>, Resizable {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Compare circles based on their area
    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    // Resize the circle by adjusting its radius
    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + ", area = " + getArea();
    }
}

// Rectangle class that extends GeometricObject
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height + ", area = " + getArea();
    }
}
