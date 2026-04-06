public class abstract1ch13 {

    public static void main(String[] args) {
        A_superclass[] list1 = new A_superclass[5];
        list1[0] = new B_childclass(); //can put any subclass of class A into array, cannot put A inside since its abrstract


    }
}

//Abstract classes are functions that are not built, but are provided for inheriting classes to modify them in their own completely different way
//like how a circle and rectangle has their own area calculating function or way
abstract class A_superclass { //canot make object of this class

    abstract void func_1(); //abstract function for other classes to change

}

class B_childclass extends A_superclass { //class B must be abstract or override abstract func to remove error
    void func_1() {

    }
}