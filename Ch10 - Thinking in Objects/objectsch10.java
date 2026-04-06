import java.math.BigDecimal;
import java.math.BigInteger;

public class objectsch10 {
    public static void main(String[] args) {
        Integer i = new Integer(4); //4 is represented as object i (wrapper class?)
        System.out.println(i.floatValue()); //method returns primitive floating value 4.0


        String str = new String("ABC");
        String str2 = "xyz"; //2 ways to create a string object(?)

        Double d = new Double("1.5"); //marked for removal apparently
        Double d2 = 1.5; //autoboxing
        Double x = d; //autounboxing

        Integer[] list = {1, 2, 3, 4}; //autounboxing

        for (Integer num : list) {
            System.out.println(num);
        }


        BigInteger n = new BigInteger("15251298509172501825"); //cannot put number by itself, need "" around number
        BigDecimal n2 = new BigDecimal("1.43479198789125329897");

        //To add 2 bigInts, you can do this
        //System.out.println(n.add(n2)); // Only if they are the same (you can multiply and do other stuff)

}    
    
}