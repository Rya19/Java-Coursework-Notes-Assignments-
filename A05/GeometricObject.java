//All these files are PUBLIC
public abstract class GeometricObject implements Comparable<GeometricObject> {
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

  @Override
  public int compareTo(GeometricObject other) {
      if (this.getPerimeter()  > other.getPerimeter()) {
          return 1;
      }
      else if (this.getPerimeter()  < other.getPerimeter()) {
          return -1;
      }
      else {
          return 0;
      }
  }

  public boolean equals(GeometricObject obj) {
      return this == obj;
  }

  @Override
  public boolean equals(Object geo_obj) {
      if (geo_obj instanceof Rectangle) {
          return this.getPerimeter() == ((Rectangle)geo_obj).getPerimeter();
      }
      else if (geo_obj instanceof Circle) {
          return this.getPerimeter() == ((Circle)geo_obj).getPerimeter();
      }
      else {
          return false;
      }
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

  @Override
  public String toString() {
    return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
  }

}