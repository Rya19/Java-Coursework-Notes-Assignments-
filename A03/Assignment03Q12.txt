import java.math.*;

public class Assignment03Q12 {

    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE+1);

        BigInteger three = BigInteger.valueOf(3); //need these for mod function
        BigInteger five = BigInteger.valueOf(5);

        int count = 0;
        
        while (count < 25) {
            if (start.mod(three).equals(BigInteger.ZERO) && start.mod(five).equals(BigInteger.ZERO)) { //mod = modulus
                System.out.print(start + " ");
                count++;
            }

            if (count % 5 == 0) {
                System.out.println();
            }
            start = start.add(BigInteger.ONE);
        }
    }
}