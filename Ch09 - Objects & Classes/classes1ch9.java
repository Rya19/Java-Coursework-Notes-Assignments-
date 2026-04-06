public class classes1ch9 {
    static int x; //these are non static (instance memebrs of class) | to use it, declare it as static
    double y;
    String s; //reference variable to an object, printing it as a static will return null
    public static void main(String[] args) {
        /*
        regular classes can be public of default (no modifier)
        You can also have only 1 public class

        UML = unified modular loader
        
        Consists of:  Class name (Circle)
                      Data Fields (radius: double)
                      Constructors and methods (Circle(), getArea(): double), etc...

                      circle1: Circle <-- UML notation for objects (these are objects of a class)
                      circle1 can be initialize with radius of 1.0

                      circle2: Circle  -> has radius of 25

         */

        int a;
        //System.out.println(a); //cannot use local var unless its initialized
        System.out.println(x);

        classes1ch9 cl = new classes1ch9();
        System.out.println(cl.s); //since s is non static, make a object of the class to use it
    }
}