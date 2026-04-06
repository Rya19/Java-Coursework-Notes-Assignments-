public class inher2ch11 {

    public static void main(String[] args) {
        /*
        
         */

        B obj1 = new B(); //jva will check the data type of this variable if its class B or A.
        System.out.println(obj1.toString()); //toString is default funciton in Object superclass
        //Instead of giving a hascode, it prints out our statement by overriding it.

        

    }
}


class A extends Object{ //by default, extends Object is added
    public String toString() {
        return "This is class A.";
    }


}

class B extends A{
    //We can override functions by...
    public String toString() { //use same modifiers when overriding method
        return "This is class B."; 
    } //If this override function isnt in this class, it will invoke the one in the superclass | This is class A.

}