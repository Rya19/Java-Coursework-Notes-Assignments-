public class interfaces5ch13 {

    public static void main(String[] args) {
        
        Object[] list = {new A1()};

        if(list[0] instanceof A1) {
            ((A1)list[0]).output(); //class Object doesn not have a function named "output", so make sure casting goes first before the . operator
        }

    }
}

interface A {
    public abstract void output();
}

class A1 extends Object implements A {
    public void output() {
        System.out.println(123);
    }
}

