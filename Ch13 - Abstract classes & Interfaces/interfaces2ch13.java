public class interfaces2ch13 {

    public static void main(String[] args) {
        
    }
}

interface K {

}
interface J extends K {

}

abstract class A extends Object implements K{ //abstract class can extend a concrete class and vice versa

}

class B extends A {

}