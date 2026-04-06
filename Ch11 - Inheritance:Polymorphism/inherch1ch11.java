public class inherch1ch11 {

    public static void main(String[] args) {
        /* INHERITANCE & POLYMORPHISM
        
        
         */

         Object[] list = {new Integer(4), new Double(2.3), "abc", true, 642, new B()}; //object type can hold different types

         for (Object o : list) {
            System.out.println(o);
         }
    }
}

class B extends Object{} //object is like the god of all classes in a way

class A extends B{} //this is interitance