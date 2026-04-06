import java.math.BigDecimal;
import java.math.BigInteger;

public class bigintex1 {

    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("6789024658264035867987259875");
        BigInteger num2 = new BigInteger("3598532589723912769029763253");

        BigInteger sum_of_2_num = num1.add(num2);
        System.out.println(sum_of_2_num);

        BigInteger product_2_num = num1.multiply(num2);
        System.out.println(product_2_num);

        BigInteger diff = num1.subtract(num2);
        System.out.println(diff);

        BigInteger quot = num1.divide(num2);
        System.out.println(quot);

        //For bigDecimal
        System.out.println();

        BigDecimal dec1 = new BigDecimal("10.472");
        //Same functions like add, div, quot, etc.

    }
}