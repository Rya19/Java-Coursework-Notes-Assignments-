public class inher8ch11 {

    public static void main(String[] args) {
        A_superclass a1 = new A_superclass();
        System.out.println(a1.toString());

        B_childclass b1 = new B_childclass(); //java will check if toString is in class B. If not, it will invoke the one in class A.
        System.out.println(b1.toString());
    }

    static void f(A_superclass obj) {

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
