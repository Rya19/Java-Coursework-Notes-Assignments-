import java.io.IOException;

public class ch12except3 {

    public static void main(String[] args) throws Exception { //another way to fix just a "throw new IOexep()" is to add throws exception in main
        //throw new ArithmeticException(); //runtime error since im not handling this | unchecked exception

        try {
            throw new IOException(); //runtime error, so use try/catch block
        }
        catch(Exception obj) {//takes a parent of the thrown obj

        }
    }
}