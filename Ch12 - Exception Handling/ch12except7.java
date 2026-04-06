public class ch12except7 {

    public static void main(String[] args) {
        try {
            func1();
        }
        catch(ArithmeticException obj) {
            
        }
    }

    static void func1() {

        try {
            throw new ArithmeticException();
            
        }
        finally {
            System.out.println("End"); //code in the finally block will be excuted nom matter what, if you have a exception or not
        }

    }
}