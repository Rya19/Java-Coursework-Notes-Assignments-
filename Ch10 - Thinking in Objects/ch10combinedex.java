import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class ch10combinedex {
    public static void main(String[] args) {
        // Generate a random 10-digit account number
        BigInteger accountNumber = generateAccountNumber();
        
        // Generate a secure random password (12 characters)
        String password = generateSecurePassword(12);
        
        // Generate an initial account balance between 1000.00 and 5000.00
        BigDecimal balance = generateInitialBalance();
        
        // Wrapper class examples
        Integer pin = generatePin(); // Random 4-digit PIN
        Boolean isPremium = balance.compareTo(new BigDecimal("3000.00")) > 0; // Premium if balance > 3000

        // Display the generated account details
        System.out.println("📌 Secure Account Details:");
        System.out.println("🔢 Account Number: " + accountNumber);
        System.out.println("🔐 Secure Password: " + password);
        System.out.println("💰 Initial Balance: $" + balance);
        System.out.println("🔢 PIN: " + pin);
        System.out.println("🌟 Premium Account: " + isPremium);
    }

    private static BigInteger generateAccountNumber() {
        SecureRandom rand = new SecureRandom();
        return new BigInteger(10 * 3, rand).mod(new BigInteger("9000000000")).add(new BigInteger("1000000000"));
    }

    private static String generateSecurePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random rand = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        return password.toString();
    }

    private static BigDecimal generateInitialBalance() {
        Random rand = new Random();
        double balance = 1000 + (rand.nextDouble() * 4000); 
        return new BigDecimal(balance).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    private static Integer generatePin() {
        Random rand = new Random();
        return 1000 + rand.nextInt(9000);
    }
}
