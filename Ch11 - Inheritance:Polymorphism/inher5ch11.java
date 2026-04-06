public class inher5ch11 {

    public static void main(String[] args) {
        B_childclass B1 = new B_childclass();

        //A_superclass A1 = new B_childclass();
        //A_superclass A2 = new A_superclass();
        //B_childclass B2 = new A_superclass(); //cannot do this due to the polymorphism rule | every circle is a geometric shape, but every geometric shape isnt a circle
                                // You can't even cast it as well (runtime error) Cannot cast superclass with a base class
        

    }
}

class A_superclass {

}


class B_childclass extends A_superclass { 

}