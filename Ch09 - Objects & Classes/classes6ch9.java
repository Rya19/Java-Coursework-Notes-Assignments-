public class classes6ch9 {
    int x; //create a data field here...
    public static void main(String[] args) {
        //x = 5; //will get syntax error b/c non-static
        //setX(5); //main can use X and setX function, but static method cannot use or access non-static members of the class (like X), same goes for the function since it is nonstatic
        //To fix, declare variable as static, and function

        //So, create an object of the class
        classes6ch9 obj1 = new classes6ch9();
        obj1.x = 5; //when you make object of a class, you can access nonstatic methods and variables
        obj1.setX(5);



        Circle circ1 = new Circle(5); //creaeting 2 objects
        Circle circ2 = new Circle(7);

        //circ1.setRadius(5); //each object has its own radius
        //circ2.setRadius(8);

        System.out.println(circ1.radius + " " + circ2.radius); //pritning out by using dot notation
        System.out.println(circ1.circle_amount + " " + circ2.circle_amount); //circ1 and circ2 share the same circle amount value since it is static


    }

    void setX(int num) { //set function
        x = num;
    }

}

class Circle {
    static int circle_amount; //making this static so we know how many circle objects we created. | also set as 0 by deafult
    double radius; //if you make this variable static, ALL variables will share the same value, no matter how many objects you make.

    void setRadius(double rad) {
        radius = rad;
        circle_amount++;
    }

    Circle (double rad) { //constructor
        radius = rad;
        circle_amount++;
    }

}

class A_Class {
    int number; //instance variable, cannot be used unless object has been made.

    A_Class(int num) {
        number = num;
    }
}
