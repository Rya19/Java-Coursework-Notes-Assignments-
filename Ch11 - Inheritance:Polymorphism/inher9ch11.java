public class inher9ch11 {

    public static void main(String[] args) {
        Object[] list = {new Integer(3), new A_superclass(), new B_childclass(), new C_childclass()}; //can use Object type to have different objects in array.
        //Using a superclass array only allows its childs to be in the array.
        
    }
}

class A_superclass { //extends Object

    @Override //Used to implement this function in a different way, need to use exact signature and return type. 
    public String toString() {
        return "Class A";
    }
}


class B_childclass extends A_superclass { 

}

class C_childclass extends A_superclass {

}