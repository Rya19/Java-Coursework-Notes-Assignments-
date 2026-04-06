import java.math.BigInteger;

public class abstract2ch13 {

    public static void main(String[] args) {
        Number[] list1 = new Number[5];
        list1[0] = new Integer(5);
        list1[1] = new Double(5.3);
        list1[2] = new BigInteger("1241259173920202752022093719456");


    }
}

//Abstract classes are functions that are not built, but are provided for inheriting classes to modify them in their own completely different way
//like how a circle and rectangle has their own area calculating function or way
abstract class A_superclass {

    abstract void func_1(); //abstract function for other classes to change

}

class B_childclass extends A_superclass { //class B must be abstract or override abstract func to remove error
    void func_1() {

    }
}