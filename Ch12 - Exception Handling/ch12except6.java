
public class ch12except6 {

    public static void main(String[] args) {
        try {
            func1();
        }
        catch(ArithmeticException obj2) {

        }
    }

    static void func1() { //used to throw an exception and continue the function partially
        try {
            throw new ArithmeticException();
        }

        catch(ArithmeticException obj) { //can make a new throw obj and make it runtime, then the catch in main will have to be runtime as well
            throw obj;
        }
    }
}