public class inher10ch11 {

    public static void main(String[] args) {
        
        Object a1 = new A_superclass();

        

        // A_superclass a2 = a1; //compilation error b/c java deosnt know a1 is referncing to class A.

        A_superclass a2;
        if (a1 instanceof A_superclass) { //if a1 is an object of class A
            a2 = (A_superclass)a1; //casting | 
            System.out.println("bbbb");
        }

    }
}

class A_superclass { //extends Object

}


class B_childclass extends A_superclass { 

}

class C_childclass extends A_superclass {

}