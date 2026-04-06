public class ch12except8 {

    public static void main(String[] args) {
        try {
            throw new A_superclass("class A");
        }
        catch(A_superclass obj) {
            System.out.println(obj.toString());
        }
    }
}

class A_superclass extends ArithmeticException {
    A_superclass(String message) {
        super(message); //passing message to the superclass's constructor
    }
}