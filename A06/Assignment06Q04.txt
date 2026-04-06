
import java.io.IOException;

public class Assignment06Q04 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA");
        } 
        catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        try {
            throw new ExceptionB("ExceptionB");
        } 
        catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        try {
            throw new NullPointerException("NullPointerException");
        } 
        catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        
        try {
            throw new IOException("IOException");
        } 
        catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}


class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message); //custom message
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}