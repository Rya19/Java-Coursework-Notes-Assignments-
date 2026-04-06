public class inher3ch11 {

    public static void main(String[] args) {
        /*
        
         */

        

        

    }
}


class A extends Object{ //by default, extends Object is added


    int y;

    A() {

    }

    A(int y){ //construcotr
        this.y = y;
        //System.out.println("No arg constructor");
    }

    /*
    public String toString() {
        return "This is class A.";
    }
    */



}

class B extends A{

    int x;
    B(int x){ //constructor
        super(5); //can make a no arg const, or pass a value
        this.x = x;
    }

    //We can override functions by...
    public String toString() { //use same modifiers when overriding method
        return "This is class B." + ", " + super.toString(); //jvm will know this is the method that is defined in the superclass
    } //If this override function isnt in this class, it will invoke the one in the superclass | This is class A.

}