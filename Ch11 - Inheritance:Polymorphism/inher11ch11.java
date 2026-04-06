public class inher11ch11 {

    public static void main(String[] args) {
        
        A_superclass a1 = new A_superclass();

        if (a1 instanceof B_childclass) {
            System.out.println(((B_childclass)a1));
        }



        A_superclass obj = new A_superclass();
        A_superclass a;



        if (obj instanceof A_superclass) {
            A_superclass a = (A_superclass)obj;
        }


    }
}

class A_superclass { //extends Object

}


class B_childclass extends A_superclass { 

}

class C_childclass extends A_superclass {

}