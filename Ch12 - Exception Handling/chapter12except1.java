public class chapter12except1 {

    public static void main(String[] args) {
        //The method should not terminate the program, instead, the user should.

        try {
            ArithmeticException obj1 = new ArithmeticException("Error"); //an error type of an object
            throw obj1;
            //System.out.println("A"); This statement os unreachable once the throw line executes

        }
        catch(ArithmeticException obj) {
            System.out.println(obj.toString());
        }
    }
}