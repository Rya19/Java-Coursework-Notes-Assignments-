public class inher4ch11 {

    public static void main(String[] args) {
        
        B ob1 = new B();
        System.out.println(ob1); //can also print obj1 

    }
}


class A extends Object{ //by default, extends Object is added
    
    public String toString() {
        return "Class A";
    }
}

class B extends A{

    @Override
    public String toString() {
        return "Class B";
    }
}