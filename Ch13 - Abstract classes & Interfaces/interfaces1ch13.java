public class interfaces1ch13 {

    public static void main(String[] args) {
        //A obj1 = new A(); //cannot make obj
        B_childclass B_obj = new B_childclass();
        B_obj.output_func();


        //an instance of a superclass is an instance of its subclass???????????????
        A_superclass B_obj2 = new B_childclass();
        B_obj2.output_func();

    }
}

interface A_superclass { //not a superclass
    public abstract void output_func(); //B must override this function
    
}

interface C_childclass {

}

class B_childclass implements A_superclass, C_childclass { //a class can inherit multiple interfaces, but not inherit from a class
    @Override
    public void output_func() { //need exact keywords used in superclass, but dont need abstract
        System.out.println(123);
    }
}