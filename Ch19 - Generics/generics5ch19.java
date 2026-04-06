import java.math.BigDecimal;

public class generics5ch19 {

    public static void main(String[] args) {    
        equal(new Integer(5), new Integer(8));
        equal(new BigDecimal(2.4), new BigDecimal(6.5));
    }

    public static <E extends Number> boolean equal(E obj1, E obj2) {
        return obj1 == obj2;
    }
}