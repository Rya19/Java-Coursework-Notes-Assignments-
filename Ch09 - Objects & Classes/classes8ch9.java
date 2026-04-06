//import java.util.Scanner; //to prevent this from colliding with other files (other classes with tthe same package)


public class classes8ch9 {

    public static void main(String[] args) {
        /*
        public: class, data, orm ethod is visible to any class package
        private: the data or methods can be accessed only by the declaring class (inside the class)
                -the set/get can use these to return and set values
                -the private modifier restructs access t within a class, the default modifier restricts access to within a package, and the public modifier enables unrestruced access

         */

         java.util.Scanner input; //you can do this so it belongs to THIS class




         //To access memebrs of class A:
         //import P1.A;
         A obj1 = new A(); //A is not defined in same package
         System.out.println(obj1.z);
         System.out.println(obj1.x); //cannot access with object (due to default modifier)
         //Because class A is defined in class B pckage, default members can be defined in the same package



    }
}



//package P1;
public class A {
    int x;
    private int y;
    public int z;
}


//package P1;

public class B {
    int x;
    private int y;
    public int z;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x); //cannot acces just X, need an object
        System.out.println(obj.y); //y is private, cannot access with an object (not accessible otuside of the class)
        System.out.println(obj.z); //same with x

    }
}