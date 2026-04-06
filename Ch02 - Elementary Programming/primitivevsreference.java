import java.awt.*;

public class primitivevsreference {
        public static void main(String[] args) {
            //Primitives
            byte x = 1;
            byte y = x;
            x = 2;
            System.out.println(y); //variables are completely independent from eachother, so y prints out 1 regardless of the change in x.

            //References
            Point point1 = new Point(1, 1); //passing 2 values (automatically lavels as x, y) | Also, point1 holds the address location of the "Point (1, 1)""
            Point point2 = point1; //So.. point2 holds the address of point1. They are referencing the exact same object.

            point1.x = 2; //if we change this value, the change will be affected to point2.
            System.out.println(point2); //OUTPUT: java.awt.Point[x=2,y=1] | See?

            //REFERENCE TYPES ARE COPIED BY THE REFRENCES
            //PRIMITIVE TYPES ARE COPIED BY THEIR VALUE

        }  
}