public class classes3ch9 {

    public static void main(String[] args) {
        A a1 = new A(5); //making object of class in heap area
        A a2 = new A();
        //new is used to construct object. when object created in heap, reference to that object will be saved in the variable name of the class

    }
}

class A { //java wil lcreate a constructor for oyu only if you dont have any made
    int x;

    A(int a) { //assigns x to a, whatever variable is passed in the parameter
        x = a;
    }

    A() {

    }

}