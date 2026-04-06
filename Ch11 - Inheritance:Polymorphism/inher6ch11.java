public class inher6ch11 {

    public static void main(String[] args) {
        A_superclass[] list_1 = {new A_superclass(), new B_childclass()}; //cannot add class C into array since its not a child of A.
    }
}


class A_superclass {

}


class B_childclass extends A_superclass { 

}

class C { //hidden in array unless you make it extend to A

}