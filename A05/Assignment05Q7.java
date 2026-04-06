public class Assignment05Q7 {

    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(2);
        objects[1] = new Square(4.5);
        objects[2] = new Square(5);
        objects[3] = new Circle(5);
        objects[4] = new Rectangle(3, 4);

        for (GeometricObject obj : objects) {
            System.out.println("Area is: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }

        //For comparing
        ComparableSquare square1 = new ComparableSquare(5);
        ComparableSquare square2 = new ComparableSquare(8);
        
        System.out.println("Comparing the areas of two squares for sides " + square1.getSide() + " and " + square2.getSide());
        ComparableSquare largerSquare = (square1.compareTo(square2) > 0) ? square1 : square2;
        System.out.println("The largest Area is " + largerSquare.getArea());
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

class ComparableSquare extends Square implements Comparable<ComparableSquare> {
    public ComparableSquare(double side) {
        super(side);
    }

    @Override
    public int compareTo(ComparableSquare o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
  
    /** Construct a default geometric object */
    protected GeometricObject() {
      dateCreated = new java.util.Date();
    }
  
    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
    }
  
    /** Return color */
    public String getColor() {
      return color;
    }
  
    /** Set a new color */
    public void setColor(String color) {
      this.color = color;
    }
  
    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
      return filled;
    }
  
    /** Set a new filled */
    public void setFilled(boolean filled) {
      this.filled = filled;
    }
  
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
      return dateCreated;
    }
  
    /** Return a string representation of this object */
    public String toString() {
      return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }
  
    /** Abstract method getArea */
    public abstract double getArea();
  
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
  }


class Circle extends GeometricObject {
    private double radius;
  
    public Circle() {
    }
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    /** Return radius */
    public double getRadius() {
      return radius;
    }
  
    /** Set a new radius */
    public void setRadius(double radius) {
      this.radius = radius;
    }
  
    @Override /** Return area */
    public double getArea() {
      return radius * radius * Math.PI;
    }
  
    /** Return diameter */
    public double getDiameter() {
      return 2 * radius;
    }
  
    @Override /** Return perimeter */
    public double getPerimeter() {
      return 2 * radius * Math.PI;
    }
  
    /* Print the circle info */
    public void printCircle() {
      System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }
  }

  
  class Rectangle extends GeometricObject {
    private double width;
    private double height;
  
    public Rectangle() {
    }
  
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    /** Return width */
    public double getWidth() {
      return width;
    }
  
    /** Set a new width */
    public void setWidth(double width) {
      this.width = width;
    }
  
    /** Return height */
    public double getHeight() {
      return height;
    }
  
    /** Set a new height */
    public void setHeight(double height) {
      this.height = height;
    }
  
    @Override /** Return area */
    public double getArea() {
      return width * height;
    }
  
    @Override /** Return perimeter */
    public double getPerimeter() {
      return 2 * (width + height);
    }
  }

